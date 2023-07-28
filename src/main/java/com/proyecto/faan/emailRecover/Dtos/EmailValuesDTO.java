package com.proyecto.faan.emailRecover.Dtos;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmailValuesDTO {

    private String mailFrom;
    private String mailTo;
    private String subject;
    private String username;
    private String jwt;
    
    //GyS
  
	public String getMailFrom() {
		return mailFrom;
	}
	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}
	public String getMailTo() {
		return mailTo;
	}
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getJwt() {
		return jwt;
	}
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	
}
