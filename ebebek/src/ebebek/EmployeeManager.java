package ebebek;


public class EmployeeManager {
	   public void toString(Employee employee){
	    System.out.println("Adi  :" + employee.name);
	    System.out.println("Maasi :"  +  employee.salary);
	    System.out.println("Calisma Saati  :"  +  employee.workHours);
	    System.out.println("Baslangic Yili  :"  +  employee.hireYear);
	   }
	   
	   public void tax(Employee employee) {
	    int salary = employee.salary;
	    double tax;
	    if(salary< 1000){
	        System.out.println("1000 TL'den az ise vergi uygulanmayacaktır.");
	      }else {
	        tax = salary*3/100;
	        System.out.println( "Vergi :" + tax);
	      }  
	      }

	    public void bonus(Employee employee) {
	        int workHours =employee.workHours;
	        double bonus;
	       if(workHours>40){
	          bonus = (workHours-40)*30;
	          System.out.println("Bonus  :" + bonus);
	        }
	      }
	        public void raiseSalary(Employee employee) {
	          int hireYear = employee.hireYear;
	          double salary = employee.salary;
	          int yil =2021;
	          double raiseSalary; 
	          int difference;
	          difference = (yil-hireYear);
	          
	          if(difference < 10){
	             this.raiseSalary(employee);
	             raiseSalary= salary*5/100;
	            System.out.println("Maaş Artışı  :" + raiseSalary);
	          } 
	           if(difference > 9 && difference < 20) {
	        	   this.raiseSalary(employee);
	            raiseSalary = salary*10/100;
	            System.out.println("Maaş Artışı  :" + raiseSalary);
	          }
	          if(difference < 19){
	        	  this.raiseSalary(employee);
	            raiseSalary = salary*15/100;
	            System.out.println("Maaş Artışı  :" + raiseSalary);
	          }
	        }
	    public void total(Employee employee) {
	      int salary = employee.salary;
	      double tax = employee.tax;
	      double bonus = employee.bonus;
	      double total1 , total2;
	      total1 = (bonus-tax + salary);
	      total2 = (bonus-tax + salary);
	      System.out.println("Vergi ve Bonuslar ile Birlikte Maas   : " + total1);
	      System.out.println("toplam Maaş  : "  + total2);
	    } 
	    
	    

	    public void Acıklama(Employee employee) { 
	        System.out.println("Merhaba projeyi cogu kismini yaptim." );
	    }

	    

			

}
