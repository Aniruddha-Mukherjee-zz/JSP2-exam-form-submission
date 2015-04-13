package pojo;


import hibernate.NewHibernateUtil;
import java.math.BigDecimal;
import org.hibernate.Session;
import pojo.Student;
import  hibernate.NewHibernateUtil;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ani
 */
public class student_handler {

    public String test()
    {
        return "High";
        
    }
    /**
     *
     * @param name
     * @param class_roll
     * @param reg_no
     * @param email_id
     * @param payment_id
     * @param subjects
     * @return
     */
    public String insert(String name, String roll,String reg_no, String email_id,String payment_id,String subjects)
    {
        boolean error_flag=false;
       Session  session=NewHibernateUtil.getSessionFactory().openSession();
    //hibernate.pojo.TblPlant plant= new hibernate.pojo.TblPlant();
      Student stu=new Student();
       org.hibernate.Transaction tx = null;
        try
        {
           // org.hibernate.Transaction tx=session.beginTransaction();
            int class_roll=Integer.parseInt(roll);
            tx=session.beginTransaction();
              stu.setClassRollNo(new BigDecimal(class_roll));
              stu.setName(name);
              stu.setEmailId(email_id);
              stu.setPaymentId(payment_id);
              stu.setRegNo(reg_no);
              stu.setSubjects(subjects);
            
            session.save(stu);
            tx.commit();
        }
        catch(Exception e)
        {
            error_flag=true; 
            if (tx != null) {
                tx.rollback();
            e.printStackTrace();
        }
        }
        finally
        {
            session.close();
           if(error_flag==false) return stu.getExamRollNo().toString();
           else         return "Failure to allocate Exam Roll Number due to invalid response";
        }   
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
