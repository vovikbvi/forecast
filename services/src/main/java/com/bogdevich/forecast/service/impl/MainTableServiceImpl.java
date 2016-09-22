package com.bogdevich.forecast.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bogdevich.forecast.dataaccess.MainTableDao;
import com.bogdevich.forecast.dataaccess.filter.MainTableFilter;
import com.bogdevich.forecast.datamodel.MainTable;
import com.bogdevich.forecast.service.MainTableService;

@Service
public class MainTableServiceImpl implements MainTableService {

	@Inject
	private MainTableDao mainTableDao;

	@Override
	public void insert(MainTable mainTable) {
		mainTableDao.insert(mainTable);
	}

	@Override
	public void update(MainTable mainTable) {
		mainTableDao.update(mainTable);
	}

	@Override
	public void delet(Long id) {
		mainTableDao.delete(id);
	}

	@Override
	public MainTable get(Long id) {
		return mainTableDao.get(id);
	}

	@Override
	public List<MainTable> getRecordSorted(MainTableFilter filter) {
		return mainTableDao.getRecordsSorted(filter);
	}

	@Override
	public Long count(MainTableFilter filter) {
		return mainTableDao.count(filter);
	}
}
