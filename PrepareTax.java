/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maro
 */
import java.util.Scanner;

public class PrepareTax {
    public static void main(String[] args){
        String ssn = "gjg";
        String lname;
        String fname;
        String saddy;
        String city;
        String state;
        String zipcode;
        double income;
        char mstatus;
        double taxliability;
        
        Scanner input = new Scanner(System.in);
        
        
        Boolean strue = false;
        
        while(!strue){
            strue = true;
            System.out.println("Enter social security number: ");
            String ssndemo = input.nextLine();
            
            if(ssndemo.length() != 11){
                strue = false;
                continue;
            }
            for(int i = 0; i<3; i++){
                if(!Character.isDigit(ssndemo.charAt(i))){
                   strue = false;
                   //continue;
                }
            }
            for(int i = 4; i<7; i++){
                if(!Character.isDigit(ssndemo.charAt(i))){
                   strue = false;
                   //continue;
                }
            }
            for(int i = 8; i<11; i++){
                if(!Character.isDigit(ssndemo.charAt(i))){
                   strue = false;
                   //continue;
                }
            }
            if(ssndemo.charAt(3) != '-'){
                strue = false;
            }
            if(ssndemo.charAt(7) != '-'){
                strue = false;
            }
            
        }
        
        
        
        
        System.out.println("Enter last name: ");
        lname = input.nextLine();
        
        System.out.println("Enter first name: ");
        fname = input.nextLine();
        
        System.out.println("Enter street address: ");
        saddy = input.nextLine();
        
        System.out.println("Enter city: ");
        city = input.nextLine();
        
        System.out.println("Enter state: ");
        state = input.nextLine();
        
        zipcode = "kl";
        while(zipcode.length() != 5){
            System.out.println("Enter zipcode: ");
            zipcode = input.nextLine();
        }
        
        income = -5;
        while(income<0){
            System.out.println("Enter annual income: ");
            income = input.nextDouble();
        }
        
        mstatus = 'P';
        while(mstatus != 'M' && mstatus != 'S'){
            System.out.println("Enter marital status: ");
            mstatus = input.next().charAt(0);
        }
        
    TaxReturn test = new TaxReturn(ssn, lname, fname, saddy, city, state, zipcode, income, mstatus);
    
    test.displayTaxReturn();
    
    }
    
}
