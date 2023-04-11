package tn.csf.exchange.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.csf.exchange.model.Marque;
import tn.csf.exchange.service.MarqueService;




//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class MarqueController {

	//autowire the MarqueService class  
	@Autowired  
	MarqueService ms;  

	//creating a get mapping that retrieves all the Marque detail from the database   
	@GetMapping("/Marque")
	private List<Marque> getAllMarques()   
	{  
		return ms.getAllMarques();  
	}  

	//creating a get mapping that retrieves the detail of a specific Marque  
	@GetMapping("/Marque/{id}")  
	private Marque getMarque(@PathVariable("id") int id)   
	{  
		return ms.getMarqueById(id);  
	}  

	//creating a delete mapping that deletes a specified Marque  
	@DeleteMapping("/Marque/{id}")  
	private void deleteMarque(@PathVariable("id") int id)   
	{  
		ms.delete(id);
	} 

	//create new Marque
	@PostMapping("/Marque")  
	private int saveMarque(@RequestBody Marque c)   
	{  
		ms.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the Marque detail
	@PutMapping("/Marque")  
	private Marque update(@RequestBody  Marque c)   
	{  
		ms.saveOrUpdate(c);  
		return c;  
	}  
}
