package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{
	
	List<Cliente> findByTipo(int tipo);
	List<Cliente> findByTipoAndObservacaoContaining(int tipo, String observacao);
	Long countByInativo(boolean inativo);
	@Query("select c from Cliente c where c.genero = :genero and c.inativo = false")
	List<Cliente> findAtivosGenero(@Param("genero") int genero);

}
