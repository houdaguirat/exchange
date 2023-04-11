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

import tn.csf.exchange.model.Piece;
import tn.csf.exchange.service.PieceService;




//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class PieceController {

	//autowire the PieceService class  
	@Autowired  
	PieceService ps;  

	//creating a get mapping that retrieves all the Piece detail from the database   
	@GetMapping("/Piece")
	private List<Piece> getAllPieces()   
	{  
		return ps.getAllPieces();  
	}  

	//creating a get mapping that retrieves the detail of a specific Piece  
	@GetMapping("/Piece/{id}")  
	private Piece getPiece(@PathVariable("id") int id)   
	{  
		return ps.getPieceById(id);  
	}  

	//creating a delete mapping that deletes a specified Piece  
	@DeleteMapping("/Piece/{id}")  
	private void deletePiece(@PathVariable("id") int id)   
	{  
		ps.delete(id);
	} 

	//create new Piece
	@PostMapping("/Piece")  
	private int savePiece(@RequestBody Piece p)   
	{  
		ps.saveOrUpdate(p);  
		return p.getId();  
	} 

	//creating put mapping that updates the Piece detail
	@PutMapping("/Piece")  
	private Piece update(@RequestBody  Piece p)   
	{  
		ps.saveOrUpdate(p);  
		return p;  
	}  
}
