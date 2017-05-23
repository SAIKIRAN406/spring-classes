/**
 * 
 */
package com.doj.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import com.doj.app.repository.AccountRepository;
import com.doj.app.repository.IAccountRepository;
import com.doj.app.service.AccountService;
import com.doj.app.service.TransferService;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@ComponentScan(basePackages={"com.doj.app.repository"})
@ImportResource("spring.xml")
@Import(InfrastructureConfig.class)
public class AppConfig {
	
	@Bean
	@Scope("singleton")
	public IAccountRepository accountRepository(){
		System.out.println("Calling accountRepository()");
		return new AccountRepository();
	}
	
	@Bean
	public TransferService transferService(){
		System.out.println("1st call");
		return new TransferService(accountRepository());//1st call
	}
	
	@Bean
	public AccountService accountService(){
		System.out.println("2nd call");
		return new AccountService(accountRepository());//2nd call
	}
	
}
