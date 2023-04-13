package entranceproservice_publisher_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import java.util.Scanner;

public class PublisherEntranceImpl implements PublisherEntrance {
	@Override
	public void viewEntranceCharges() {
		// TODO Auto-generated method stub
		
		System.out.println("------------- Entrance Charges -------------");
		System.out.println("@@@@  	Entrance ticket for children (Below 12 years old) - Local (1)	- 	RS.250/=	@@@@\n"
				+ "|||| 	Entrance ticket for elders (Above 12 years old) - Local (2)	-	Rs.350/=	||||\n"
				+ "@@@@  	Entrance ticket for children (Below 12 years old) - Foreign (3)	-	Rs.1000/=	@@@@\n"
				+ "|||| 	Entrance ticket for elders (Above 12 years old) - Foreign (4)	-	Rs.1500/=	||||\n");
	}
	

	@Override
	public void calculateEntrenceTicket() {
		int totAmount = 0;
		int Amount = 0;
		Scanner input  = new Scanner(System.in);

		System.out.println("Enter no of seat you want : ");
		int size = input.nextInt();

				
		for (int i=0; i<size; i++) {
			System.out.println("Enter the type of ticket : ");
			int selection =  input.nextInt();
			
			if(selection == 1) {
				System.out.println("Your have selected the Local Child Ticket \n"
						+ "Ticket Price Rs. 250/=");
				totAmount =  totAmount + 250;
			}else if (selection == 2 ) {
				System.out.println("Your have selected the Local Elder Ticket \n"
						+ "Ticket Price Rs. 350/=");
				totAmount =  totAmount + 350;
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
	if (size > 4) {
		System.out.println("Your amount is Rs. "+totAmount);
		System.out.println("You have ordered more than 4 tickets. Therfore you received 10% discount.\n"
				+ "Therefore your total amount is Rs. "+((totAmount*90)/100));
		} else {
			System.out.println("Your total amount is Rs. "+totAmount);
		}
	}
}