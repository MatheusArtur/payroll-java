import java.util.Scanner;

public class Payment {

    public static Scanner input = new Scanner(System.in);
    static final int size = 100;
    
    public static void main(String[] args) {
	String commandString, placer;
	int currentDay;
	
	String aux;
	int intAux;
	String manualString = "\tPossible commands for the system listed below:\n"
	    + "\tadd - Add a new employee\n" + "\tedit - Edit an existing employee\n"
	    + "\tlaunch sale - Launch a sale revenue.\n"
	    + "\tlaunch pointcard - Launch hourly employee pointcard.\n"
	    + "\tservice fee - Launch a service fee.\n"
	    + "\trun payroll - Run payroll for the current day\n" + "\tundo- Undo last operation.\n"
	    + "\tnew agenda - Register a new agenda.\n" + "\texit- Exit the program.\n"
	    + "\thelp - Show this menu.\n";
	

	int globalId = 1;
	
	String [][]employees = new String[size][13];
		
	int [][]undoInts = new int[10][4];
	String [][][]undoEmployees = new String[10][size][10];

	int [][]redoInts = new int[10][4];
	String [][][]redoEmployees = new String[10][size][10];

	System.out.println("Please enter current day:");
	currentDay = input.nextInt();
	
	

	while (true) {

	    System.out.println("payroll> ");
	    commandString = input.nextLine();

	    if (commandString.equals("add")) {
		
		System.out.println("Fill the folowing fields:");
		
		System.out.print("\tName: ");
		aux = input.nextLine();
		employees[globalId][0] = aux;
		
		System.out.print("\tAdress: ");
		aux = input.nextLine();
		employees[globalId][1] = aux;
		
		System.out.print("\tType < salaried | commisioned | hourly >: ");
		aux = input.nextLine();
		employees[globalId][2] = aux;

		while(true)
		    {
			System.out.print("\tType < salaried | commisioned | hourly >: ");
			aux = input.nextLine();
			employees[globalId][2] = aux;
		
			if(aux.equals("salaried")){
			    System.out.print("\tEnter payment (numbers only): ");
			    aux = input.nextLine();
			    employees[globalId][3] = aux;
			    break;
			}
			else if(aux.equals("comissioned")){
			    System.out.print("\tEnter payment (numbers only): ");
			    aux = input.nextLine();
			    employees[globalId][3] = aux;

			    System.out.print("\tEnter percentage (%) on sales (numbers only): ");
			    aux = input.nextLine();
			    employees[globalId][4] = aux;
			    break;
			}
			else if(aux.equals("hourly")){
			    employees[globalId][3] = "-1";
			    employees[globalId][4] = "-1";

			    System.out.print("\tEnter payment per worked hour (numbers only): ");
			    aux = input.nextLine();
		    
			    employees[globalId][5] = aux;
			    break;
			}
			else {
			    System.out.printf("\tInvalid!%n");
			}
		    }
		
					
		System.out.print("\tPayment method < Mail | Bank | by Hand >: ");
		aux = input.nextLine();
		employees[globalId][6] = aux;
		
		System.out.print("\tBelongs to the Union < yes | no >: ");
		aux = input.nextLine();
		employees[globalId][7] = aux;
		
		if(aux.equals("yes")){
		    System.out.print("\tEnter monthly union fee(numbers only): ");
		    aux = input.nextLine();
		    employees[globalId][8] = aux;
		}
		else {
		    
		}
		
		System.out.printf("\t%nWARNING: Your newly created employee has ID: %d%n%n", globalId);
		globalId++;

	    } else if (commandString.equals("edit")) {

		System.out.println("Please input user ID:");
		intAux = input.nextInt();

		
		System.out.println("Fill the folowing fields:");
		
		System.out.print("\tName: ");
		aux = input.nextLine();
		employees[intAux][0] = aux;
		
		System.out.print("\tAdress: ");
		aux = input.nextLine();
		employees[intAux][1] = aux;
		
		while(true)
		    {
			System.out.print("\tType < salaried | commisioned | hourly >: ");
			aux = input.nextLine();
			employees[intAux][2] = aux;
		
			if(aux.equals("salaried")){
			    System.out.print("\tEnter payment (numbers only): ");
			    aux = input.nextLine();
			    employees[intAux][3] = aux;
			    employees[intAux][4] = "-1";
			    employees[intAux][5] = "-1";
			    break;
			}
			else if(aux.equals("comissioned")){
			    System.out.print("\tEnter payment (numbers only): ");
			    aux = input.nextLine();
			    employees[intAux][3] = aux;

			    System.out.print("\tEnter percentage (%) on sales (numbers only): ");
			    aux = input.nextLine();
			    employees[intAux][4] = aux;
			    employees[intAux][5] = "-1";
			    break;
			}
			else if(aux.equals("hourly")){
			    employees[intAux][3] = "-1";
			    employees[intAux][4] = "-1";

			    System.out.print("\tEnter payment per worked hour (numbers only): ");
			    aux = input.nextLine();
		    
			    employees[intAux][5] = aux;
			    break;
			}
			else {
			    System.out.printf("\tInvalid!%n");
			}
		    }
					
		System.out.print("\tPayment method < Mail | Bank | by Hand >: ");
		aux = input.nextLine();
		employees[intAux][6] = aux;
		
		System.out.print("\tBelongs to the Union < yes | no >: ");
		aux = input.nextLine();
		employees[intAux][7] = aux;
		
		if(aux.equals("yes")){
		    System.out.print("\tEnter monthly union fee(numbers only): ");
		    aux = input.nextLine();
		    employees[intAux][8] = aux;
		}
		else {
		    
		}
	    } else if (commandString.equals("remove")) {
		System.out.println("Please input user ID:");
		intAux = input.nextInt();

		employees[intAux][1] = "null";
		employees[intAux][2] = "null";
		employees[intAux][3] = "null";
		employees[intAux][4] = "null";
		employees[intAux][5] = "null";
		employees[intAux][6] = "null";
		employees[intAux][7] = "null";
		employees[intAux][8] = "null";
		employees[intAux][9] = "null";

	    }
	    else if (commandString.equals("launch sale")) {
		System.out.println("Please input user ID:");
		intAux = input.nextInt();

		placer = employee[intAux][2];
		if(placeer.equals("commisioned"))
		    {
			System.out.print("\tEnter payment per worked hour (numbers only): ");
			aux = input.nextLine();
			employees[intAux][9] = aux;
		    }
		else
		    {
			System.out.printf("\tInvalid! user is not commisioned%n");
		    }
	    }
	    else if (commandString.equals("launch pointcard")) {
		System.out.println("Please input user ID:");
		intAux = input.nextInt();

		placer = employee[intAux][2];
		if(placeer.equals("hourly"))
		    {
			System.out.print("\tEnter worked hours today (numbers only): ");
			aux = input.nextLine();
			employees[intAux][10] = aux;
		    }
		else
		    {
			System.out.printf("\tInvalid! user is not commisioned%n");
		    }
	    }
	    else if (commandString.equals("service fee")) {
		System.out.println("Please input user ID:");
		intAux = input.nextInt();

		placer = employee[intAux][7];
		if(placeer.equals("yes"))
		    {
			System.out.print("\tEnter tariff price (numbers only): ");
			aux = input.nextLine();
			employees[intAux][11] = aux;
		    }
		else
		    {
			System.out.printf("\tInvalid! user is not commisioned%n");
		    }
	    } else if (commandString.equals("run payroll")) {

	    } else if (commandString.equals("undo")) {

	    } else if (commandString.equals("redo")) {

	    } else if (commandString.equals("new agenda")) {
		System.out.println("Please input user ID:");
		intAux = input.nextInt();

		System.out.print("\tEnter cicle < monthly | bimonthly | weekly >: ");
		aux = input.nextLine();
		employees[intAux][12] = aux;

		System.out.print("\tEnter day, for monthly: 1-31 | for :bimonthly 1-15 | for weekly 1-7: ");
		aux = input.nextLine();
		employees[intAux][13] = aux;

		
	    } else if (commandString.equals("exit")) {

	    } else if (commandString.equals("help") || commandString.equals("?")) {
		System.out.println(manualString);
	    } else {
		System.out.println("Invalid operation! check 'help' or '?' for avaliable commands");
	    }
	}
	
    }
}

