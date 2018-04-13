import java.util.Scanner;

public class ProjectTripPlanner {

    public static void main(String[] args) {


    	intro();
    	budget();
    }

    /** Greet user, ask name and destination
    */
    public static void intro() {
    	Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Trip Planner!");
        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Nice to meet you " + name + ", where are you travelling to?");
        String destination = input.nextLine();
        System.out.println("Great!" + destination + " sounds like a great trip.");
        System.out.println("**********");

    }

    /** Takes in days planned on trip,
     allowance and converting info */
    public static void budget() {
    	Scanner input = new Scanner(System.in);

    	// days
    	System.out.println("");
    	System.out.println("How many days are you going to spend travelling?");
    	int days = input.nextInt();
    	while (days < 0){
    		System.out.println("As far as I know, timetravel is not yet possible");
	    	System.out.println("How many days are you going to spend travelling?");
	    	days = input.nextInt();
	    }
	    while (days == 0) {
	    	System.out.println("Zero days? That seems impossible!");
	    	System.out.println("How many days are you going to spend travelling?");
	    	days = input.nextInt();
	    }

	    // allowance
	    System.out.println("How much money, in USD, are you planning to spend on your trip?");
	    double allowance = input.nextDouble();


	    // converting info
	    System.out.println("What is the currency for your travel destination?");
	    input.nextLine(); // consume newline leftover from nextInt
	    String currency = input.nextLine();
	    System.out.println("How many " + currency + " are in 1 USD?");
	    double conversionRate = input.nextDouble();

	    // output
	    int hoursTravelled = days * 24;
	    int minutesTravelled = days * 24 * 60;
	    System.out.println("If you are travelling for " + days + " days that is the same as " + hoursTravelled + " hours or " + minutesTravelled + " minutes.");
	    double allowancePerDay = (int) (allowance/days*100) / 100.0;
	    System.out.println("If you are going to spend $" + allowance + " USD that means per day you can spend up to $" + allowancePerDay + " USD.");
	    double allowanceInCurrency = allowance * conversionRate;
	    double allowanceInCurrencyPerDay = (int) (allowanceInCurrency / days * 100) / 100.0;
	    System.out.println("Your total budget in " + currency + " is " + allowanceInCurrency + ", which per day is " + allowanceInCurrencyPerDay + " " + currency);
    }

    /** Takes in time difference between home and destination 
    */
    public static void time() {
    	Scanner input = new Scanner(System.in);

    }

    /** Takes in distance between home and destination in square kilometers and
    converts it into square miles
    */
    public static void distance() {
    	Scanner input = new Scanner(System.in);

    	// kilometers * 0.62137 = miles
    }

}