package com.algaworks.algafood.core.web;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.ShallowEtagHeaderFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
		
	@Bean
	public Filter shallowEtagHeaderFilter() {
		//configurar cache com Etag
		//filtro gera um rest da requisição e coloca o cabecalho etag
		return new ShallowEtagHeaderFilter();
	}
	
}
