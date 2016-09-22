package com.bogdevich.forecast.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bogdevich.forecast.dataaccess.filter.MainTableFilter;
import com.bogdevich.forecast.datamodel.MainTable;

public interface MainTableService {

	@Transactional
	void insert(MainTable mainTable);

	@Transactional
	void update(MainTable mainTable);

	@Transactional
	void delet(Long id);

	MainTable get(Long id);

	List<MainTable> getRecordSorted(MainTableFilter filter);

	Long count(MainTableFilter filter);

}