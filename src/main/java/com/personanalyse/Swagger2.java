/**
* @author phil(jianytan@amd.com)
* @version create-date：May 5, 2019 3:36:05 PM
* @Descprtion 
*/
package com.personanalyse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
* @author phil(jianytan@amd.com)
* @version create-date：May 5, 2019 3:36:05 PM
* @Descprtion 
*/
@Configuration
@EnableSwagger2
public class Swagger2 {
	@Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.personanalyse.controller"))
                .paths(PathSelectors.any())
                .build();
    }
 
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("AMD DID Common MicroServices")
                .description("--------------------------------")
                .version("0.0.1")
                .build();
    }
}
