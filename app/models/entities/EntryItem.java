package models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EntryItem {
	
	@Id
	@GeneratedValue
	@Column(name = "ID_ENTRY_ITEM")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "ID_ENTRY_FK", nullable=false)
	private Entry entry;
	
	@ManyToOne
	private Product product;
	
	
	@Column
	private Integer itemPrice;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Entry getEntry() {
		return entry;
	}

	public void setEntry(Entry entry) {
		this.entry = entry;
	}
	


}
