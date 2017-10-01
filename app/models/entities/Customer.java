package models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
})
public class Customer {

	  @Id
	  @GeneratedValue
	  @Column(name = "ID_CUSTOMER")
	  private Long idCustomer;

	  @Column 
	  private String name;
	  
	  @Column
	  private String address;
	  
	  @Column
	  private double contractPrice;


	  public Customer(final String name) {
	    this.name = name;
	  }
	  
	  public Customer(final String name, final String address) {
		    this.name = name;
		    this.address = address;
	  }

	  public Customer(final String name, final String address, final double contractPrice) {
		    this.name = name;
		    this.address = address;
		    this.contractPrice = contractPrice;
	  }

	  public Customer() {
	  }

	  public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	  }

	  public Long getIdCustomer() {
	    return idCustomer;
	  }
		
	  public void setName(String name) {
			this.name = name;
		}
	  
	  public String getName() {
	    return name;
	  }

	  public String getAddress() {
		return address;
	  }

	  public void setAddress(String address) {
		  this.address = address;
	  }

	public double getContractPrice() {
		return contractPrice;
	}
	
	public void setContractPrice(double contractPrice) {
		this.contractPrice = contractPrice;
	}

}
