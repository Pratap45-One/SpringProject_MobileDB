package com.jsp.spring.layers.service;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring.layers.entity.Mobile;
import com.jsp.spring.layers.repository.MobileRepository;

@Service
public class MobileService {
	Scanner sc=new Scanner(System.in);
	@Autowired
	private MobileRepository  mobileRepository;
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql-config");

	public void addMobile() {
		
		Mobile m=new Mobile();
		System.out.println("enter mobile id");
		m.setMobileid(sc.nextInt());
		System.out.println("enter mobile model");
		m.setMobileModel(sc.next());
		System.out.println("enter mobile Brand");
		m.setMobileBrand(sc.next());
		System.out.println("enter mobile price");
		m.setMobilePrice(sc.nextInt());
		
		mobileRepository.addMobile(m);
		System.out.println("data inserted");
		
	}
	public void findMobileById() {
		System.out.println("enter id to find");
		Mobile mobile=mobileRepository.findMobileById(sc.nextInt());
		if(mobile!=null) {
			System.out.println("Mobile found Sucessfully");
			System.out.println(mobile);
			
		}else
		{
			System.out.println("Mobile not found");
		}
	}
	public void deleteMobileById() {
		System.out.println("enter id to find");
		Mobile mobile=mobileRepository.deleteMobileById(sc.nextInt());
		if(mobile!=null) {
			System.out.println("Mobile deleted Sucessfully");
			
		}else
		{
			System.out.println("Mobile not found");
		}
		
	}
	public void updateMobileById() {
		System.out.println("enter id to find");
		int mobileId=sc.nextInt();
		Mobile mobile=mobileRepository.findMobileById(mobileId);
		if(mobile!=null) {
			System.out.println("enter mobile model");
			mobile.setMobileModel(sc.next());
			System.out.println("enter mobile Brand");
			mobile.setMobileBrand(sc.next());
			System.out.println("enter mobile price");
			mobile.setMobilePrice(sc.nextInt());
			
			mobileRepository.updateMobileById(mobile);
			System.out.println("update sucessfully");
			
		}else
		{
			System.out.println("Mobile not found");
		}
		
	}
	public void findAllMobile() {
		List<Mobile>mobiles=mobileRepository.findAllMobile();
		if(mobiles.isEmpty()) {
			System.out.println("No Mobile ");
			
		}else
		{
			System.out.println("list of number");
			for(Mobile mobile:mobiles) {
				System.out.println(mobile);
			}
		}
	}
	
}
