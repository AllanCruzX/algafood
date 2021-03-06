package com.algaworks.algafood.api;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ResourceUriHelper {
	
	// classe que adicionar a uri no cabeçalho location 

	public static void addUriInResponseHeader(Object resourceId) {
	
	//	ServletUriComponentBuilder – Classe que ajuda criar um URI usando as informações da requisição atual.

		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
			.path("/{id}")
			.buildAndExpand(resourceId).toUri();
		
		HttpServletResponse response = ((ServletRequestAttributes) 
				RequestContextHolder.getRequestAttributes()).getResponse();
		
		//HTTPServeletResponse -  Aparti dele podemos adicionar qualquer coisa no cabeçalho da requisição.
		response.setHeader(HttpHeaders.LOCATION, uri.toString());
	}
	
}
