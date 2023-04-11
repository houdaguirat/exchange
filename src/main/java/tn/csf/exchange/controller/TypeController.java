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

import tn.csf.exchange.model.Type;
import tn.csf.exchange.service.TypeService;




@RestController
//mark class as Controller  

@CrossOrigin(origins = "*")

public class TypeController {

	//autowire the TypeService class  
	@Autowired  
	TypeService ts;  

	//creating a get mapping that retrieves all the Type detail from the database   
	@GetMapping("/Type")
	private List<Type> getAllTypes()   
	{  
		return ts.getAllTypes();  
	}  

	//creating a get mapping that retrieves the detail of a specific Type  
	@GetMapping("/Type/{id}")  
	private Type getType(@PathVariable("id") int id)   
	{  
		return ts.getTypeById(id);  
	}  

	//creating a delete mapping that deletes a specified Type  
	@DeleteMapping("/Type/{id}")  
	private void deleteType(@PathVariable("id") int id)   
	{  
		ts.delete(id);
	} 

	//create new Type
	@PostMapping("/Type")  
	private int saveType(@RequestBody Type p)   
	{  
		ts.delete(0);  
		return p.getId();  
	} 

	//creating put mapping that updates the Type detail
	@PutMapping("/Type")  
	private Type update(@RequestBody  Type p)   
	{  
		ts.delete(0);  
		return p;  
	}  
}
