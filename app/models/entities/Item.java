package models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="ITEM")
public class Item {
	
	private Long id;
//	private Entry entry;
	private Product product;
	private Double itemPrice;

	public Item(){
	}
	
	public Item(Product product, Double itemPrice){
		this.product = product;
		this.itemPrice = itemPrice;
	}
	
	@Id
	@GeneratedValue
	@Column(name = "ITEM_ID")	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	//@ManyToOne
	//@JoinColumn(name = "ID_ENTRY_FK", nullable=false)	
//	public Entry getEntry() {
//		return entry;
//	}

//	public void setEntry(Entry entry) {
//		this.entry = entry;
//	}

	@ManyToOne
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Column
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}




}
