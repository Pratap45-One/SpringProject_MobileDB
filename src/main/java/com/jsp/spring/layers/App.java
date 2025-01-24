package com.jsp.spring.layers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring.layers.Controller.MobileController;




public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    	MobileController mc=ac.getBean(MobileController.class);
    	mc.addMobile();
    }
}
