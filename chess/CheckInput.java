package chess;

public class CheckInput {
	int x;
	int y;
	
	//This method requires your input
	public boolean checkCoordinateValidity(String input){
		if(input.equals("END")| input.equals("end")){
			System.out.println("Game is force ended."); 
			System.exit(0);
		}else if(input.equals("board") | input.equals("BOARD") ){
			Board.printBoard(); //developing mode
		}
		
		if(input.length() == 2){
			if ((input.substring(0,1).equals("1")) | (input.substring(0,1).equals("2")) | (input.substring(0,1).equals("3")) | (input.substring(0,1).equals("4")) | (input.substring(0,1).equals("5")) | (input.substring(0,1).equals("6")) | (input.substring(0,1).equals("7")) | (input.substring(0,1).equals("8"))) {
				
				switch(input.substring(0,1)){
					case "1": 
						x=0;
						break;
					case "2":
						x=1;
						break;
					case "3":
						x=2;
						break;
					case "4":
						x=3;
						break;
					case "5":
						x=4;
						break;
					case "6":
						x=5;
						break;
					case "7":
						x=6;
						break;
					case "8":
						x=7;
						break;
				
				}
				// System.out.println(x);
				if(input.substring(1,2).equals("a") | input.substring(1,2).equals("b") | input.substring(1,2).equals("c") | input.substring(1,2).equals("d") | input.substring(1,2).equals("e") | input.substring(1,2).equals("f") | input.substring(1,2).equals("g") | input.substring(1,2).equals("h")){
				//   return true;
				  switch(input.substring(1,2)){
					case "a": 
						y=0;
						break;
					case "b":
						y=1;
						break;
					case "c":
						y=2;
						break;
					case "d":
						y=3;
						break;
					case "e":
						y=4;
						break;
					case "f":
						y=5;
						break;
					case "g":
						y=6;
						break;
					case "h":
						y=7;
						break;
				    }
					// System.out.println("true");
					return true;
					
					

				}else{
					System.out.println("input is invalid, please enter it again.");
					return false;
				}
			}else{
				System.out.println("input is invalid, please enter it again.");
				return false;
			}
		}else if(input.equals("board") | input.equals("BOARD") ){

			if(Game.turns == "Whites"){
				System.out.println("------ Whites move ------");
			}else{
				System.out.println("------ Blacks move ------");
			}
			return false;
		}else{
			System.out.println("input length check is failed, please enter 2 digits.");
			return false;
		}
    }
}
