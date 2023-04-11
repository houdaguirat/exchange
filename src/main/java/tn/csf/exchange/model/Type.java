package tn.csf.exchange.model;


import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;  
 
@Entity  

@Table  

public class Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String name;	
	@Column  
	private double annee;
	@ManyToOne(optional=false)
	@JoinColumn(name="idPiece", referencedColumnName="id")
	private Piece piece;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAnnee() {
		return annee;
	}
	public void setAnnee(double annee) {
		this.annee = annee;
	}
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
	}   
	

}
