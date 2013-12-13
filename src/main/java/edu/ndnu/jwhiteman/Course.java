package edu.ndnu.jwhiteman;

import java.util.ArrayList;
import javax.persistence.*;

@Entity
public class Course
{
	// Properties
	private String name;
	@Id private String id;
	private String department;

	// Constructor
	public Course()
	{
		this.name = "";
		this.id = "";
		this.department = "";
	}

	public Course(String name, String id, String department)
	{
		this.name = name;
		this.id = id;
		this.department = department;
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