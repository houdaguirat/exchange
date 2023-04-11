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





//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class TypeController {

	//autowire the TypeService class  
	@Autowired  
	TypeController tc;  

	//creating a get mapping that retrieves all the Type detail from the database   
	@GetMapping("/Type")
	private List<Type> getAllTypes()   
	{  
		return tc.getAllTypes();  
	}  

	//creating a get mapping that retrieves the detail of a specific Type  
	@GetMapping("/Type/{id}")  
	private Type getType(@PathVariable("id") int id)   
	{  
		return tc.getType(id);  
	}  

	//creating a delete mapping that deletes a specified Type  
	@DeleteMapping("/Type/{id}")  
	private void deleteType(@PathVariable("id") int id)   
	{  
		tc.deleteType(id);
	} 

	//create new Type
	@PostMapping("/Type")  
	private int saveType(@RequestBody Type p)   
	{  
		tc.update(p);  
		return p.getId();  
	} 

	//creating put mapping that updates the Type detail
	@PutMapping("/Type")  
	private Type update(@RequestBody  Type p)   
	{  
		tc.update(p);  
		return p;  
	}  
}
