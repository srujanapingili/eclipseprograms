package com.logic.tek;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class Test extends AbstractAnnotationConfigDispatcherServletInitializer {

	   @Override
	   protected Class<?>[] getRootConfigClasses() {
	      return new Class[] {};
	   }

	   @Override
	   protected Class<?>[] getServletConfigClasses() {
	      return new Class[] { Dispatcher.class };
	   }

	   @Override
	   protected String[] getServletMappings() {
	      return new String[] { "/" };
	   }
}


