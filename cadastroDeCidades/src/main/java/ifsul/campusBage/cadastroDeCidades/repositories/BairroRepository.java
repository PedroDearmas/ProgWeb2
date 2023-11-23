package ifsul.campusBage.cadastroDeCidades.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ifsul.campusBage.cadastroDeCidades.models.Bairro;

public interface BairroRepository extends CrudRepository<Bairro, Long> {
    	List<Bairro> findAll();
    	@Query(value = "SELECT * FROM public.bairro ORDER BY populacao DESC LIMIT 5", nativeQuery = true)	
	   		List<Bairro> listarPopulacao();
	   
	    
}