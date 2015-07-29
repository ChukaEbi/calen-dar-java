/*
Full Name: Chuka Ebi

TurnIn Username: cebi

Date: 3/23/2015

*/
package Homework1;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String monthString;
		String message = "Enter the code number for the day of the week on which January 1 falls: ";
		String message2 = "0- Sun  1- Mon  2- Tue  3- Wed  4- Thu  5- Fri  6- Sat";
		String message3 = "Enter your day code now: ";
		String instruction = "Enter the year for which you would like a calender: ";
		String welcomeMessage = "This program displays a calender. You need to provide the year, and the day of the week on which January 1 falls.";
		int months = 12;
		String Sunday = "Sun";
		String Monday = "Mon";
		String Tuesday = "Tue";
		String Wednesday = "Wed";
		String Thursday = "Thu";
		String Friday = "Fri";
		String Saturday = "Sat";
		String weekDay = " " + Sunday + " " + Monday + " " + Tuesday + " " + Wednesday + " " + Thursday + " " + Friday + " " + Saturday;
		Scanner keybd = new Scanner(System.in);
		System.out.println(welcomeMessage);
		System.out.print(System.getProperty("line.separator"));
		System.out.print(instruction);
		int i = keybd.nextInt();
		System.out.print(System.getProperty("line.separator"));
		System.out.println(message);
		System.out.println(message2);
		System.out.print(message3);
		int daycode = keybd.nextInt();
		
		System.out.println();
		
		for(int d = 0; d<months;d++){ // for loop to cycle through, and print, the months
			switch(d) {
				case 0: monthString = " January";
						System.out.printf("%4s",monthString);
						System.out.println(" " + i);
						System.out.println(weekDay);
						for(int x=0; x<daycode; x++){ // Print the correct indentation for the first week of the month
							System.out.print("    ");
						}
						for(int e=1; e<32; e++){ // Counts the number of days in that particular month
							System.out.printf("%4d",e);
							if((e+daycode)%7==0){ // Creates a new line after the Saturday date is printed
								System.out.print("\n");	
							}
						}
						
						//Algorithm to calculate the day that the new month will start on
						if(daycode ==0){ 
							daycode = 3;
						}
						else if(daycode ==1){
							daycode = 4;
						}
						else if(daycode ==2){
							daycode = 5;
						}
						else if(daycode ==3){
							daycode = 6;
						}
						else if(daycode ==4){
							daycode = 0;
						}
						else if(daycode ==5){
							daycode = 1;
						}
						else{
							daycode = 2;
						}
						System.out.print(System.getProperty("line.separator"));
						System.out.print(System.getProperty("line.separator"));						
						break;
						
				case 1: monthString = " February";
						System.out.printf("%4s",monthString);
						System.out.println(" " + i);
						System.out.println(weekDay);
						for(int x=0; x<daycode; x++){
							System.out.print("    ");
						}
						
						//Algorithm to figure out leap year
						if((i%4==0) && (i>=1582)){ //Leap year is divisible by 4 and is after 1582
							if(i%100==0){
								if(i%400==0){ //Leap year every four hundred years, but not every 100
									for(int e=1; e<30; e++){
										System.out.printf("%4d",e);
										if((e+daycode)%7==0){
											System.out.print("\n");	
										}
								}
							}
									else{
										for(int e=1; e<29; e++){
											System.out.printf("%4d",e);
											if((e+daycode)%7==0){
												System.out.print("\n");	
											}
										}
									}
							}
								else{
									for(int e=1; e<30; e++){
										System.out.printf("%4d",e);
										if((e+daycode)%7==0){
											System.out.print("\n");	
										}
									}
								}
						}
							else{ 
								for(int e=1; e<29; e++){
									System.out.printf("%4d",e);
									if((e+daycode)%7==0){
										System.out.print("\n");	
									}
							}
							}
						//Daycode algorithm will change due to leap year. 
						if((i%4==0) && (i>=1582)){
							if(i%100==0){
								if(i%400==0){
									if(daycode ==0){
										daycode = 1;
									}
									else if(daycode ==1){
										daycode = 2;
									}
									else if(daycode ==2){
										daycode = 3;
									}
									else if(daycode ==3){
										daycode = 4;
									}
									else if(daycode ==4){
										daycode = 5;
									}
									else if(daycode ==5){
										daycode = 6;
									}
									else{
										daycode = 0;
									}
								}
							else{
									if(daycode ==0){
									daycode = 0;
									}
									else if(daycode ==1){
										daycode = 1;
									}
									else if(daycode ==2){
										daycode = 1;
									}
									else if(daycode ==3){
										daycode = 3;
									}
									else if(daycode ==4){
										daycode = 4;
									}
									else if(daycode ==5){
										daycode = 5;
									}
									else{
										daycode = 6;
									}
								}
							}
						else{
							if(daycode ==0){
								daycode = 1;
							}
							else if(daycode ==1){
								daycode = 2;
							}
							else if(daycode ==2){
								daycode = 3;
							}
							else if(daycode ==3){
								daycode = 4;
							}
							else if(daycode ==4){
								daycode = 5;
							}
							else if(daycode ==5){
								daycode = 6;
							}
							else{
								daycode = 0;
							}
						}
					}
						System.out.print(System.getProperty("line.separator"));
						System.out.print(System.getProperty("line.separator"));	
						break;
						
				case 2: monthString = " March";
						System.out.printf("%4s",monthString);
						System.out.println(" " + i);
						System.out.println(weekDay);
						for(int x=0; x<daycode; x++){
							System.out.print("    ");
						}
						for(int e=1; e<32; e++){
							System.out.printf("%4d",e);
							if((e+daycode)%7==0){
								System.out.print("\n");	
							}
						}
						if(daycode ==0){
							daycode = 3;
						}
						else if(daycode ==1){
							daycode = 4;
						}
						else if(daycode ==2){
							daycode = 5;
						}
						else if(daycode ==3){
							daycode = 6;
						}
						else if(daycode ==4){
							daycode = 0;
						}
						else if(daycode ==5){
							daycode = 1;
						}
						else{
							daycode = 2;
						}
						System.out.print(System.getProperty("line.separator"));
						System.out.print(System.getProperty("line.separator"));	
						break;
						
				case 3: monthString = " April";
						System.out.printf("%4s",monthString);
						System.out.println(" " + i);
						System.out.println(weekDay);
						for(int x=0; x<daycode; x++){
							System.out.print("    ");
						}
						for(int e=1; e<31; e++){
							System.out.printf("%4d",e);
							if((e+daycode)%7==0){
								System.out.print("\n");	
								}
						}
						if(daycode ==0){
							daycode = 2;
						}
						else if(daycode ==1){
							daycode = 3;
						}
						else if(daycode ==2){
							daycode = 4;
						}
						else if(daycode ==3){
							daycode = 5;
						}
						else if(daycode ==4){
							daycode = 6;
						}
						else if(daycode ==5){
							daycode = 0;
						}
						else{
							daycode = 1;
						}
						System.out.print(System.getProperty("line.separator"));
						System.out.print(System.getProperty("line.separator"));	
						break;
					
				case 4: monthString = " May";
						System.out.printf("%4s",monthString);
						System.out.println(" " + i);
						System.out.println(weekDay);
						for(int x=0; x<daycode; x++){
							System.out.print("    ");
							}
						for(int e=1; e<32; e++){
							System.out.printf("%4d",e);
							if((e+daycode)%7==0){
								System.out.print("\n");	
							}
						}
						if(daycode ==0){
							daycode = 3;
						}
						else if(daycode ==1){
							daycode = 4;
						}
						else if(daycode ==2){
							daycode = 5;
						}
						else if(daycode ==3){
							daycode = 6;
						}
						else if(daycode ==4){
							daycode = 0;
						}
						else if(daycode ==5){
							daycode = 1;
						}
						else{
							daycode = 2;
						}
						System.out.print(System.getProperty("line.separator"));
						System.out.print(System.getProperty("line.separator"));	
						break;
					
			 case 5: monthString = " June";
				System.out.printf("%4s",monthString);
				System.out.println(" " + i);
				System.out.println(weekDay);
				for(int x=0; x<daycode; x++){
					System.out.print("    ");
					}
				for(int e=1; e<31; e++){
					System.out.printf("%4d",e);
				if((e+daycode)%7==0){
					System.out.print("\n");	
					}
				}
				if(daycode ==0){
				daycode = 2;
				}
				else if(daycode ==1){
					daycode = 3;
				}
				else if(daycode ==2){
					daycode = 4;
				}
				else if(daycode ==3){
					daycode = 5;
				}
				else if(daycode ==4){
					daycode = 6;
				}
				else if(daycode ==5){
					daycode = 0;
				}
				else{
					daycode = 1;
				}
				System.out.print(System.getProperty("line.separator"));
				System.out.print(System.getProperty("line.separator"));	
				break;
				
			case 6: monthString = " July";
				    System.out.printf("%4s",monthString);
					System.out.println(" " + i);
					System.out.println(weekDay);
					for(int x=0; x<daycode; x++){
						System.out.print("    ");
						}
					for(int e=1; e<32; e++){
						System.out.printf("%4d",e);
						if((e+daycode)%7==0){
							System.out.print("\n");	
						}
					}
					if(daycode ==0){
						daycode = 3;
					}
					else if(daycode ==1){
						daycode = 4;
					}
					else if(daycode ==2){
						daycode = 5;
					}
					else if(daycode ==3){
						daycode = 6;
					}
					else if(daycode ==4){
						daycode = 0;
					}
					else if(daycode ==5){
						daycode = 1;
					}
					else{
						daycode = 2;
					}
					System.out.print(System.getProperty("line.separator"));
					System.out.print(System.getProperty("line.separator"));	
					break;
					
			case 7: monthString = " August";
					System.out.printf("%4s",monthString);
					System.out.println(" " + i);
					System.out.println(weekDay);
					for(int x=0; x<daycode; x++){
						System.out.print("    ");
						}
					for(int e=1; e<32; e++){
						System.out.printf("%4d",e);
						if((e+daycode)%7==0){								
							System.out.print("\n");	
						}
					}
					if(daycode ==0){
						daycode = 3;
					}
					else if(daycode ==1){
						daycode = 4;						}
					else if(daycode ==2){
							daycode = 5;
					}
					else if(daycode ==3){
						daycode = 6;
					}
					else if(daycode ==4){							
						daycode = 0;
						}
					else if(daycode ==5){
						daycode = 1;
					}
					else{
						daycode = 2;
					}
					System.out.print(System.getProperty("line.separator"));
					System.out.print(System.getProperty("line.separator"));	
					break;
					
			case 8: monthString = " September";
					System.out.printf("%4s",monthString);
					System.out.println(" " + i);
					System.out.println(weekDay);
					for(int x=0; x<daycode; x++){
					System.out.print("    ");
						}
					for(int e=1; e<31; e++){
						System.out.printf("%4d",e);
						if((e+daycode)%7==0){								
							System.out.print("\n");	
						}
					}
					if(daycode ==0){
						daycode = 2;
					}
					else if(daycode ==1){
						daycode = 3;						}
					else if(daycode ==2){
							daycode = 4;
					}
					else if(daycode ==3){
						daycode = 5;
					}
					else if(daycode ==4){							
						daycode = 6;
					}
					else if(daycode ==5){
						daycode = 0;
					}
					else{
						daycode = 1;
					}
					System.out.print(System.getProperty("line.separator"));
					System.out.print(System.getProperty("line.separator"));	
					break;
					
			case 9: monthString = " October";
					System.out.printf("%4s",monthString);
					System.out.println(" " + i);
					System.out.println(weekDay);
					for(int x=0; x<daycode; x++){
						System.out.print("    ");
					}
					for(int e=1; e<32; e++){
						System.out.printf("%4d",e);
						if((e+daycode)%7==0){								
					System.out.print("\n");	
						}
					}
					if(daycode ==0){
						daycode = 3;
					}
					else if(daycode ==1){
						daycode = 4;						}
					else if(daycode ==2){
						daycode = 5;
					}
					else if(daycode ==3){
						daycode = 6;
					}
					else if(daycode ==4){							
						daycode = 0;
					}
					else if(daycode ==5){
						daycode = 1;
					}
					else{
						daycode = 2;
					}
					System.out.print(System.getProperty("line.separator"));
					System.out.print(System.getProperty("line.separator"));	
					break;

			case 10: monthString = " November";
					System.out.printf("%4s",monthString);
					System.out.println(" " + i);
					System.out.println(weekDay);
					for(int x=0; x<daycode; x++){
						System.out.print("    ");
					}
					for(int e=1; e<31; e++){
						System.out.printf("%4d",e);
						if((e+daycode)%7==0){								
							System.out.print("\n");	
						}
					}
					if(daycode ==0){
						daycode = 2;
					}
					else if(daycode ==1){
						daycode = 3;
					}
					else if(daycode ==2){
						daycode = 4;
					}
					else if(daycode ==3){
						daycode = 5;
					}
					else if(daycode ==4){							
						daycode = 6;
					}
					else if(daycode ==5){
						daycode = 0;
					}
					else{
						daycode = 1;
					}
					System.out.print(System.getProperty("line.separator"));
					System.out.print(System.getProperty("line.separator"));	
					break;
					
			case 11: monthString = " December";
					System.out.printf("%4s",monthString);
					System.out.println(" " + i);
					System.out.println(weekDay);
					for(int x=0; x<daycode; x++){
						System.out.print("    ");
					}
					for(int e=1; e<32; e++){
						System.out.printf("%4d",e);
						if((e+daycode)%7==0){								
							System.out.print("\n");	
						}
					}
					break;	
					
			default: monthString = "Invalid Month";
					break;
			}
		}
		
		
		
		
	}

}
