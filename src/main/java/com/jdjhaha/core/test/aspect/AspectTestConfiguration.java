package com.jdjhaha.core.test.aspect;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.jdjhaha.core.test.aspect")
@EnableAspectJAutoProxy
public class AspectTestConfiguration {
	
}
