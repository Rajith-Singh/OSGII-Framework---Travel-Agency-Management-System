package tourmasterservice_publisher_;

import java.util.Scanner;

public class PublisherTourImpl implements PublisherTour {
	public void viewTourCharges() {
		System.out.println("-- Tour Charges --");
		System.out.println("@@@@	Entrance ticket for children (Below 12 years old) - Local (1)	- Rs.100/=	@@@@\n"
				+ "||||	Entrance ticket for elders (Above 12 years old) - Local (2)	- Rs.150/=	||||\n"
				+ "@@@@	Entrance ticket for children (Below 12 years old) - Foreign (3)	- Rs.1000/=	@@@@\n"
				+ "||||	Entrance ticket for elders (Above 12 years old) - Foreign (4)	- Rs.1500/=	||||\n");
	}
	
	public void calculateTourTicket() {
		int totAmount = 0;
		int Amount = 0;
		Scanner input  = new Scanner(System.in);

		System.out.println("Enter no of tickets you want : ");
		int size = input.nextInt();

				
		for (int i=0; i<size; i++) {
			System.out.println("Enter the type of ticket : ");
			int selection =  input.nextInt();
			
			if(selection == 1) {
				System.out.println("Your have selected the Local Child Ticket \n"
						+ "Ticket Price Rs. 250/=");
				totAmount =  totAmount + 100;
			}else if (selection == 2 ) {
				System.out.println("Your have selected the Local Elder Ticket \n"
						+ "Ticket Price Rs. 350/=");
				totAmount =  totAmount + 150;
			}
			else if (selection == 3 ) {
				System.out.println("Your have selected the Foreign Child Ticket \n"
						+ "Ticket Price Rs. 1000/=");
				totAmount =  totAmount + 1000;
			}
			else if (selection == 4 ) {
				System.out.println("Your have selected the Foreign Elder Ticket \n"
						+ "Ticket Price Rs. 1500/=");
				totAmount =  totAmount + 1500;
			}else {
				System.out.println("Invalid Input !!!");
			}
			

	}
		
	 
	System.out.println("=============================================================");
	System.out.println("== Your total amount is = "+totAmount);	
	
	}
	
	

}
