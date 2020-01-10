package com.example.security.security_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ToDoSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure (AuthenticationManagerBuilder auth )
		        throws  Exception  {
		
		auth.inMemoryAuthentication()
		    .passwordEncoder( passwordEncoder()  )
				.withUser("apress"  )
				.password( passwordEncoder().encode("springboot2") )
				.roles( "ADMIN", "USER" );
	
	}
	//@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
