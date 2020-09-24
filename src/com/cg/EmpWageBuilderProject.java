package com.cg;
import java.util.Random;

public class EmpWageBuilderProject {

	public static final int IS_FULL_TIME = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     Random r = new Random();
     int empCheck =  r.nextInt(2) ;
     
     if(empCheck == IS_FULL_TIME)
             System.out.println("Employee is Present");
     else
    	     System.out.println("Employee is Abscent");
	}

}
