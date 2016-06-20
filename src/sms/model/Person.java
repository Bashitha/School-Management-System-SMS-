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
public class Person {
    private String person_id;
    private String fname;
    private String lname;
    private String date;
    private int mobile_no;
    private int tel_no;
    private String address1;
    private String address2;
    private String address3;

    public Person() {
    }

    public Person(String person_id, String fname, String lname, String date, int mobile_no, int tel_no, String address1, String address2, String address3) {
        this.person_id = person_id;
        this.fname = fname;
        this.lname = lname;
        this.date = date;
        this.mobile_no = mobile_no;
        this.tel_no = tel_no;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
    }

    /**
     * @return the person_id
     */
    public String getPerson_id() {
        return person_id;
    }

    /**
     * @param person_id the person_id to set
     */
    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the mobile_no
     */
    public int getMobile_no() {
        return mobile_no;
    }

    /**
     * @param mobile_no the mobile_no to set
     */
    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    /**
     * @return the tel_no
     */
    public int getTel_no() {
        return tel_no;
    }

    /**
     * @param tel_no the tel_no to set
     */
    public void setTel_no(int tel_no) {
        this.tel_no = tel_no;
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @return the address3
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * @param address3 the address3 to set
     */
    public void setAddress3(String address3) {
        this.address3 = address3;
    }
    
    
    
}
