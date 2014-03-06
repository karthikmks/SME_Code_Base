package com.bfp.test;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendEmail {

	public static void main(String[] args) {
		 
		final String username = "";
		final String password = "";
 
		Properties props = new Properties();
		props.put("mail.smtp.host", "10.5.100.30");
		props.put("mail.smtp.port", 25);
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("tiruppathir@virtusa.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("tiruppathir@virtusa.com"));
			message.setSubject("Testing Subject");
			message.setText("Test Email");
			Transport.send(message);
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	
}