package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan({"com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.controllers",
"com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.services"})
@EntityScan("com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.entities")
@EnableJpaRepositories("com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.repositories")
@SpringBootApplication
public class InvestorWithdrawalApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestorWithdrawalApplication.class, args);
	}

}
