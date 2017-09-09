package pe.edu.upc.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.entities.Client;

@Repository
@Transactional
public interface ClientRepository extends CrudRepository<Client, Integer> {

	
	@Query("SELECT c FROM Client c WHERE c.email like ?1 and AES_DECRYPT(c.password,llave) like ?2")
	Client login(String email, String password);

}
