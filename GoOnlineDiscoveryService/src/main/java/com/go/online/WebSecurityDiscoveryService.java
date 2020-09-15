package com.go.online;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityDiscoveryService extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 http
		 .csrf()
		 .disable()
		 .authorizeRequests()
		 .anyRequest()
		 .authenticated()
		 .and().httpBasic();
	}
}
