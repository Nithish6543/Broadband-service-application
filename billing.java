package Broad;
import java.text.SimpleDateFormat;
import java.util.*;

 class billing  extends user{
			int plan_id;
			
			String output="";
			static Scanner sc=new Scanner(System.in);
			public int subs(int pid) {
				plan_id=pid;
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		        Calendar calendar = Calendar.getInstance();
		     
		        calendar.setTime(new Date()); 
		        if(plan_id==1) {
			list1.add("basic");
		        calendar.add(Calendar.DATE, 30);
		        output = sdf.format(calendar.getTime());
		        Date date = new Date();
				System.out.println(" Date of Activation ="+date);
		        System.out.println("Date of expiring your expiring plan ="+output);
		        if(bill()) {
					return 1;
				}
		        }else if(plan_id==2) {
		        	list1.add("economy");
                    calendar.add(Calendar.DATE, 35);
		            output = sdf.format(calendar.getTime());
		            Date date = new Date();
		            System.out.println("Date of Activation ="+date);
		            System.out.println("Date of expiring ="+output);
		            if(bill()) {
						return 1;
					}
		            }
		        else if(plan_id==3) {
		        	list1.add("premium");
		        	 Date date = new Date();
			            System.out.println("Date of Activation ="+date);
			            calendar.add(Calendar.DATE, 50);
			             output = sdf.format(calendar.getTime());
			            System.out.println("Date of expiring ="+output);
		        	if(bill()) {
						return 1;
					}
		           
		            }

		return 0;
			}
		public static boolean bill() {
			System.out.println("Enter 1 for cash");
			System.out.println("Enter 2 for card");
			System.out.println("Enter 3 for banking");
			System.out.println("Enter 4 for upi");

			System.out.print("Enter your mode of payment =");
			int n=sc.nextInt();
			
			if(n==1){
			TransactionMode mod=TransactionMode.CASH;
			System.out.println("Your payment will complete in "+mod);
			}
			else if(n==2){
				TransactionMode mod=TransactionMode.CARD;
				System.out.println("Your payment will complete in "+mod);
				}
			else if(n==3){
				TransactionMode mod=TransactionMode.BANKING;
				System.out.println("Your payment will complete in "+mod);
				}
			else if(n==4) {
					TransactionMode mod=TransactionMode.UPI;
					System.out.println("Your payment will complete in "+mod);
			}
			else {
				System.out.println("Invalid Input");
				bill();
			}
			System.err.println("thanks for your payment");
			feedback fb=new feedback();
			fb.fed();
			return true;
			}
		enum TransactionMode {
		    CASH("Instant"),
		    CARD("Real-time"),
		    BANKING("1-2 business days"),
		    UPI("Real-time"),
		    PAYPAL("1-3 business days"),
		    OTHER("Varies");

		    private final String duration;
		   

		    TransactionMode(String duration) {
		        this.duration = duration;
		       
		    }

		    public String getDuration() {
		        return duration;
		    }

		    
		}
			
				//br.inp();
				
			}




