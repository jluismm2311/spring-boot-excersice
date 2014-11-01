package com.springboot.domain

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
  private String firstSurname;
  private String secondSurname;
  private String email;
  private String phone;
  private String companyId;
  private String password;
  private boolean emailValidated;
  private boolean accountLocked;
  private boolean passwordExpired;
  private String organizations_url;

  public String getName () {
    return  name;
  }

  public void setName (String  name) {
    this.name  = name;
  }

  public String getFirstSurname() {
		return firstSurname;
	}

	public void setFirstSurname(String firstSurname) {
		this.firstSurname  = firstSurname  ;
	}

	public String getSecondSurname () {
		return  secondSurname;
	}

	public void setSecondSurname (String secondSurname  ) {
		this.secondSurname = secondSurname;
	}

	public String getEmail () {
		return  email;
	}

	public void setEmail (String  email) {
		this.email  =  email;
	}

	public String getPhone () {
		return  phone;
	}

	public void setPhone (String  phone) {
		this.phone  =  phone;
	}

	public String getCompanyId () {
		return  companyId;
	}

	public void setCompanyId (String  companyId) {
		this.companyId  =  companyId;
	}

	public String getPassword () {
		return  password;
	}

	public void setPassword (String password) {
		this.password  =  password;
	}

	public boolean getEmailValidated () {
		return  emailValidated;
	}

	public void setEmailValidated (boolean emailValidated  ) {
		this.emailValidated  =  emailValidated;
	}

	public boolean getAccountLocked () {
		return  accountLocked;
	}

	public void setAccountLocked (boolean  accountLocked) {
		this.accountLocked  =  accountLocked;
	}

	public boolean getPasswordExpired () {
		return  passwordExpired;
	}

	public void setPasswordExpired (boolean  passwordExpired) {
		this.passwordExpired  =  passwordExpired;
	}

  public String getOrganizations_url () {
    return  organizations_url;
  }

  public void setOrganizations_url (String organizations_url) {
    this.organizations_url =  organizations_url;
  }

}
