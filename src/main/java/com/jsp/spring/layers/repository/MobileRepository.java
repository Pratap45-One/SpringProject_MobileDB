package com.jsp.spring.layers.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.jsp.spring.layers.entity.Mobile;

@Repository
public class MobileRepository {
 EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql-config");
 public void addMobile(Mobile mobile) {
	 EntityManager em= emf.createEntityManager();
	 EntityTransaction et =em.getTransaction();
	 et.begin();
	 em.persist(mobile);
	 et.commit();
	 em.close();
	 
 }
 public Mobile findMobileById(int mobileId) {
	 EntityManager em= emf.createEntityManager();
	 EntityTransaction et =em.getTransaction();
	 et.begin();
	 Mobile mobile=em.find(Mobile.class, mobileId);
	 et.commit();
	 em.close();
	return mobile;
 }
 public Mobile deleteMobileById(int mobileId) {
	 EntityManager em= emf.createEntityManager();
	 EntityTransaction et =em.getTransaction();
	 et.begin();
	 Mobile mobile=em.find(Mobile.class, mobileId);
	 if (mobile!=null) {
		 em.remove(mobile);
	 }
	 
	 et.commit();
	 em.close();
	return mobile;
 }
 public Mobile updateMobileById(Mobile mobileId) {
	 EntityManager em= emf.createEntityManager();
	 EntityTransaction et =em.getTransaction();
	 et.begin();
	 Mobile mobile=em.merge(mobileId);
	 
	 
	 et.commit();
	 em.close();
	return mobile;
}
 public List <Mobile> findAllMobile() {
	 EntityManager em= emf.createEntityManager();
	 CriteriaBuilder cb=em.getCriteriaBuilder();
	 CriteriaQuery<Mobile>createQuery= cb.createQuery(Mobile.class);
	 Root<Mobile>root=createQuery.from(Mobile.class);
	 List<Mobile> mobiles =em.createQuery(createQuery).getResultList();
	 
	 
	 
	 
	
	 em.close();
	return mobiles;
}
}
