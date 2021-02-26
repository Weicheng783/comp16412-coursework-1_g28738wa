package chess;
import java.io.Console;

public class Game {
	private static boolean gameEnd=false;
	static int turns;
	static int ox;
	static int oy;
	static int dx;
	static int dy;
	static boolean turnsCheck;

	//This method requires your input
	public static void play(){
		
		while (!gameEnd){
			CheckInput ci = new CheckInput();
			
			// CheckInput ci = null;
			if(turns == 0){
				turns = 1;
				System.out.println("------ Whites move ------");
				
			}else{
				turns = 0;
				System.out.println("------ Blacks move ------");
			}
			
			do{
			    Console consoleIn = System.console();
				String origin;
				do{
				 do{
					origin = consoleIn.readLine("> Enter origin: ");
					// System.out.println(ci.x);
					// System.out.println(ci.y);
					
				 }while(ci.checkCoordinateValidity(origin) == false | Board.hasPiece(ci.x,ci.y)==false );
					// System.out.println(Board.hasPiece(ci.x,ci.y));
					if(turns == 1){
						if(Board.getPiece(ci.x,ci.y).colour == PieceColour.WHITE){
							turnsCheck = true;
							// System.out.println("1");
						}else{
							turnsCheck = false;
							// System.out.println("2");
							// System.out.println(Board.getPiece(ci.x,ci.y).getColour());
						}
					}else{
						if(Board.getPiece(ci.x,ci.y).colour == PieceColour.BLACK){
							turnsCheck = true;
						}else{
							turnsCheck = false;
						}
													
					}
					// System.out.println(turnsCheck);
				}while(turnsCheck == false);
				ox=ci.x;
				oy=ci.y;
				String destination;
				do{
					destination = consoleIn.readLine("> Enter destination: ");
				}while(ci.checkCoordinateValidity(destination) == false | Board.getPiece(ox,oy).isLegitMove(ox,oy,ci.x,ci.y) == false );
				dx=ci.x;
				dy=ci.y;
			}while(Board.movePiece(ox,oy,dx,dy,Board.getPiece(ox,oy))==false );

				Board.printBoard();
				
		}		
	}
	
	//This method should not be edited
	public static void main (String args[]){
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();	}
}
