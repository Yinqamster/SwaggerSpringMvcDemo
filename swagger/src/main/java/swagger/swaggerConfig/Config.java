package swagger.swaggerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class Config extends WebMvcConfigurerAdapter{
    @Bean
    public Docket myDocket() {

        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket
        .apiInfo(apiInfo())
//        .useDefaultResponseMessages(false)
        .select()
        .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
        .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
        .build();
        return docket;
    }
    
    
    private ApiInfo apiInfo() {
    	return new ApiInfoBuilder()
    			.title("swagger-API")
    			.description("test swagger api")
                .contact(new Contact("myName", "", "qi.yin@amberaigroup.com"))
                .license("").licenseUrl("")
                .version("1.0.0").build();
    }
    
    
    /**
     * swagger-ui.html路径映射，浏览器中使用/api-docs访问
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/api-docs","/swagger-ui.html");
    }

}