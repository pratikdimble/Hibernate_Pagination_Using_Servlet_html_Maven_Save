package com.app.dao;

import org.hibernate.Session;

import org.hibernate.Transaction;

import com.app.model.Student;
import com.app.utility.HibernateUtil;

public class StudentDAOImpl implements StudentDAO {

	public int saveStudent(int sid, String sname, String semail, String sresult) {
		Session ses=null;
		int idval=0;
		//get the session
		ses=HibernateUtil.getSession();
		//declare the domain class object
			Student s=new Student();
			//set the values
				s.setSid(sid);
				s.setSname(sname);
				s.setSemail(semail);
				s.setSresult(sresult);
				//save objs
				Transaction tx=null;
				try{
				 tx=ses.beginTransaction();
				   idval=(Integer) ses.save(s);
				 tx.commit();
				 System.out.println("Object is saved....");
				  }//try
				  catch(Exception e){
				    tx.rollback();
				    }
		return idval;
	}
	
				}
