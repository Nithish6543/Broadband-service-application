package Broad;
import java.util.*;
public class subscription extends user{
	static Scanner sc=new Scanner(System.in);
	static String currentplan;
static String user_status;
public subscription() {
	user_status="inactive";

}billing bs=new billing();

public void subs(int planid) {

	if(status1==1) {
		System.out.println("You hava an active plan");
		System.out.println("Enter 1 to cancel plan");
		System.out.println("Enter 2 to upgrade plan");
		System.out.println("Enter 3 to downgrade plan");
		System.out.println("Enter 5 to exit");
		System.out.println("Enter your choice =");
		int ch=sc.nextInt();
		if(ch==1) {
			currentplan="Null";
			status1=0;
			serviceplan sp=new serviceplan();
			sp.plan();
		}
		else if(ch==2) {
			status1=0;
			serviceplan sp=new serviceplan();
			sp.plan();

		}else if(ch==3) {
			serviceplan sp=new serviceplan();
			status1=0;
			sp.plan();
		}
		}
	else {
		status1=bs.subs(planid);
		if(planid==1) {
			currentplan="basic";
		}else if(planid==2) {
			currentplan="economy plan";
		}else if(planid==3) {
			currentplan="premiumplan";
		}
	}
}
}