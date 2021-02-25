package chess;

public class Queen extends Piece{
    public Queen (PieceColour a){
        // super(symbolIn);
        // Queen.colour = a;
        if(a == PieceColour.WHITE){
            setSymbol("\u2655");
        }else{
            setSymbol("\u265B");
        }
    }

    public boolean isLegitMove(int a, int b, int c, int d){
        if(c-a==0 && d-a !=0){
            return true;
        }else if(d-b==0 && c-a!=0){
            return true;
        }else if( (d-b==c-a) | (d-b==-(c-a)) ){
            return true;
        }else{
            return false;
        }
    }
}
