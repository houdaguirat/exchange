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
	@JoinColumn(name="idMarque", referencedColumnName="id")
	private Marque marque;
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
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", name=" + name + ", annee=" + annee + ", marque=" + marque + "]";
	}
	
	
	

}
