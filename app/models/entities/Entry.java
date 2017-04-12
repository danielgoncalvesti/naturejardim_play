package models.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({
	@NamedQuery(name="Entry.findByAll", query="SELECT e FROM Entry e"),
	@NamedQuery(name="Entry.findByCustomer", query="SELECT e FROM Entry e WHERE e.customer.idCustomer = :idCustomer")
})
public class Entry {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "ID_CUSTOMER_FK", referencedColumnName = "ID_CUSTOMER" )
	private Customer customer;
	
	@ManyToOne
	private Product product;
	
	@Column
	private double value;
	
	@Column
	private String descriptionAdditional;
	
	@Column
	private Date dateOfRegistry;
	
	@Column
	private double quantity;
	
	public Entry(){
	}
	
	public Entry(Customer c){
		this.customer = c;
	}
	
	public Entry(Customer c, double value, boolean credit){
		
	}
	
	public Long getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getValue() {
		return value;
	}
	
	public String getDescription() {
		return descriptionAdditional;
	}

	public void setDescription(String descriptionAdditional) {
		this.descriptionAdditional = descriptionAdditional;
	}

	public Date getDateOfRegistry() {
		return dateOfRegistry;
	}

	public void setDateOfRegistry(Date dateOfRegistry) {
		this.dateOfRegistry = dateOfRegistry;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void discountValue(Customer c, Product p, double quantity, Date date){
		 this.customer = c;
		 this.product = p;
		 this.value = (quantity * p.getProductCost()) *-1;
		 this.quantity = quantity;		
		 this.dateOfRegistry = date;
		
	}
	
	public void addPaymentCustomer(Customer c, double payment, Date date){
		this.customer = c;
		this.value = payment;
		this.dateOfRegistry = date;
	}
	
	
	


	

	
}
