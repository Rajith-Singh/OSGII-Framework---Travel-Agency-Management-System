package railwayjourneyservice_publisher_;

import java.util.Scanner;

public class PublisherRailwayImpl implements PublisherRailway {
	public void viewTrainJourneyCharges() {
		System.out.println("-- Train Journey Charges --");
		System.out.println("@@@@	1st Class (Air Conditioning) Ticket Price - Rs.500 (1)	@@@@\n"
				+ "||||	2nd Class Ticket Price - Rs.300 (2)	||||\n"
				+ "@@@@	3rd Class Ticket Price - Rs.200 (3)	@@@@\n"
				+ "================================================\n"
				+ "------------ Seat Availability ------------ \n"
				+ "================================================\n"
				+ "@@@@	1st class Ticket - 60 seats	@@@@\n"
				+ "||||	2nd class Ticket - 120 seats	||||\n"
				+ "@@@@	3rd class Ticket - 180 seats	@@@@\n"
				);

	}

	public void calculateTrainTicket() {
		Scanner input  = new Scanner(System.in);
		int totAmount = 0;
		System.out.println("Enter the no of tickets you want - ");
		int noOfSeats = input.nextInt();

		for(int i=0; i<noOfSeats; i++) {


			System.out.println("Enter the type of the ticket you want - ");
			int selection =  input.nextInt();
			if(selection==1) {
				System.out.println("1st Class Ticket - Rs.500/=");
				totAmount = totAmount + 500;
			}else if (selection==2) {
				System.out.println("2nd Class Ticket - Rs.300/=");
				totAmount = totAmount + 300;
			}else if(selection==3) {
				System.out.println("3rd Class Ticket) - Rs.200/=");
				totAmount = totAmount + 200;
			} else {
				System.out.println("Invalid number");
			}

		}

		System.out.println("The total amount is "+totAmount);
	}
	
	public void reachingTime() {
		Scanner input  = new Scanner(System.in);

		System.out.println("# Colombo to Awissawella \n"
				+ "# Station Name            Code    \n"
				+ "============================================\n"
				+ "# ColomboFort       	FOT\n"
				+ "# Maradana       	MDA\n"
				+ "# Baseline Road  	BSR\n"
				+ "# Narahenpita     	NRH\n"
				+ "# Nugegoda       	NUG\n"
				+ "# Maharagama       	MHR\n"
				+ "# Kottawa       	KOT\n"
				+ "# Makumbura       	MAK\n"
				+ "# Homagama       	HGM\n"
				+ "# Meegoda       	MEG\n"
				+ "# Padukka       	PDK\n"
				+ "# Waga       		WAG\n"
				+ "# Kosgama       	KOS\n"
				+ "# Awissawella       	AWS\n"
				);
		System.out.println("Enter the station code where you want to know the arrival time : ");
		String code = input.next();
		
		if("FOT".equals(code)) {
			System.out.println("The train reaches Colombo Fort at 07.15 am");
		} else if("MDA".equals(code)) {
			System.out.println("The train reaches Maradana at 07.21 am");
		}else if("BSR".equals(code)) {
			System.out.println("The train reaches Baseline Road at 07.35 am");
		}else if("NRH".equals(code)) {
			System.out.println("The train reaches Narahenpita at 07.35 am");
		}else if("NUG".equals(code)) {
			System.out.println("The train reaches Nugegoda at 07.43 am");
		}else if("MHR".equals(code)) {
			System.out.println("The train reaches Maharagama at 07.55 am");
		}else if("KOT".equals(code)) {
			System.out.println("The train reaches Kottawa at 08.14 am");
		}else if("MAK".equals(code)) {
			System.out.println("The train reaches Makumbura at 08.16 am");
		}else if("HGM".equals(code)) {
			System.out.println("The train reaches Homagama at 08.27 am");
		}else if("MEG".equals(code)) {
			System.out.println("The train reaches Meegoda at 08.37 am");
		}else if("PDK".equals(code)) {
			System.out.println("The train reaches Padukka at 08.49 am");
		}else if("WAG".equals(code)) {
			System.out.println("The train reaches Waga at 09.07 am");
		}else if("KOS".equals(code)) {
			System.out.println("The train reaches Kosgama at 09.18 am");
		}else if("AWS".equals(code)) {
			System.out.println("The train reaches Awissawella at 09.35 am");
		}else {
			System.out.println("Invalid Code.");
		}

	}

}


