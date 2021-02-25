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
        if(c-a==0 && d-b>0){
            if(d-b==2){
                if( getColour() == WHITE ){
                    if(b==6 && (a>=0 && a<=7) ){
                        
                    }
                }else if( getColour() == BLACK){
                    if(b==2 && (a>=0 && a<=7) ){

                    }

                }else{
                    return false;
                }
            }else if(d-b==1){

            }
        }else{
            return false;
        }

    }
}
