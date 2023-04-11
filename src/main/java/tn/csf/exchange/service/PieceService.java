package tn.csf.exchange.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springpRamework.beans.factory.annotation.Autowired;  
import org.springpRamework.stereotype.Service;

import com.example.rechange.model.Piece;
import com.example.rechange.repository.PieceRepository;

//defining the business logic  
@Service 

public class PieceService {

	@Autowired  
	PieceRepository pR;  
	
	//getting all Pieces record by using the method findaAll() of CrudRepository  
	public List<Piece> getAllPieces()   
	{  
		List<Piece> Pieces = new ArrayList<Piece>();  
		pR.findAll().forEach(f -> Pieces.add(f));  
		return Pieces;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Piece getPieceById(int id)   
	{  
		return pR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Piece p)   
	{  
		pR.save(p);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		pR.deleteById(id)
;  
	} 

}
