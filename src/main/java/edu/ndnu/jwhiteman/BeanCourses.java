package edu.ndnu.jwhiteman;

import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.inject.Inject;

@Named("beanCourses")
@ApplicationScoped
public class BeanCourses implements Serializable
{
	ArrayList<Course> courses;

	public BeanCourses()
	{
		courses = new ArrayList<Course>();
	}

	public void setCourses(ArrayList<Course> courses)
	{
		this.courses = courses;
	}

	public ArrayList<Course> getCourses()
	{
		return courses;
	}
}