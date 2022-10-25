package br.com.entra21.backend.spring.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.entra21.backend.spring.projeto.model.Personagem;


public interface IPersonagemRepository extends JpaRepository<Personagem, Integer>{

	@Query("From Personagem Where nome_heroi = :nomeHeroiParam and nome_real = :nomeRealParam")
	Personagem login(@Param("nomeHeroiParam") String nome_heroi, @Param("nomeRealParam") String nome_real);
}
