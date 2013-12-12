package edu.ndnu.jwhiteman;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.inject.Inject;

@Named("beanStudents")
@ApplicationScoped
public class BeanStudents implements Serializable
{
	ArrayList<Student> students;

	public BeanStudents()
	{
		students = new ArrayList<Student>();
	}

	public void setStudents(ArrayList<Student> students)
	{
		this.students = students;
	}

	public ArrayList<Student> getStudents()
	{
		DatabaseOperator operator = new DatabaseOperator();
		List<Student> operatorStudents = operator.getStudents();
		students.clear();
		for (int i = 0; i < operatorStudents.size(); i++)
		{
			students.add(operatorStudents.get(i));
		}
		return students;
	}
}