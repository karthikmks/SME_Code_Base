package com.bfp.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author tiruppathir
 *
 */
public class BeanHouse implements ApplicationContextAware {

	/**
	 * 
	 */
	private static final Log log = LogFactory.getLog(BeanHouse.class);

	/**
	 * 
	 */
	private static ApplicationContext context;

	
	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	public void setApplicationContext(ApplicationContext contextRef) throws BeansException {
		context = contextRef;
		log.info("Application Context reference set to the BeanHouse");
	}

	/**
	 * @param beanId
	 * @return
	 */
	public static Object getBeanRef(String beanId) {
		if(context != null)
			return context.getBean(beanId);
		else 
			return null;
	}


}
