package com.algaworks.algafood.api.v1.model;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

//@ApiModel(value = "Cidade", description = "Representa uma cidade") // Para mudar nome na documentação
@Relation(collectionRelation = "cidades")// para mudar nome da colecao no hateoas
@Setter
@Getter
public class CidadeModel extends RepresentationModel<CidadeModel> {
	//RepresentationModel - adicionando HETOAS no projeto
	
//	@ApiModelProperty(value = "ID da cidade", example = "1") // Para mudar propriedade na documentação
	@ApiModelProperty(example = "1")
    private Long id;
	@ApiModelProperty(example = "Uberlândia")
    private String nome;
	
    private EstadoModel estado;
    
}  