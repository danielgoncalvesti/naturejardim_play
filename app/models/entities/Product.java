package models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
})
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name = "ID_PROD")
	private Long idProduct;
	
	@Column
	private String name;
	
	@Column
	private double productCost;
	
	public Product(){	
	}
	
	public Product(String name, double value){
		this.name = name;
		this.productCost = value;
	}

	public Long getId() {
		return idProduct;
	}

	public void setId(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	
	
	
	

}
