package chess;

public class Bishop extends Piece{
    public Bishop (PieceColour a){
        //  super(colour);
        // Bishop.colour = a;
        if(a == PieceColour.WHITE){
            setSymbol("\u2657");
        }else{
            setSymbol("\u265D");
        }
    }

    public boolean isLegitMove(int a, int b, int c, int d){
        if( (d-b==c-a) | (d-b==-(c-a)) ){
            return true;
        }else{
            return false;
        }
    }
}

