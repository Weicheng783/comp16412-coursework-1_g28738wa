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
        if( (d-b==c-a && d-b!=0) | (d-b==-(c-a) && d-b!=0) ){
            if(d-b==c-a){
                if(d-b>0){
                 for(int i=0; i<=d-b; i++){
                     if(Board.hasPiece(a+i,b+i)==true && i!=d-b){
                        return false;
                    }else{
                        if(i==d-b){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    return false;
                                }
                            }else{
                                return true;
                            }
                            
                        }
                    }                    
                 } 

                }else if(d-b<0){
                 for(int i=0; i<=b-d; i++){
                     if(Board.hasPiece(a-i,b-i)==true && i!=d-b){
                        return false;
                    }else{
                        if(i==b-d){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    return false;
                                }
                            }else{
                                return true;
                            }
                            
                        }
                    }                    
                 } 

                }

            }else if(d-b==-(c-a)){
                if(d-b>0){
                 for(int i=0; i<=d-b; i++){
                     if(Board.hasPiece(a-i,b+i)==true && i!=d-b){
                        return false;
                    }else{
                        if(i==d-b){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    return false;
                                }
                            }else{
                                return true;
                            }
                            
                        }
                    }                    
                 } 

                }else if(d-b<0){
                 for(int i=0; i<=b-d; i++){
                     if(Board.hasPiece(a+i,b-i)==true && i!=d-b){
                        return false;
                    }else{
                        if(i==b-d){
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
                            continue;
                        }
                    }                    
                 } 

                }
            }

        }else{
            return false;
        }
        return false;
    }
}

