package dao;

import java.util.List;

import models.entities.Entry;

public interface IEntryDAO {
	void add(Entry e);
	List<Entry> findByCustomer(Long id);
}
