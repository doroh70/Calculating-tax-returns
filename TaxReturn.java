/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maro
 */
public class TaxReturn {
    
    private String ssn;
    private String lname;
    private String fname;
    private String saddy;
    private String city;
    private String state;
    private String zipcode;
    private double income;
    private char mstatus;
    private double taxliability;
    
    public TaxReturn(String ssn, String lname, String fname, String saddy, String city, String state, String zipcode, double income, char mstatus){
        
        this.ssn = ssn;
        this.lname = lname;
        this.fname = fname;
        this.saddy = saddy;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.income = income;
        this.mstatus = mstatus;
        
        if(income<=20000){
            if(mstatus == 'M'){
                taxliability = 0.14 * this.income;
            }
            else if (mstatus == 'S'){
                taxliability = 0.15 * this.income;
            }
        }
        else if(income<=50000){
            if(mstatus == 'M'){
                taxliability = 0.20 * this.income;
            }
            else if (mstatus == 'S'){
                taxliability = 0.22 * this.income;
            }            
        }
        else if(income>=50001){
            if(mstatus == 'M'){
                taxliability = 0.28 * this.income;
            }
            else if (mstatus == 'S'){
                taxliability = 0.30 * this.income;
            }           
        }
    }
    
    public void displayTaxReturn(){
        System.out.println(fname + " " + lname + " owes:" + taxliability + " to the IRS.");
    }
    
    
}
