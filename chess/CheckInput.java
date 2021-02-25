package chess;

public class CheckInput {
	
	//This method requires your input
	public boolean checkCoordinateValidity(String input){
		if(input.equals("END")){
			System.exit(0);
		}
		
		if(input.length() == 2){
			if ((input.substring(0,1).equals("1")) | (input.substring(0,1).equals("2")) | (input.substring(0,1).equals("3")) | (input.substring(0,1).equals("4")) | (input.substring(0,1).equals("5")) | (input.substring(0,1).equals("6")) | (input.substring(0,1).equals("7")) | (input.substring(0,1).equals("8"))) {
				if(input.substring(1,2).equals("a") | input.substring(1,2).equals("b") | input.substring(1,2).equals("c") | input.substring(1,2).equals("d") | input.substring(1,2).equals("e") | input.substring(1,2).equals("f") | input.substring(1,2).equals("g") | input.substring(1,2).equals("h")){
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}else{
			return false;
		}
    }
}
