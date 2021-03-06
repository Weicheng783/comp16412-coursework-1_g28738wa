package chess;

public class Bishop extends Piece{
    public Bishop (PieceColour a){
        //  super(colour);
        // Bishop.colour = a;
        colour = a;
        if(a == PieceColour.WHITE){
            setSymbol("\u2657");
        }else{
            setSymbol("\u265D");
        }
    }

    @Override
    public boolean isLegitMove(int a, int b, int c, int d){
        if( (d-b==c-a && d-b!=0) | (d-b==-(c-a) && d-b!=0) ){
            if(d-b==c-a){
                if(d-b>0){
                 for(int i=1; i<=d-b; i++){
                     if(Board.hasPiece(a+i,b+i)==true && i!=d-b){
                        System.out.println("Invalid movement due to block."); 
                        return false;
                    }else{
                        if(i==d-b){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    System.out.println("Invalid movement, you cannot jump to your chess."); 
                                    return false;
                                }
                            }else{
                                return true;
                            }
                            
                        }
                    }                    
                 } 

                }else if(d-b<0){
                 for(int i=1; i<=b-d; i++){
                     if(Board.hasPiece(a-i,b-i)==true && i!=b-d){
                         System.out.println("Invalid movement due to block."); 
                        return false;
                    }else{
                        if(i==b-d){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    System.out.println("Invalid movement, you cannot jump to your chess.");
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
                 for(int i=1; i<=d-b; i++){
                     if(Board.hasPiece(a-i,b+i)==true && i!=d-b){
                        System.out.println("Invalid movement due to block."); 
                        return false;
                    }else{
                        if(i==d-b){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    System.out.println("Invalid movement, you can't move to the same color."); 
                                    return false;
                                }
                            }else{
                                return true;
                            }
                            
                        }
                    }                    
                 } 

                }else if(d-b<0){
                 for(int i=1; i<=b-d; i++){
                     if(Board.hasPiece(a+i,b-i)==true && i!=b-d){
                         System.out.println("Invalid movement due to block."); 
                        return false;
                    }else{
                        if(i==b-d){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    System.out.println("Invalid movement due to the same color."); 
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
            System.out.println("Invalid movement due to the rules of movement of Bishop."); 
            return false;
        }
        System.out.println("Invalid movement due to the rules of movement of Bishop."); 
        return false;
    }
}

