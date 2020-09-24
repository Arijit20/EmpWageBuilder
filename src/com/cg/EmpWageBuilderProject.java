package com.cg;
import java.util.Random;

public class EmpWageBuilderProject {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int empHrs = 0, empWage = 0;
     
     Random r = new Random();
     int empCheck =  r.nextInt(3) ;
     
     if(empCheck == IS_FULL_TIME)
             empHrs = 8;
     else if (empCheck == IS_PART_TIME)
             empHrs = 4;
     else
    	     empHrs = 0;
     
     
     empWage = empHrs * EMP_RATE_PER_HOUR;
     System.out.println("Emp Wage: " + empWage);
	}

}
