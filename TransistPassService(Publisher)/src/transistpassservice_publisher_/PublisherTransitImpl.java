package transistpassservice_publisher_;

import java.util.Scanner;

public class PublisherTransitImpl implements PublisherTransit{
	public void viewTransistCharges() {
		// TODO Auto-generated method stub
		
		System.out.println("-- Transist Charges --");
		System.out.println("@@@@	A/C Bus ticket for children (Below 12 years old) 	- Local (1)	- Rs.200	@@@@\n"
				+ "||||	A/C Bus ticket for elders (Above 12 years old) - Local (2)		- Rs.600	||||\n"
				+ "@@@@	A/C Bus ticket for children (Below 12 years old) - Foreign (3)		- Rs.1500	@@@@\n"
				+ "||||	A/C Bus ticket for elders (Above 12 years old) - Foreign (4)		- Rs.2000	||||\n"
				+ "@@@@	Non A/C Bus ticket for Children (Below 12 Years old) - Local (5)	- Rs.250	@@@@\n"
				+ "||||	Non A/C Bus ticket for elders (Above 12 Years old) - Local(6)		- Rs.150	||||\n"
				);
	}
	
	public void createBusTicket() {
		int totAmount = 0;
		
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the no of tickets you want : ");
		int size = input.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the type of the ticket you want..");
			
			int selection =  input.nextInt();
			
			if(selection==1) {
				System.out.println("A/C Bus ticket for local children (Below 12 years old) - Rs.200/=");
				totAmount = totAmount + 200;
			}else if(selection == 2) {
				System.out.println("A/C Bus ticket for local elders (Above 12 years old) - Rs.600/=");
				totAmount = totAmount + 600;
			}else if(selection == 3) {
				System.out.println("A/C Bus ticket for foreign children (Below 12 years old) - Rs.1500/=");
				totAmount = totAmount + 1500;
			}else if(selection == 4) {
				System.out.println("A/C Bus ticket for foreign elders (Above 12 years old) - Rs.2000/=");
				totAmount = totAmount + 2000;
			}else if(selection == 5) {
				System.out.println("Non A/C Bus ticket for local Children (Below 12 Years old) - Rs.250/=");
				totAmount = totAmount + 250;
			}else if(selection == 6) {
				System.out.println("Non A/C Bus ticket for local elders (Above 12 Years old) - Rs.150/=");
				totAmount = totAmount + 150;
			}
		}
		System.out.println("Total amount : "+totAmount);
		
	}
	
	
	
	
	
}
