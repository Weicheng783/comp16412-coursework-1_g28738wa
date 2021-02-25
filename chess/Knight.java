package chess;

public class Knight extends Piece{
    public Knight (PieceColour a){
        // super(symbolIn);
        // Knight.colour = a;
        if(a == PieceColour.WHITE){
            setSymbol("\u2658");
        }else{
            setSymbol("\u265E");
        }
        
    }

    public boolean isLegitMove(int a, int b, int c, int d){
        if( (c-a==2 | c-a==-2) && (d-b==1 | d-b==-1) ){
            return true;
        }else if( (c-a==1 | c-a==-1) && (d-b==-2 | d-b==2) ){
            return true;
        }else{
            return false;
        }
    }
}
