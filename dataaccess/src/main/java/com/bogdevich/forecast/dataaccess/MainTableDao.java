package com.bogdevich.forecast.dataaccess;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.bogdevich.forecast.dataaccess.filter.MainTableFilter;
import com.bogdevich.forecast.datamodel.MainTable;

public interface MainTableDao extends AbstractDao<MainTable, Long, MainTableFilter>{

	List<MainTable> getRecordsSorted(MainTableFilter filter);

}