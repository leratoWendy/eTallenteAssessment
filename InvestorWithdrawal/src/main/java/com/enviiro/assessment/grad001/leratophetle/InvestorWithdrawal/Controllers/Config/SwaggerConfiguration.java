package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Controllers.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(SpringDataRestConfiguration.class)
public class SwaggerConfiguration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .description("Investor Withdrawal API automate the withdrawal notice process for the investors.")
                        .title("Withdrawal API")
                        .version("1.0.0")
                        .build())
                .enable(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.controllers"))
                .paths(PathSelectors.any())
                .build();
    }
}
