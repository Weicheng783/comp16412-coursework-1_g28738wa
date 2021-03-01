package chess;

public class Knight extends Piece{
    public Knight (PieceColour a){

        colour = a;
        if(a == PieceColour.WHITE){
            setSymbol("\u2658");
        }else{
            setSymbol("\u265E");
        }
        
    }

    @Override
    public boolean isLegitMove(int a, int b, int c, int d){
        if( (c-a==2 | c-a==-2) && (d-b==1 | d-b==-1) ){
            if(Board.hasPiece(c,d)==true){
                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }

        }else if( (c-a==1 | c-a==-1) && (d-b==-2 | d-b==2) ){
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
