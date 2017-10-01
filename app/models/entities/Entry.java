package models.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
@NamedQueries({
	@NamedQuery(name="Entry.findByAll", query="SELECT e FROM Entry e"),
	@NamedQuery(name="Entry.findByCustomer", query="SELECT e FROM Entry e WHERE e.customer.idCustomer = :idCustomer")
})
public class Entry {
	
	private Long id;
	private Customer customer;
	private Set<Item> items = new HashSet<Item>(0);
	private String descriptionAdditional;
	private Date dateOfRegistry;
	
	public Entry(){
	}
	
	public Entry(Customer c, Set<Item> items){
		this.customer = c;
		this.items = items;
	}
	
	@Id
	@GeneratedValue
	@Column(name="ENTRY_ID")
	public Long getId() {
		return id;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	public Customer getCustomer() {
		return customer;
	}
	
	public String getDescription() {
		return descriptionAdditional;
	}

	public void setDescription(String descriptionAdditional) {
		this.descriptionAdditional = descriptionAdditional;
	}
	
	@Column
	public Date getDateOfRegistry() {
		return dateOfRegistry;
	}

	public void setDateOfRegistry(Date dateOfRegistry) {
		this.dateOfRegistry = dateOfRegistry;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ENTRY_ITEM", joinColumns = { @JoinColumn(name = "ENTRY_ID") }, inverseJoinColumns = { @JoinColumn(name = "ITEM_ID" )})
	public Set<Item> getitems() {
		return items;
	}

	public void setitems(Set<Item> items) {
		this.items = items;
	}
	
	@Column
	public String getDescriptionAdditional() {
		return descriptionAdditional;
	}

	public void setDescriptionAdditional(String descriptionAdditional) {
		this.descriptionAdditional = descriptionAdditional;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
