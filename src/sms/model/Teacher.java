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
public class Teacher {
    private String teacher_code;

    public Teacher() {
    }

    public Teacher(String teacher_code) {
        this.teacher_code = teacher_code;
    }

    /**
     * @return the teacher_code
     */
    public String getTeacher_code() {
        return teacher_code;
    }

    /**
     * @param teacher_code the teacher_code to set
     */
    public void setTeacher_code(String teacher_code) {
        this.teacher_code = teacher_code;
    }
    
    
}
