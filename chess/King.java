package chess;

public class King extends Piece{
    public King (PieceColour a){
        // super(symbolIn);
        // King.colour = a;
        colour = a;
        if(a == PieceColour.WHITE){
            setSymbol("\u2654");
        }else{
            setSymbol("\u265A");
        }
        
    }

    @Override
    public boolean isLegitMove(int a, int b, int c, int d){


        if( (c-a == -1 | c-a==1) && (d-b==-1 | d-b==1) ){
            if(Board.hasPiece(c,d)==true){
                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else if( (c-a==0) && (d-b==-1 | d-b==1)){
            if(Board.hasPiece(c,d)==true){
                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else if((c-a==1 | c-a==-1)&&(d-b==0)){
            if(Board.hasPiece(c,d)==true){
                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
        
    }
	
}
