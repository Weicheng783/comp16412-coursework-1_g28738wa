package chess;

public class Rook extends Piece{
    
    public Rook (PieceColour a){
        // Rook.colour = a;
        if(a == PieceColour.WHITE){
            setSymbol("\u2656");
        }else{
            setSymbol("\u265C");
        }
    }

    public boolean isLegitMove(int a, int b, int c, int d){
        if(c-a==0 && d-a !=0){
            return true;
        }else if(d-b==0 && c-a!=0){
            return true;
        }else{
            return false;
        }
    }
}
