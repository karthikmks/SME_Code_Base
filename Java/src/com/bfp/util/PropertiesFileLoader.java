package com.bfp.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * @author tiruppathir
 *
 */
public class PropertiesFileLoader extends PropertyPlaceholderConfigurer {

	private List<String> encryptionKeys = new ArrayList<String>();

	private Properties properties = null;
	
	PropertiesFileLoader(){

	}

	protected void convertProperties(Properties props) {
		Enumeration<?> propertyNames = props.propertyNames();
		while (propertyNames.hasMoreElements()) {
			String propertyName = (String) propertyNames.nextElement();
			String propertyValue = props.getProperty(propertyName);
			/*String convertedValue = convertPropertyValue(propertyName, propertyValue);
			if (!ObjectUtils.nullSafeEquals(propertyValue, convertedValue)) {
				props.setProperty(propertyName, convertedValue);
			}*/
		}
		this.properties = props;
	}

	protected String convertPropertyValue(String originalValue) {
		return originalValue;
	}

	public void setEncryptionKeys(List<String> encryptionKeys) {
		this.encryptionKeys = encryptionKeys;
	}

	public List<String> getEncryptionKeys() {
		return this.encryptionKeys;
	}

	public Properties getProperties() {
		return this.properties;
	}
	
}
