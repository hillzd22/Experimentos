package pe.edu.upc.service;


import pe.edu.upc.entities.Client;

public interface ClientService {
	Client saveClient(Client client);
	
	Client getClientById(int id);
	
	void deleteClient(int id);

	Iterable<Client> listAllClients();

	Client login(String email, String password);

}
