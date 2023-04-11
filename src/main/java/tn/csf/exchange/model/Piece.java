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

public class Piece {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String name;	
	@Column  
	private double price;
	@Column  
	private double quantity;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="idType", referencedColumnName="id")
	private Type type;   
	
	
@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", price=" + price+", quantity= + quantity ]";
	}



public int getId() {
		return id;
	}



	public double getQuantity() {
	return quantity;
}



public void setQuantity(double quantity) {
	this.quantity = quantity;
}



public Type getType() {
	return type;
}



public void setType(Type type) {
	this.type = type;
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



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}





}
