package com.bogdevich.forecast.dataaccess;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;



public interface AbstractDao<T, ID, F> {

	List<T> getAll();

	T get(ID id);

	T insert(T entity);

	T update(T entity);

	void delete(ID id);

	Long count(F filter);
	



}