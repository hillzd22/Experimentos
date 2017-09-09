package pe.edu.upc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pe.edu.upc.entities.Client;
import pe.edu.upc.service.ClientService;

@Controller
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value="/client/new")
	public String newClient(Model mod){
		 mod.addAttribute("client", new Client());
		return "NewClient";
	}

	@RequestMapping(value = "/client", method = RequestMethod.POST)
	public String saveNewClient(Model model, @Valid Client client, BindingResult result) {
	
		try {

			if (result.hasErrors()) {
				model.addAttribute("message", result.toString());
				return "NewClient";
			}
			 clientService.saveClient(client);
			model.addAttribute("message", "Guardado Exitoso");
			return "redirect:/clients";
			

		} catch (Exception e) {

			
			model.addAttribute("message", e.getMessage());
			return "NewClient";
		}

	}
	
	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	public String clients(Model model) {
		model.addAttribute("clients",  clientService.listAllClients());
		return "hClient";
	}
	
	@RequestMapping(value = "/clients", method = RequestMethod.POST)
	public String buscarclients(Model model, @RequestParam int id) {

		model.addAttribute("clients", clientService.getClientById(id));
		return "hClient";
		
	}
	
	@RequestMapping(value = "/client/{id}", method = RequestMethod.GET)
	public String viewClient(@PathVariable int id, Model model) {
		model.addAttribute("client", clientService.getClientById(id));
		return "ViewClient";
	}


	@RequestMapping(value = "/client/edit/{id}", method = RequestMethod.GET)
	public String editClient(@PathVariable int id, Model model) {

		model.addAttribute("client", clientService.getClientById(id));

		return "EditClient";
	}

	@RequestMapping(value = "/client/delete/{id}", method = RequestMethod.GET)
	public String deleteClient(@PathVariable int id) {
		clientService.deleteClient(id);
		return "redirect:/clients";
	}

}