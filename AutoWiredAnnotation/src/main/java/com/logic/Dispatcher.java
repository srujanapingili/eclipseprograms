package com.logic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class Dispatcher extends AbstractAnnotationConfigDispatcherServletInitializer {
		@Override
		protected Class<?>[] getRootConfigClasses() {
			return new Class[] {};
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			return new Class[] { Define.class };
		}

		@Override
		protected String[] getServletMappings() {
			return new String[] { "/" };
		}

}
