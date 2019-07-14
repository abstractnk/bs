package com.login.index;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{

//	@Bean
//	public AuthenticationProvider authProvider()
//	{
//		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		
//		return provider;
//	}
	
	
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		
		List<UserDetails> users = new ArrayList<>();
		users.add(User.withDefaultPasswordEncoder().username("Nanda").password("qwerty").roles("USER").build());
		users.add(User.withDefaultPasswordEncoder().username("Kishore").password("qwerty").roles("USER").build());
		users.add(User.withDefaultPasswordEncoder().username("Jibin").password("qwerty").roles("USER").build());

		return new InMemoryUserDetailsManager(users);
	}
	
	

}
