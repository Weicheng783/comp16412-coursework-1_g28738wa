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
					
					
				 }while(ci.checkCoordinateValidity(origin) == false | Board.hasPiece(ci.x,ci.y)==false );
					
					if(turns == 0){
						if(Board.getPiece(ci.x,ci.y).colour == PieceColour.WHITE){
							turnsCheck = true;
						}else{
							turnsCheck = false;
						}
					}else{
						if(Board.getPiece(ci.x,ci.y).colour == PieceColour.BLACK){
							turnsCheck = true;
						}else{
							turnsCheck = false;
						}
													
					}
				}while(turnsCheck == false);
				ox=ci.x;
				oy=ci.y;
				String destination;
				do{
					destination = consoleIn.readLine("> Enter destination: ");
				}while(ci.checkCoordinateValidity(destination) == false );
				dx=ci.x;
				dy=ci.y;
			}while( Board.getPiece(ox,oy).isLegitMove(ox,oy,dx,dy) == false );

				if(Board.movePiece(ox,oy,dx,dy,Board.getPiece(ox,oy))==true){
					Board.printBoard();
				}

			
		}		
	}
	
	//This method should not be edited
	public static void main (String args[]){
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();	}
}
