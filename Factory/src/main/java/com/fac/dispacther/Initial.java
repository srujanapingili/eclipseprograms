package com.fac.dispacther;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.fac.definition.Define;

public class Initial extends AbstractAnnotationConfigDispatcherServletInitializer {
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
