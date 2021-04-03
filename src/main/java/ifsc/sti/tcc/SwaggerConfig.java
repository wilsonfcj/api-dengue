package ifsc.sti.tcc;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {

	@Bean
	public Docket productAPI() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("ifsc.sti.tcc")).paths(PathSelectors.regex("/api.*")).build()
				.apiInfo(createMetaInfo());

	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("*");
	}

	private ApiInfo createMetaInfo() {
		ApiInfo lApiInfo = new ApiInfo("API REST STI", "API REST Focos de dengue", "1.0",
				"Uso restrito para estudantes", new Contact("Trabalho de Computação Urbana", "", ""),
				"Chefe Apache License Version 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());
		return lApiInfo;
	}

}
