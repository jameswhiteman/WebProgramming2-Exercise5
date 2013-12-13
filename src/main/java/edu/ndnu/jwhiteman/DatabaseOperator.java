package edu.ndnu.jwhiteman;

import java.io.Serializable;
import java.util.List;
import java.lang.Exception;

import javax.persistence.*;
import javax.persistence.criteria.*;
import javax.transaction.*;
import javax.annotation.*;

public class DatabaseOperator implements Serializable
{
	@PersistenceUnit(unitName="mydb") private EntityManagerFactory emf;
	@Resource private UserTransaction userTransaction;

	public DatabaseOperator()
	{
		emf = Persistence.createEntityManagerFactory("mydb");
	}

	//public List<Student> getStudents() throws NotSupportedException
	public List<Student> getStudents()
	{
		EntityManager em = emf.createEntityManager();
		List<Student> e = null;
		try
		{
			CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
			CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
			Root<Student> rootEntry = criteriaQuery.from(Student.class);
			CriteriaQuery<Student> students = criteriaQuery.select(rootEntry);
			TypedQuery<Student> studentsQuery = em.createQuery(students);
			e = studentsQuery.getResultList();
		}
		catch (Exception exc)
		{
			exc.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return e;
	}

	// Save Data
	public void saveStudent(Student e)
	{\
		EntityManager em = emf.createEntityManager();
		try
		{
			userTransaction.begin();
			em.joinTransaction();
			boolean committed = false;
			try
			{
				em.persist(e);
				userTransaction.commit();
				committed = true;
			}
			catch (Exception exc)
			{
				exc.printStackTrace();
			}
			finally
			{
				if (!committed)
				{
					userTransaction.rollback();
				}
			}
		}
		catch (Exception exc)
		{
			exc.printStackTrace();
		}
		finally
		{
			em.close();
		}
	}
}