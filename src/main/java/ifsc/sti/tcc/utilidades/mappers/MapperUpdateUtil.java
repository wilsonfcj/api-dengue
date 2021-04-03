package ifsc.sti.tcc.utilidades.mappers;

import java.util.ArrayList;
import java.util.List;

public abstract class MapperUpdateUtil<From, To> {

    protected abstract To transform(From aObject);

    public List<To> transform(List<From> aFromList) {
        List<To> lList = new ArrayList<>();
        for (From lFrom : aFromList) {
            lList.add(transform(lFrom));
        }
        return lList;
    }
    
    protected abstract To transform(To aObject, From aObject2);
}
