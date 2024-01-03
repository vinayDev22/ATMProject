package atmProject;

import java.util.Scanner;

class AtmClass2 {
	
	double PIN = 1234;
	float balance;
	
Scanner in =new Scanner(System.in);
	
	
	
	
public void checkPin() {
	
	System.out.print("Enter Pin : ");
	int enterPIN = in.nextInt();

	if(enterPIN == PIN) {
		
		System.out.println("PIN is correct");
		
		menu();
	}else {
		System.out.println("Inavalid PIN...Try Again");
		menu();
	}
}

public void menu() {
	
	System.out.println("Enter Your Choice");
	System.out.println("1. Check A/C balance");
	System.out.println("2. Withdraw Money");
	System.out.println("3. Deposit Money");
	System.out.println("4. Exit");
	
	int opt =in.nextInt();
	
	if(opt == 1) {
		
		checkbalance();
		
	}else if(opt == 2) {
		
		 withdrawMoney();
		
	}else if(opt == 3) {
		
		depositMoney();
		
	}else if(opt == 4) {
		
	
		exit();
	}else {
		System.out.println("Enter the correct choice");
	}
	
}

public void checkbalance() {
	
	System.out.print("Your account balance : " + balance );
	menu();
}

public void withdrawMoney() {
	System.out.print("Enter the withdrawl money : ");
	int amount=in.nextInt();
	if(amount > balance) {
		System.out.println("Insufficinet balance");
		menu();
	}else if(amount < balance) {
		System.out.println("");
		balance =balance-amount;
		System.out.println("Withdraw Successfull");
		menu();
	}
	menu();
}

public void depositMoney() {
	System.out.print("Enter the deposit money : ");
	int depMo = in.nextInt();
	
	balance=+depMo;
	System.out.println("depositted amount successfully");
	
	menu();
}
public void exit() {
	return;
}

}


public class AtmClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 AtmClass2 obj = new  AtmClass2 ();
		 
		 obj.checkPin();
	}

}
