package chess;

public class Pawn extends Piece{	
	public Pawn (PieceColour a){
        // super(symbolIn);
        // Pawn.colour = a;
        colour = a;
        if(a == PieceColour.WHITE){
            setSymbol("\u2659");
        }else{
            setSymbol("\u265F");
        }
        
    }

    @Override
    public boolean isLegitMove(int a, int b, int c, int d){
        if(c-a>0){//Blacks move
            if(c-a==2){

                if(d-b==1 | d-b==-1){
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
                 if(a==1 && (b>=0 && b<=7) ){
                    if(Board.hasPiece(c,d)==true){
                        return false;
                    }else if(Board.hasPiece(c-1,d)==true){
                        return false;
                    }else{
                        return true;
                    }

                 }else{
                     return false;
                 }

                }

 
            }else if(c-a==1){
                if(d-b==1 | d-b==-1){
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

        }else if(c-a<0){//Whites move
            if(a-c==2){

                if(d-b==1 | d-b==-1){
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
                 if(a==6 && (b>=0 && b<=7) ){
                    if(Board.hasPiece(c,d)==true){
                        return false;
                    }else if(Board.hasPiece(c+1,d)==true){
                        return false;
                    }else{
                        return true;
                    }

                 }else{
                     return false;
                 }

                }

 
            }else if(a-c==1){
                if(d-b==1 | d-b==-1){
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
