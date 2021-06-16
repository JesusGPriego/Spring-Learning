package mycrud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mycrud.dao.ClientDAO;
import mycrud.entity.Client;

@Controller
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientDAO clientDAO;
	
	@RequestMapping("/list")
	public String goToList(Model model) {
		
		List<Client> clients = clientDAO.getClients();
		
		model.addAttribute("clients", clients);
		
		return "client-list";
	}
	
	@RequestMapping("/clientForm")
	public String clientForm(Model model) {
		
		//Client data bind:
		
		Client client = new Client();
		model.addAttribute("client", client);
		
		return "client-form";
	}
	
	@PostMapping("/insertedClient")
	public String insertedClient(@Valid @ModelAttribute("client")Client client, BindingResult validationResult) {
		
		//Insert client in bbdd:
		
		
		if(validationResult.hasErrors()) {
			return "client-form";
		}else {
			clientDAO.insertClient(client);
			return "redirect:/client/list";
		}
	}
	
	
	@GetMapping("/clientUpdateForm")
	public String clientUpddateForm(@RequestParam("clientId") int id, Model model) {
		
		//Get cilent throug id
		
		Client client = clientDAO.getClient(id);
		
		//set client as model attribute
		
		model.addAttribute("client", client);
		
		//send data to form
		return "client-update-form";
	}
	
	@PostMapping("/updatedClient")
	public String updatedClient(@Valid @ModelAttribute("client")Client client, BindingResult validationResult) {
		
		//Insert client in bbdd:
		
		
		if(validationResult.hasErrors()) {
			return "client-update-form";
		}else {
			clientDAO.updateClient(client);
			return "redirect:/client/list";
		}
	}
	
	@GetMapping("/deleteClient")
	public String deleteClient(@RequestParam("clientId") int id) {
		
		clientDAO.delete(id);
		
		return "redirect:/client/list";
		
	}
	
}
