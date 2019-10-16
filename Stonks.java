import java.util.Scanner;

public class Stonks {

    public static Scanner input = new Scanner(System.in);
    static final int size = 100;
    
	public static void main(String[] args) {
	String commandString;
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
	
	String []schedules = new String[20];
	schedules[0] = "mensal";
	schedules[1] = "semanal 1 sexta";
	schedules[2] = "semanal 2 sexta";
	
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
		
		System.out.printf("\tYour newly created employee has ID: %d%n", globalId);
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
		
		System.out.print("\tType < salaried | commisioned | hourly >: ");
		aux = input.nextLine();
		employees[intAux][2] = aux;
		
		if(aux.equals("salaried")){
		    System.out.print("\tEnter payment (numbers only): ");
		    aux = input.nextLine();
		    employees[intAux][3] = aux;
		}
		else if(aux.equals("comissioned")){
		    System.out.print("\tEnter payment (numbers only): ");
		    aux = input.nextLine();
		    employees[intAux][3] = aux;

		    System.out.print("\tEnter percentage (%) on sales (numbers only): ");
		    aux = input.nextLine();
		    employees[intAux][4] = aux;
		}
		else{
		    employees[intAux][3] = "-1";
		    employees[intAux][4] = "-1";

		    System.out.print("\tEnter payment per worked hour (numbers only): ");
		    aux = input.nextLine();
		    
		    employees[intAux][5] = aux;
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

	    } else if (commandString.equals("launch sale")) {

	    } else if (commandString.equals("launch pointcard")) {

	    } else if (commandString.equals("service fee")) {

	    } else if (commandString.equals("run payroll")) {

	    } else if (commandString.equals("undo")) {

	    } else if (commandString.equals("redo")) {

	    } else if (commandString.equals("new agenda")) {

	    } else if (commandString.equals("exit")) {

	    } else if (commandString.equals("help") || commandString.equals("?")) {
		System.out.println(manualString);
	    } else {
		System.out.println("Invalid operation! check 'help' or '?' for avaliable commands");
	    }
	}
	
    }
}

