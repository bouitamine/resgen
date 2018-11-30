package com.example.activitiautomatization;

import static springfox.documentation.builders.PathSelectors.regex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

//	@Bean
//	public Docket postsApi() {
//		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
//				.apiInfo(apiInfo()).select().paths(postPaths()).build();
//	}
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.activitiautomatization"))
                 .paths(regex("/api/resgen.*"))
                 .build();
	}

//	private Predicate<String> postPaths() {
//		return or(regex("/api/posts.*"), regex("/api/resgen.*"));
//	}

//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder().title("Resource Generator API")
//				.description("Api to clean and create resource automatically")
//				.termsOfServiceUrl("http://ResGen.com")
//				.contact("amine.bouita@atos.net").license("JavaInUse License")
//				.licenseUrl("resgen@gmail.com").version("1.0").build();
//	}

}