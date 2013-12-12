/**
@author James Whiteman

This class keeps track of the current user's info on
the voter registration page, ultimately submitting it
to the BeanVoterCount managed bean.
*/

package edu.ndnu.jwhiteman;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.inject.Inject;

@Named("beanCourse")
@SessionScoped
public class BeanCourse implements Serializable
{
	// Properties
	private String name;
	private String id;
	private String department;

	// Constructor
	public BeanCourse()
	{
		this.name = "Calculus I";
		this.id = "100";
		this.department = "MT";
	}

	// Setters
	public void setName(String name)
	{
		this.name = name;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	// Getters
	public String getName()
	{
		return name;
	}

	public String getId()
	{
		return id;
	}

	public String getDepartment()
	{
		return department;
	}
}