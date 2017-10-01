package models.entities;

import java.util.Date;
import java.util.List;
import java.util.Set;

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
import javax.persistence.OneToMany;


@Entity
@NamedQueries({
	@NamedQuery(name="Entry.findByAll", query="SELECT e FROM Entry e"),
	@NamedQuery(name="Entry.findByCustomer", query="SELECT e FROM Entry e WHERE e.customer.idCustomer = :idCustomer")
})
public class Entry {
	
	@Id
	@GeneratedValue
	@Column(name="ID_ENTRY")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "ID_CUSTOMER_FK", referencedColumnName = "ID_CUSTOMER" )
	private Customer customer;
	
	@OneToMany(mappedBy="entry")
	private Set<EntryItem> EntryItem;
	
	@Column
	private String descriptionAdditional;
	
	@Column
	private Date dateOfRegistry;
	
	public Entry(){
	}
	
	public Entry(Customer c, double value, Product product, double quantity){
		this.customer = c;
		this.descriptionAdditional=product.getName();
	}
	
	public Long getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
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


}
