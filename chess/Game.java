package chess;
import java.io.Console;

public class Game {
	private static boolean gameEnd=false;
	static String turns = "Whites";
	static int ox;
	static int oy;
	static int dx;
	static int dy;
	static boolean turnsCheck;
	static String destination;

	//This method requires your input
	public static void play(){
		
		while (!gameEnd){
			CheckInput ci = new CheckInput();
			
			// CheckInput ci = null;
			if(turns == "Whites"){
				
				System.out.println("------ Whites move ------");
				
			}else{
				
				System.out.println("------ Blacks move ------");
			}
			
			do{
			    Console consoleIn = System.console();
				String origin;
				do{
					consoleIn = System.console();
				 do{
					origin = consoleIn.readLine("> Enter origin: ");
					// System.out.println(ci.x);
					// System.out.println(ci.y);
					ci.checkCoordinateValidity(origin);
					
				 }while(ci.checkCoordinateValidity(origin) == false | Board.hasPiece(ci.x,ci.y)==false );
					// System.out.println(Board.hasPiece(ci.x,ci.y));
					if(turns == "Whites"){
						// turns = "Blacks";
						if(Board.getPiece(ci.x,ci.y).colour == PieceColour.WHITE){
							turnsCheck = true;
							// System.out.println("1");
						}else{
							System.out.println("Turns check failed, WHITE chess move, but you selected black chess.");
							turnsCheck = false;
							// System.out.println("2");
							// System.out.println(Board.getPiece(ci.x,ci.y).getColour());
						}
					}else{
						// turns = "Whites";
						if(Board.getPiece(ci.x,ci.y).colour == PieceColour.BLACK){
							turnsCheck = true;
						}else{
							System.out.println("Turns check failed, BLACK chess move, but you selected white chess.");
							turnsCheck = false;
						}
													
					}
					// System.out.println(turnsCheck);
				}while(turnsCheck == false);
				ox=ci.x;
				oy=ci.y;
				

				destination = consoleIn.readLine("> Enter destination: ");
				ci.checkCoordinateValidity(destination);

				dx=ci.x;
				dy=ci.y;


			}while(ci.checkCoordinateValidity(destination) == false | Board.getPiece(ox,oy).isLegitMove(ox,oy,ci.x,ci.y) == false );
				if(Board.hasPiece(ci.x,ci.y)){
					if(Board.getPiece(ci.x,ci.y).getSymbol()=="\u2654" | Board.getPiece(ci.x,ci.y).getSymbol()=="\u265A"){
						Game.gameEnd = true;
					}
				}
				Board.movePiece(ox,oy,dx,dy,Board.getPiece(ox,oy));
				Board.printBoard();
				if(turns=="Whites"){
					turns="Blacks";
				}else{
					turns="Whites";
				}

				
		}	

		System.out.println("The Game is Over now.");
		if(turns == "Blacks"){
			turns = "Whites";
		}else{
			turns = "Blacks";
		}

		System.out.println("The Winner is " + turns + " player! Congrats!");

		System.exit(0);			
	}
	
	//This method should not be edited
	public static void main (String args[]){
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();	}
}
