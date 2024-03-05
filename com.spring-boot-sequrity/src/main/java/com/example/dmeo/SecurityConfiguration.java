package com.example.dmeo;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
@Override

protected AuthenticationManager (authenticationManagerBuilder auth) throws Exception {
	// TODO Auto-generated method stub
	return super.authenticationManager();
}
}
