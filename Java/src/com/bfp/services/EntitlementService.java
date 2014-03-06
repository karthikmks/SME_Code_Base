package com.bfp.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author tiruppathir
 *
 */
public class EntitlementService {
	
	private static final Log log = LogFactory.getLog(EntitlementService.class);

	/**
	 * 
	 */
	private DatabaseService databaseService;

	/**
	 * @return the databaseService
	 */
	public DatabaseService getDatabaseService() {
		return databaseService;
	}

	/**
	 * @param databaseService the databaseService to set
	 */
	public void setDatabaseService(DatabaseService databaseService) {
		this.databaseService = databaseService;
	}
	
}