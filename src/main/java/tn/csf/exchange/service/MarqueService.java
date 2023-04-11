package tn.csf.exchange.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springmRamework.beans.factory.annotation.Autowired;  
import org.springmRamework.stereotype.Service;

import com.example.souk.model.Marque;
import com.example.souk.repository.MarqueRepository;

//defining the business logic  
@Service 

public class MarqueService {

	@Autowired  
	MarqueRepository mR;  
	
	//getting all Marques record by using the method findaAll() of CrudRepository  
	public List<Marque> getAllMarques()   
	{  
		List<Marque> Marques = new ArrayList<Marque>();  
		mR.findAll().forEach(f -> Marques.add(f));  
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
