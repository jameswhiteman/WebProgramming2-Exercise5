package edu.ndnu.jwhiteman;

import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.inject.Inject;
import javax.annotation.PostConstruct;

@Named("beanEnroll")
@ApplicationScoped
public class BeanEnroll implements Serializable
{
	private String[] selectedCourses;
	private Student student;
	@Inject private BeanCourses beanCourses;

	public BeanEnroll()
	{
		selectedCourses = null;
		student = null;
		beanCourses = null;
	}

	@PostConstruct
	public void setup()
	{
		selectedCourses = new String[beanCourses.getCourses().size()];
		student = null;
	}

	// Setters
	public void setSelectedCourses(String[] selectedCourses)
	{
		this.selectedCourses = selectedCourses;
	}

	public void setStudent(Student student)
	{
		this.student = student;
	}

	public void setBeanCourses(BeanCourses beanCourses)
	{
		this.beanCourses = beanCourses;
	}

	// Getters
	public String[] getSelectedCourses()
	{
		return selectedCourses;
	}

	public Student getStudent()
	{
		return student;
	}

	public BeanCourses getBeanCourses()
	{
		return beanCourses;
	}
}