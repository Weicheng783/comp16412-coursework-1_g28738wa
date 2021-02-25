package chess;
import java.io.Console;

public class Game {
	private static boolean gameEnd=false;
	static int a;

	//This method requires your input
	public static void play(){
		
		while (!gameEnd){
			CheckInput ci = new CheckInput();
			
			// CheckInput ci = null;
			if(a == 0){
				a = 1;
				System.out.println("------ Whites move ------");
				
			}else{
				a = 0;
				System.out.println("------ Blacks move ------");
			}
			
			Console consoleIn = System.console();
				String origin;
				do{
					origin = consoleIn.readLine("> Enter origin: ");
					
				}while(ci.checkCoordinateValidity(origin) == false);
				String destination;
				do{
					destination = consoleIn.readLine("> Enter destination: ");
				}while(ci.checkCoordinateValidity(destination) == false);
			
		}		
	}
	
	//This method should not be edited
	public static void main (String args[]){
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();	}
}
