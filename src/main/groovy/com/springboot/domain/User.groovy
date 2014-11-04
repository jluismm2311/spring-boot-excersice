package com.springboot.domain

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="user_tb")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  @NotNull
  @Size(min=3, max=100)
  String name;

  @NotNull
  @Size(min=3, max=100)
  String firstSurname;

  @Size(min=3, max=100)
  String secondSurname;

  @NotNull
  @Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})\$",
    message="{invalid.email}")
  @Size(max=120)
  String email;

  @Size(max=20)
  @Pattern(regexp = "^\\d+\$")
  String phone;

  String companyId;

  @NotNull
  @Size(min=6, max=50)
  String password;

  boolean emailValidated;

  boolean accountLocked;

  boolean passwordExpired;

  @Size(min=5, max=30)
  String organizations_url;

}
