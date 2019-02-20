import java.util.Scanner;

class Day {
	
	protected static int lp = 0;

	public static int checkLeapYear(int year) {
		int x = 0;
		if(year % 100 == 0) {
			if(year % 400 == 0) {
				lp++;	
			}
			else {
			}
		} else {
			if(year % 4 == 0) {
				lp++;
			}
			else {
			}
		}
		//System.out.print(lp);
		return x;
	}

	public static boolean isValidate(int year, int month, int day) {

		if(month == 0) {
			return false;
		}
		if(month == 1){
			if(day <= 31) {
				return true;
			} else {
				return false;
			}	
		}
		if(month == 2){
			if(day <=29) {
				return true;
			} else {
				return false;
			}	
		}
		if(month == 3){
			if(day <= 31) {
				return true;
			} else {
				return false;
			}	
		}
		if(month == 4){
			if(day <= 30) {
				return true;
			} else {
				return false;
			}	
		}
		if(month == 5){
			if(day <= 31) {
				return true;
			} else {
				return false;
			}	
		}
		if(month == 6){
			if(day <= 30) {
				return true;
			} else {
				return false;
			}	
		}
		if(month == 7){
			if(day <= 31) {
				return true;
			} else {
				return false;
			}	
		}
		if(month == 8){
			if(day <= 31) {
				return true;
			} else {
				return false;
			}	
		}
		if(month == 9){
			if(day <= 30) {
				return true;
			} else {
				return false;
			}	
		}
		if(month == 10){
			if(day <= 31) {
				return true;
			} else {
				return false;
			}	
		}
		if(month == 11){
			if(day <= 30) {
				return true;
			} else {
				return false;
			}	
		}
		if(month == 12){
			if(day <= 31) {
				return true;
			} else {
				return false;
			}	
		}
		return true;
	}

	public static void main(String args[]) throws Exception{

			Scanner k = new Scanner(System.in);	

			int year;
			int month;
			int day;
			System.out.println("----------------Welcome----------------\n" + "Enter Days[upto 0-31] \n" +
			 "Enter Months in[1-Jan,2-Feb.....12-Dec]");
			do {
				System.out.println("Enter Year");
				year = k.nextInt();
				System.out.println("Enter Month");
				month = k.nextInt();
				System.out.println("Enter Day");
				day = k.nextInt();
			} while(isValidate(year, month, day) != true); 

			int od = 0;
			int odyear[] = {400, 800, 1600, 2000};
			
			checkLeapYear(year);
			
			int leapYear = 0;
			int notLeapYear = 0;

			year = year - 1;

			for(int i = 0; i < odyear.length; i++) {
				if(year >= 2000){
					year = year - 2000;
					od = 0;
				} else if(year >= 1600) {
					year = year - 1600;
					od = 0;
				} 
			}

			//System.out.println(od);
			//System.out.println(year);

			while(year > 0){
				if(year%100 == 0) {
					if(year%400==0){
						//System.out.println("Leap Year");
						leapYear++;
					} else {
						//System.out.println("Not a Leap Year");
						notLeapYear++;
					}
				}
				else {
					if(year%4 == 0){
						//System.out.println("Leap Year");
						leapYear++;
					} else {
						//System.out.println("Not a Leap Year");
						notLeapYear++;
					}
				}
				year--;
			}
			int yearSum = (leapYear * 2) + notLeapYear;
			od = od + (yearSum % 7);
			//System.out.println(od);

			if(month == 1) {
				od = od + (day % 7);
				od = od % 7;
			}
			if(month == 2) {
				int x = 3 + day;
				od = od + (x % 7);
				od = od % 7;
			}
			if(month == 3) {
				if(lp == 1) {
					int x = 3 + 1 + day;
					od = od + (x % 7);
					od = od % 7;
				} else {
					int x = 3 + 0 + day;
					od = od + (x % 7);
					od = od % 7;
				}
			}
			if(month == 4){
				if(lp == 1) {
					int x = 3 + 1 + 3 + day;
					od = od + (x % 7);
					od = od % 7;
				} else {
					int x = 3 + 0 + 3 + day;
					od = od + (x % 7);
					od = od % 7;
				}
			}
			if(month == 5) {
				if(lp == 1) {
					int x = 3 + 1 + 3 + 2 + day;
					od = od + (x % 7);
					od = od % 7;
				} else {
					int x = 3 + 0 + 3 + 2 + day;
					od = od + (x % 7);
					od = od % 7;
				}
			}
			if(month == 6) {
				if(lp == 1) {
					int x = 3 + 1 + 3 + 2 + 3 + day;
					od = od + (x % 7);
					od = od % 7;
				} else {
					int x = 3 + 0 + 3 + 2 + 3 + day;
					od = od + (x % 7);
					od = od % 7;
				}
			}
			if(month == 7) {
				if(lp == 1) {
					int x = 3 + 1 + 3 + 2 + 3 + 2 + day;
					od = od + (x % 7);
					od = od % 7;
				} else {
					int x = 3 + 0 + 3 + 2 + 3 + 2 + day;
					od = od + (x % 7);
					od = od % 7;
				}
			}
			if(month == 8) {
				if(lp == 1) {
					int x = 3 + 1 + 3 + 2 + 3 + 2 + 3 + day;
					od = od + (x % 7);
					od = od % 7;
				} else {
					int x = 3 + 0 + 3 + 2 + 3 + 2 + 3 + day;
					od = od + (x % 7);
					od = od % 7;
				}
			}		
			if(month == 9) {
				if(lp == 1) {
					int x = 3 + 1 + 3 + 2 + 3 + 2 + 3 + 3 + day;
					od = od + (x % 7);
					od = od % 7;
				} else {
					int x = 3 + 0 + 3 + 2 + 3 + 2 + 3 + 3 + day;
					od = od + (x % 7);
					od = od % 7;
				}
			}
			if(month == 10) {
				if(lp == 1) {
					int x = 3 + 1 + 3 + 2 + 3 + 2 + 3 + 3 + 2 + day;
					od = od + (x % 7);
					od = od % 7;
				} else {
					int x = 3 + 0 + 3 + 2 + 3 + 2 + 3 + 3 + 2 + day;	
					od = od + (x % 7);
					od = od % 7;
				}
			}		
			if(month == 11) {
				if(lp == 1) {
					int x = 3 + 1 + 3 + 2 + 3 + 2 + 3 + 3 + 2 + 3 + day;
					od = od + (x % 7);
					od = od % 7;
				} else {
					int x = 3 + 0 + 3 + 2 + 3 + 2 + 3 + 3 + 2 + 3 + day;
					od = od + (x % 7);
					od = od % 7;
				}
			}
			if(month == 12) {
				if(lp == 1) {
					int x = 3 + 1 + 3 + 2 + 3 + 2 + 3 + 3 + 2 + 3 + 2 + day;
					od = od + (x % 7);
					od = od % 7;
					//System.out.println(od);
				} else {
					int x = 3 + 0 + 3 + 2 + 3 + 2 + 3 + 3 + 2 + 3 + 2 + day;
					od = od + (x % 7);
					od = od % 7;
					//System.out.println(od);
				}
			}		
			
			//System.out.println(od);
			
			if(od == 0){
				System.out.println("Sunday");
			}	
			if(od == 1){
				System.out.println("Monday");
			}
			if(od == 2){
				System.out.println("Tuesday");
			}
			if(od == 3){
				System.out.println("Wednesday");
			}
			if(od == 4){
				System.out.println("Thusday");
			}
			if(od == 5){
				System.out.println("Friday");
			}
			if(od == 6){
				System.out.println("Saturday");
			}
	}
}
//Shivam Patil[97]