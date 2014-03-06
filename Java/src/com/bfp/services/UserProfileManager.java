package com.bfp.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bfp.valueobjects.UserProfileVO;

/**
 * @author tiruppathir
 *
 */
public class UserProfileManager {
	
	
	/**
	 * 
	 */
	private static final Log log = LogFactory.getLog(UserProfileManager.class);

	/**
	 * @param userId
	 * @return
	 */
	public static UserProfileVO retrieveUserProfile(String userId) {
		log.info("Method entry : UserProfileManager.retrieveUserProfile");
		UserProfileVO user = null;
		if(userId != null) {
			
		}
		return user;
	}
	
	
}