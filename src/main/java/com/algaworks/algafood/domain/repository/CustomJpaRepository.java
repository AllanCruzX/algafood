package com.algaworks.algafood.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CustomJpaRepository<T, ID> extends JpaRepository<T, ID> {
	// Interface Generica customizada
	// @NoRepositoryBean - para o inspring não levar em conta para fim de intaciação
	// para spring data JPA(O spring não deve implementa uma intaciação para essa
	// interface).

	Optional<T> buscarPrimeiro();

	void detach ( T entity);
}
