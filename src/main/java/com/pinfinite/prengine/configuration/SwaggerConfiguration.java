package com.pinfinite.prengine.configuration;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;



@Configuration
public class SwaggerConfiguration {

	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.any())              
	          .paths(PathSelectors.any())                        
	          .build().apiInfo(getApiInfo());                                           
	    }
	
	 public ApiInfo getApiInfo() {
		return  new ApiInfo("SRengine API","This is the document for API " , "1.0", 
				"SRengine.com", new Contact("xyz", "xyz", "xyz"), "SRengine", "SRengine", new ArrayList<VendorExtension>());
       
	}
}
