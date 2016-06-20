/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import sms.db.DBConnection;
import sms.model.Student;
import sms.model.Person;

/**
 *
 * @author Leshan
 */
public class StudentController {
    public static int addStudent(Person person, Student student)throws SQLException,ClassNotFoundException{
        String sql1="Insert into Person values('"+person.getPerson_id()+"','"+person.getFname()+"','"+person.getLname()+"','"+person.getDate()+"','"+person.getAddress1()+"','"+person.getAddress2()+"','"+person.getAddress3()+"','"+person.getMobile_no()+"','"+person.getTel_no()+"')";
        String sql2 = "Insert into Student values ('"+student.getSid()+"','"+student.getClass_code()+"','"+student.getGrade_code()+"')";
	Connection conn=DBConnection.getDBConnection().getConnection();
	Statement stm=conn.createStatement();
	stm.executeUpdate(sql1);
        int res = stm.executeUpdate(sql2);
	return res;
    }
    
    // Search student (as person).
    public static Person searchStudentPerson(String id)throws ClassNotFoundException,SQLException{
        String sql = "Select * From Person where person_id='" + id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Person person = null;
        if (rst.next()) {
            person = new Person(rst.getString("person_id"), rst.getString("fname"), rst.getString("lname"), rst.getString("dob"), rst.getInt("mobile_no"), rst.getInt("tel_no"), rst.getString("address1"), rst.getString("address2"), rst.getString("address3"));
        }
        return person;
    }
    
    // Search student (as student).
    public static Student searchStudentStudent(String id)throws ClassNotFoundException,SQLException{
        String sql = "Select * From Student where Sid='" + id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Student student = null;
        if (rst.next()) {
            student = new Student(rst.getString("Sid"), rst.getString("class_code"), rst.getString("grade_code"));
        }
        return student;
    }
    
}
