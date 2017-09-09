package pe.edu.upc.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entities.Client;
import pe.edu.upc.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientRepository ClientRepository;
	
	@Override
	public Client saveClient(Client client) {
		// TODO Auto-generated method stub
		return ClientRepository.save(client);
	}

	@Override
	public Client getClientById(int id) {
		// TODO Auto-generated method stub
		return ClientRepository.findOne(id);
	}

	@Override
	public void deleteClient(int id) {
		// TODO Auto-generated method stub
		ClientRepository.delete(id);
	}

	@Override
	public Iterable<Client> listAllClients() {
		// TODO Auto-generated method stub
		return ClientRepository.findAll();
	}


	@Override
	public Client login(String email, String password) {
		// TODO Auto-generated method stub
		return ClientRepository.login(email, password);
	}



}
