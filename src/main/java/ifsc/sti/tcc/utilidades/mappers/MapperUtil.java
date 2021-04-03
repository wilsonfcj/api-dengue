package ifsc.sti.tcc.utilidades.mappers;

import java.util.ArrayList;
import java.util.List;

public abstract class MapperUtil<From, To> {

    protected abstract To transform(From aObject);
   
    public List<To> transform(List<From> aFromList) {
        List<To> lList = new ArrayList<>();
        for (From lFrom : aFromList) {
            lList.add(transform(lFrom));
        }
        return lList;
    }
    
}
