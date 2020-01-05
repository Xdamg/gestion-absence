package com.login.login.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.* ;

@Entity
@Table(name="user")
public class Users  {
@Id
@GeneratedValue
@Column(name = "id")
private int  id ;

@Column(name = "name")
private String name ;
@Column(name = "nbr_heures")
private int nbr_heures ;

public Users( String name, int nbr_heures, String password) {
	super();
	//this.id = id;
	this.name = name;
	this.nbr_heures = nbr_heures;
	this.password = password;
}
@Column(name = "password")
private String password ;

public Users() {}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getNbr_heures() {
	return nbr_heures;
}
public void setNbr_heures(int nbr_heures) {
	this.nbr_heures += nbr_heures;
}
public Users(int nbr_heures) {
	super();
	this.nbr_heures = nbr_heures;
}

}