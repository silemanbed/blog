package com.blogger.blog.service;

import java.util.List;

import com.blogger.blog.model.Entry;

public interface EntryService {

	public void addEntry(Entry entry);
	
	public Entry findEntryById(Long id);
	
	public void deleteEntry(Entry entry);
	
	public List<Entry> findAll();

	public void updateEntry(Entry entry);
}
