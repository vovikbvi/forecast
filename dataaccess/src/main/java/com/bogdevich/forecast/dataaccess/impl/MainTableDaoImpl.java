package com.bogdevich.forecast.dataaccess.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.jpa.criteria.OrderImpl;
import org.springframework.stereotype.Repository;

import com.bogdevich.forecast.dataaccess.MainTableDao;
import com.bogdevich.forecast.dataaccess.filter.MainTableFilter;
import com.bogdevich.forecast.datamodel.MainTable;

@Repository
public class MainTableDaoImpl extends AbstractDaoImpl<MainTable, Long, MainTableFilter>implements MainTableDao {

	protected MainTableDaoImpl() {
		super(MainTable.class);
	}

	@Override
	public List<MainTable> getRecordsSorted(MainTableFilter filter) {
		EntityManager em = getEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<MainTable> cq = cb.createQuery(MainTable.class);
		Root<MainTable> from = cq.from(MainTable.class);

		cq.select(from);

		handleFilterParameters(filter, cb, cq, from);

		// set fetching
		// if (filter.isSetFetchTickets()) {
		// from.fetch(UserProfile_.boughtTickets, JoinType.LEFT);
		// }

		// set sort params
		if (filter.getSortProperty() != null) {
			cq.orderBy(new OrderImpl(from.get(filter.getSortProperty()), filter.isSortOrder()));
		}

		TypedQuery<MainTable> q = em.createQuery(cq);

		// set paging
		setPaging(filter, q);

		// set execute query
		List<MainTable> allitems = q.getResultList();
		return allitems;
	}

	@Override
	public void handleFilterParameters(MainTableFilter filter, CriteriaBuilder cb, CriteriaQuery<?> cq,
			Root<MainTable> from) {
		// if (filter.getFirstName() != null) {
		// Predicate fName = cb.equal(from.get(UserProfile_.firstName),
		// filter.getFirstName());
		// Predicate lName = cb.equal(from.get(UserProfile_.lastName),
		// filter.getFirstName());
		// cq.where(cb.or(fName, lName));
		// }
		// if (filter.getLogin() !=null){
		// cq.where(cb.equal(from.get(UserProfile_.login),filter.getLogin()));
		// }

	}

}
