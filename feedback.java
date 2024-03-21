package Broad;

import java.util.Scanner;

class feedback extends user{
	Scanner sc=new Scanner(System.in);
	public void fed() {
	
	System.out.println("Enter your rating  from 1 to 5 =");
	int  rate=sc.nextInt();
	if(rate<3) {
		System.out.print("Enter your feedback =");
		String fee=sc.next();
		feedback.add(fee);
	}
	list.add(list1);
	System.out.println("Thank you for feedback");
}
}


