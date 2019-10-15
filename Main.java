import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    static final int size = 100;
    
    public static void main(String[] args) {
	String commandString;
	int currentDay;
	String manualString = "\t1- Adicao de um empregado\n"
	    +"\t2- Remocao de um empregado\n"
	    +"\t3- Lancar um cartao de ponto\n"
	    +"\t4- Lancar um resultado de venda\n"
	    +"\t5- Lancar uma taxa de servico\n"
	    +"\t6- Alterar detalhes de um empregado\n"
	    +"\t7- Rodar a folha de pagamento para hoje\n"
	    +"\t8- Undo/redo\n"
	    +"\t9- Agenda de pagamento\n"
	    +"\t10- Criacao de novas agendas de pagamento\n";
	//TODO STARTUP CALENDAR
	currentDay = input.nextInt();
	
		while (1) {
		    
		    if (commandString.equals("add")) {
			    
		    }
		    else if(commandString.equals("edit")){
			
		    }
		    else if(commandString.equals("remove")){
			
		    }
		    else if(commandString.equals("launch sale")){
			
		    }
		    else if(commandString.equals("launch pointcard")){
			
		    }
		    else if(commandString.equals("service fee")){
			
		    }
		    else if(commandString.equals("run payroll")){
			
		    }
		    else if(commandString.equals("undo")){
			
		    }
		    else if(commandString.equals("redo")){
			
		    }
		    else if(commandString.equals("new agenda")){
			
		    }
		    else if(commandString.equals("exit")){
			
		    }
		    else if(commandString.equals("help") || commandString.equals("?")){
			
		    }
		    else{
			
		    }

		}
    }    
}

