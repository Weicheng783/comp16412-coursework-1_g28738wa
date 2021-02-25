package chess;

public class Pawn extends Piece{	
	public Pawn (PieceColour a){
        // super(symbolIn);
        // Pawn.colour = a;
        if(a == PieceColour.WHITE){
            setSymbol("\u2659");
        }else{
            setSymbol("\u265F");
        }
        
    }

    public boolean isLegitMove(int a, int b, int c, int d){
        if(d-b>0){//Blacks move
            if(d-b==2){

                if(c-a==1 | c-a==-1){
                    if(Board.hasPiece(c,d)==true){
                        if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                            return true;
                        }else{
                            return false;
                        }

                    }else{
                        return false;
                    }
                }else{
                 if(b==1 && (a>=0 && a<=7) ){
                    if(Board.hasPiece(c,d)==true){
                        return false;
                    }else if(Board.hasPiece(c,d+1)==true){
                        return false;
                    }else{
                        return true;
                    }

                 }else{
                     return false;
                 }

                }

 
            }else if(d-b==1){
                if(c-a==1 | c-a==-1){
                    if(Board.hasPiece(c,d)==true){
                        if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                            return true;
                        }else{
                            return false;
                        }

                    }else{
                        return false;
                    }
                }else{
                    if(Board.hasPiece(c,d)==true){
                        return false;
                    }else{
                        return true;
                    }
                }

            }

        }else if(d-b<0){//Whites move
            if(b-d==2){

                if(c-a==1 | c-a==-1){
                    if(Board.hasPiece(c,d)==true){
                        if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                            return true;
                        }else{
                            return false;
                        }

                    }else{
                        return false;
                    }
                }else{
                 if(b==6 && (a>=0 && a<=7) ){
                    if(Board.hasPiece(c,d)==true){
                        return false;
                    }else if(Board.hasPiece(c,d-1)==true){
                        return false;
                    }else{
                        return true;
                    }

                 }else{
                     return false;
                 }

                }

 
            }else if(b-d==1){
                if(c-a==1 | c-a==-1){
                    if(Board.hasPiece(c,d)==true){
                        if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                            return true;
                        }else{
                            return false;
                        }

                    }else{
                        return false;
                    }
                }else{
                    if(Board.hasPiece(c,d)==true){
                        return false;
                    }else{
                        return true;
                    }
                }

            }

        }else{
            return false;
        }
        return false;
    }
}
