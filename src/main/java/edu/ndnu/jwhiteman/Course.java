package edu.ndnu.jwhiteman;

import java.util.ArrayList;
import javax.persistence.*;

@Embeddable
@Entity
public class Course
{
	// Properties
	private String name;
	private String id;
	private String department;
	@ElementCollection private ArrayList<Student> students;

	// Constructor
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

	public void setStudents(ArrayList<Student> students)
	{
		this.students = students;
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

	public ArrayList<Student> getStudents()
	{
		return students;
	}
}