package Broad;
import java.util.*;
public class Broadband {
	static Scanner s=new Scanner(System.in);
	static ArrayList <Integer> feed=new ArrayList<>();
	public static void main(String[] args) {
	inp();
}
	public static void inp() {
		user a=new user();
		int count=0,subsid=0,billid=0;
		//billing bs=new billing();
		String user_status="";
		billing sub=new billing();
		System.out.println("---Welcome----");
		System.out.println("enter choice 1 to create account");
		System.out.println("enter choice 2 for login ");
		System.out.println("enter choice 3 for feedback ");
		int choice=s.nextInt();
		if(choice==1) {
			System.out.println("Enter the name=");
			String n=s.next();
			System.out.println("Enter the user-id(String format) =");
			String i=s.next();
			System.out.println("Enter your password=");
			String pass=s.next();
		
			System.out.println("Enter your gmail=");
			String gmail=s.next();
          System.out.println("Enter your mobilenumber=");
          String number=s.next();
		a.input(i,n,gmail,pass,number);
			inp();
		}
		else if(choice==2) {
		a.login();
		inp();
		}else if(choice==3) {
			feedback fb=new feedback();
			fb.fed();
			inp();
					}

		else {
			System.out.println("Invalid Input");
			inp();
		}
	}
}

