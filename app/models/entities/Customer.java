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


	  public Customer(final String name) {
	    this.name = name;

	  }

	  public Customer() {
	  }

	  public Long getIdCustomer() {
	    return idCustomer;
	  }

	  public String getName() {
	    return name;
	  }


}
