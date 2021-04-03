package ifsc.sti.tcc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan("Controllers")
public class IndexContoller {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
