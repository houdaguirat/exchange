package tn.csf.exchange.service;

import java.util.ArrayList;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.csf.exchange.model.Marque;
import tn.csf.exchange.repository.MarqueRepository;  



@Service 

public class MarqueService {

	@Autowired  
	MarqueRepository mR;  
	
	//getting all Marques record by using the method findaAll() of CrudRepository  
	public List<Marque> getAllMarques()   
	{  
		List<Marque> Marques = new ArrayList<Marque>();  
		mR.findAll().forEach(m -> Marques.add(m));  
		return Marques;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Marque getMarqueById(int id)   
	{  
		return mR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Marque m)   
	{  
		mR.save(m);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		mR.deleteById(id)
;  
	} 

}
