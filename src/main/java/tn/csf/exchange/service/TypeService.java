package tn.csf.exchange.service;

import java.util.ArrayList;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.csf.exchange.model.Type;
import tn.csf.exchange.repository.TypeRepository;  

//defining the business logic  
@Service 

public class TypeService {

	@Autowired  
	TypeRepository tR;  
	
	//getting all Types record by using the method findaAll() of CrudRepository  
	public List<Type> getAllTypes()   
	{  
		List<Type> Types = new ArrayList<Type>();  
		tR.findAll().forEach(t -> Types.add(t));  
		return Types;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Type getTypeById(int id)   
	{  
		return tR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Type p)   
	{  
		tR.save(p);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		tR.deleteById(id)
;  
	} 

}
