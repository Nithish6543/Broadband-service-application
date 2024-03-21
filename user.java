package Broad;

import java.util.ArrayList;
import java.util.Scanner;

	 class user{
			static private ArrayList<String> user_id=new ArrayList<>();
			static protected  ArrayList<String> user_name=new ArrayList<>();
			static protected ArrayList<String> user_email=new ArrayList<>();
			static protected ArrayList<String> password=new ArrayList<>();
			static protected ArrayList<String> mobilenumber=new ArrayList<>();
			static  protected ArrayList<String> feedback=new ArrayList<>();
			static protected int status1=0;
			static protected ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
			static ArrayList<String> list1=new ArrayList<>();

			 static Scanner sc=new Scanner(System.in);
			int count;
			 public void input(String id,String name,String email,String pass,String num) {
				 
				 user_id.add(id);
				 user_name.add(name);
				 user_email.add(email);
				 password.add(pass);
				 mobilenumber.add(num);
				 System.out.println(" profile Created succesfully");
				 System.out.println("Enter 1 to login");
				 System.out.println("Enter 2 to update = ");
				 System.out.println("Enter 3 to view the account = ");
				 System.out.println("Enter 4 to main menu");
				 int choice=sc.nextInt();
				 if(choice==2) {
					 update();
				 }else if(choice==3) {
					view();
				 }else if(choice==1){
					 login();
					// System.err.println("Thank you!");
				 }else if(choice==4) {
					 
				 }
				 else {
					 System.err.println("Invalid input");
				 }
			 }
			 public void login() {
				 System.out.println("Enter your user_id to login :");
					String id=sc.next();
					
					System.out.println("Forget password enter 1 to reset your password or enter any number to login=");
					int num=sc.nextInt();
					String pas="";
					if(num==1) {
						pas=passupdate();
					}else {
						System.out.println("Enter your password to login:");

					 pas=sc.next();
					}
										
					serviceplan sp=new serviceplan();
				 for(int i=0;i<user_id.size();i++) {
						if(user_id.get(i).equals(id)) {
							if(pas.equals(password.get(i))) {
								sp.plan();
							}
							else {
								System.out.println("you have entered wrong password");
							
							}
						}
				 }
				 System.out.println("user_id not found");
			 }public static String passupdate() {
				 System.out.println("Enter your userid");
				 String userid=sc.next();
				 System.out.println("enter your mobile number=");
				 String mobi=sc.next();
				 String pass="";
				 for(int i=0;i<mobilenumber.size();i++) {
				 if(mobi.equals(mobilenumber.get(i))) {
					 System.out.print("Enter your password to reset");
					 pass=sc.next();
					 password.set(i, pass);
					 break;
				 }
				 }
				 return pass;
			 }
			public static void update() {
				System.out.println("Enter your user_id =");
				String uid=sc.next();
				System.out.println("Enter your password to continue your update process");
				String pass=sc.next();
				for(int i=0;i<user_id.size();i++) {
					if(user_id.get(i).equals(uid)) {
						System.out.println("Enter your name to update =");
						String na=sc.next();
						user_name.set(i,na);
						System.out.println("Enter your email to update =");
						String ema=sc.next();
						user_email.set(i,ema);
						
	
					}
				}
				
			}public static void view() {
				System.out.println("Enter your user id to view your account");
				String uid=sc.next();
				for(int i=0;i<user_id.size();i++) {
					if(user_id.get(i).equals(uid)) {
						System.out.println("user name ="+user_name.get(i));
						System.out.println("user email ="+user_email.get(i));
					}
				}
			}
			 public String userid() {
				 return user_id.get(count);
			 }
			 public String username() {
				 return user_name.get(count);
			 }public int planid() {
				 System.out.println("Enter your plan id =");
				 int i=sc.nextInt();
				 return i;
			 }
		}

