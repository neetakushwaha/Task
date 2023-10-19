package task1;

import java.util.Scanner;

class ATM{
	
	float Balance;
	int PIN = 1010;


          public void checkPin() 
            {
	               System.out.println("Enter your Pin: ");
	               Scanner sc = new Scanner(System.in);
	               int enter_pin = sc.nextInt();
	               
	            if(enter_pin==PIN) {
		               menu();
	              }
	            else {
		               System.out.println("Please Enter a valid pin...");
		               menu();
	                 }
	
               }

              public void menu() {
	                 System.out.println("Select Options");
	                 System.out.println("1. Deposit");
	                 System.out.println("2. Withdraw");
	                 System.out.println("3.Check Balance");
	                 System.out.println("4. Exits");
	
	              Scanner sc = new Scanner(System.in);
			        int option = sc.nextInt();
			
			        if(option == 1) {
				           depositMoney();
			          }
			        else if(option == 2) {
				         withdrawMoney();
			           }
			        else if(option == 3) {
				          checkBalance();
			          }
			        else if(option == 4) {
				         return;
			          }
		        	else{
				            System.out.println("Enter a valid Options");
			           }
              }

          public void checkBalance() {
        	  System.out.println("Balance"+ Balance);
        	  menu();
          	}
          
          public void withdrawMoney() {
        	  
        	  System.out.println("Enter Amount to Withdraw :");
        	  Scanner sc = new Scanner(System.in);
        	  float amount = sc.nextFloat();
        	  if(amount>Balance) {
        		  System.out.println("Insufficient Balance");
        	  }
        	  else {
        		  Balance = Balance - amount;
        		  System.out.println("Money withdraw Successfully");
        		 
        	  }
        	  menu();
        	  
         }
          
          public void depositMoney() {
        	  System.out.println("Enter the Amount :");
        	  Scanner sc = new Scanner(System.in);
        	  float amount = sc.nextFloat();
        	  Balance = Balance + amount;
        	  System.out.println("Money Deposit Successfully");
        	 menu(); 
          }
         
       

}


public class ATM_Machine {

	public static void main(String[] args) {
	

		ATM obj = new ATM();
		obj.checkPin();
		 
	}

}
