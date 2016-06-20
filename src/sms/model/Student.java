/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.model;

/**
 *
 * @author Leshan
 */
public class Student {
    private String sid;
    private String class_code;
    private String grade_code;

    public Student() {
    }

    public Student(String sid, String class_code, String grade_code) {
        this.sid = sid;
        this.class_code = class_code;
        this.grade_code = grade_code;
    }

    /**
     * @return the sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * @return the class_code
     */
    public String getClass_code() {
        return class_code;
    }

    /**
     * @param class_code the class_code to set
     */
    public void setClass_code(String class_code) {
        this.class_code = class_code;
    }

    /**
     * @return the grade_code
     */
    public String getGrade_code() {
        return grade_code;
    }

    /**
     * @param grade_code the grade_code to set
     */
    public void setGrade_code(String grade_code) {
        this.grade_code = grade_code;
    }
    
    
}
