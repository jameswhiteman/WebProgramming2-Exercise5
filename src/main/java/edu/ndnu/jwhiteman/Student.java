/**
@author James Whiteman

A model class, associating all the elements
that compose a student.
*/

package edu.ndnu.jwhiteman;

import java.util.ArrayList;
import javax.persistence.*;

@Embeddable
@Entity
public class Student
{
	// Properties
	@GeneratedValue @Id private String studentId;
	private String firstName;
	private String lastName;
	private String homeAddress;
	private String campusAddress;
	@ElementCollection private ArrayList<Course> courses;

	// Constructor
	public Student(String firstName, String lastName, String homeAddress, String campusAddress)
	{
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
		this.campusAddress = campusAddress;
	}

	// Setters
	public void setStudentId(String studentId)
	{
		this.studentId = studentId;
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

	public void setCourses(ArrayList<Course> courses)
	{
		this.courses = courses;
	}

	// Getters
	public String getStudentId()
	{
		return studentId;
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

	public ArrayList<Course> getCourses()
	{
		return courses;
	}
}