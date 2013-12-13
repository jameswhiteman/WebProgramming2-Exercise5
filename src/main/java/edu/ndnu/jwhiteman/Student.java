/**
@author James Whiteman

A model class, associating all the elements
that compose a student.
*/

package edu.ndnu.jwhiteman;

import java.util.ArrayList;
import javax.persistence.*;

@Entity
public class Student
{
	// Properties
	@GeneratedValue @Id private String id;
	private String firstName;
	private String lastName;
	private String homeAddress;
	private String campusAddress;

	// Constructor
	public Student()
	{
		this.id = "";
		this.firstName = "";
		this.lastName = "";
		this.homeAddress = "";
		this.campusAddress = "";
	}

	public Student(String firstName, String lastName, String homeAddress, String campusAddress)
	{
		this.id = "";
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
		this.campusAddress = campusAddress;
	}

	// Setters
	public void setId(String id)
	{
		this.id = id;
	}

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
	public String getStudentId()
	{
		return id;
	}

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