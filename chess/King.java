package chess;

public class King extends Piece{
    public King (PieceColour a){
        // super(symbolIn);
        // King.colour = a;
        if(a == PieceColour.WHITE){
            setSymbol("\u2654");
        }else{
            setSymbol("\u265A");
        }
        
    }

    public boolean isLegitMove(int a, int b, int c, int d){
        if( (c-a == -1 | c-a==1) && (d-b==-1 | d-b==1) ){
            return true;
        }else if( (c-a==0) && (d-b==-1 | d-b==1)){
            return true;
        }else if((c-a==1 | c-a==-1)&&(d-b==0)){
            return true;
        }else{
            return false;
        }
        
    }
	
}
