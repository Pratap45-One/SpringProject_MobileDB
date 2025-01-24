package com.jsp.spring.layers.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.jsp.spring.layers.service.MobileService;

@Controller
public class MobileController {
	@Autowired
	private MobileService mobileService;
	
	public void addMobile()
	{
		mobileService.addMobile();
	}
	public void findMobileById() {
		mobileService.findMobileById();
	}
	public void deleteMobileById() {
		mobileService.findMobileById();
	}
	public void updateMobileById() {
		mobileService.findMobileById();
	}
	public void findAllMobile() {
		mobileService.findMobileById();
	}
}
