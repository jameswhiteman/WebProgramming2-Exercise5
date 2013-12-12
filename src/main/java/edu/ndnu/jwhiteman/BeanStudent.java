/**
@author James Whiteman

This class keeps track of the current user's info on
the voter registration page, ultimately submitting it
to the BeanVoterCount managed bean.
*/

package edu.ndnu.jwhiteman;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.inject.Inject;

@Named("beanStudent")
@RequestScoped
public class BeanStudent implements Serializable
{
	// Properties
	private String firstName;
	private String lastName;
	private String homeAddress;
	private String campusAddress;

	// Constructor
	public BeanStudent()
	{
		this.firstName = "";
		this.lastName = "";
		this.homeAddress = "";
		this.campusAddress = "";
	}

	// Main Methods
	public String addStudent()
	{
		Student student = new Student(firstName, lastName, homeAddress, campusAddress);
		DatabaseOperator operator = new DatabaseOperator();
		operator.saveStudent(student);
		return "add";
	}

	// Setters
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setHomeAddress(String homeAddress)
	{
		this.homeAddress = homeAddress;
	}

	public void setCampusAddress(String campusAddress)
	{
		this.campusAddress = campusAddress;
	}

	// Getters
	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getHomeAddress()
	{
		return homeAddress;
	}

	public String getCampusAddress()
	{
		return campusAddress;
	}
}