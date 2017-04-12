package dao;

import java.util.List;

import models.entities.Entry;
import play.db.jpa.JPA;

public class EntryJpaDaoImpl implements IEntryDAO{

	@Override
	public void add(Entry e) {
		JPA.em().persist(e);
	}

	@Override
	public List<Entry> findByCustomer(Long id) {
		List<Entry> listEntries = JPA.em().createNamedQuery("Entry.findByCustomer").setParameter("idCustomer", id).getResultList();	
		return listEntries;
	}

}
