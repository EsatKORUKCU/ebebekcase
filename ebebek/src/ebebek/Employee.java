package ebebek;

public class Employee {
	
	    
	     String name="kemal";
	     int salary = 2000;
	     int workHours = 45;
	     int hireYear = 1985;
	     double tax;
	     double bonus;
	     double raiseSalary;

	    
	     
	    public Employee(String name, int salary,  int workHours, int hireYear, double tax, int bonus, double raiseSalary  ){ // product'ın  Constructor'ı bulundugu class ile aynı isimde olmalı
	    
	    this.name =name;
	    this.salary =salary;
	    this.workHours = workHours;
	    this.hireYear = hireYear;
	    this.tax = tax;
	    this.bonus = bonus;
	    this.raiseSalary = raiseSalary;

	    
	  
	}
	    
	    public Employee(){ 

	    }

}
