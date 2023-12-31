package chess;

public class Queen extends Piece{
    public Queen (PieceColour a){

        colour = a;
        if(a == PieceColour.WHITE){
            setSymbol("\u2655");
        }else{
            setSymbol("\u265B");
        }
    }
    
    @Override
    public boolean isLegitMove(int a, int b, int c, int d){
        if(c-a==0 && d-b !=0){
            if(d-b < 0){

                for (int i=b-1; i>=d; i--){
                    if(Board.hasPiece(a,i)==true && i!=d){

                        System.out.println("Invalid movement due to the rules of movement of Queen."); 
                        return false;
                    }else{
                        if(i==d){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    System.out.println("Invalid movement due to the rules of movement of Queen."); 
                                    return false;
                                }
                            }else{
                                return true;
                            }
                            
                        }
                    }
                
                }

            }else if(d-b>0){

                for (int i=b+1; i<=d; i++){
                    if(Board.hasPiece(a,i)==true && i!=d){

                        System.out.println("Invalid movement due to the rules of movement of Queen."); 
                        return false;
                    }else{
                        if(i==d){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    System.out.println("Invalid movement due to the rules of movement of Queen."); 
                                    return false;
                                }
                            }else{
                                return true;
                            }
                            
                        }
                    }
                
                }


            }
        }else if(d-b==0 && c-a!=0){
            if(c-a < 0){

                for (int i=a-1; i>=c; i--){
                    if(Board.hasPiece(i,b)==true && i!=c){

                        System.out.println("Invalid movement due to the rules of movement of Queen."); 
                        return false;
                    }else{
                        if(i==c){
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

            }else if(c-a>0){

                for (int i=a+1; i<=c; i++){
                    if(Board.hasPiece(i,b)==true && i!=c){
                        System.out.println("Invalid movement due to the rules of movement of Queen."); 

                        return false;
                    }else{
                        if(i==c){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    System.out.println("Invalid movement due to the rules of movement of Queen."); 
                                    return false;
                                }
                            }else{
                                return true;
                            }
                            
                        }
                    }
                
                }


            }
        }else if( (d-b==c-a && d-b!=0) | (d-b==-(c-a) && d-b!=0) ){

            if(d-b==c-a){
                if(d-b>0){
                 for(int i=1; i<=d-b; i++){
                     if(Board.hasPiece(a+i,b+i)==true && i!=d-b){
                         System.out.println("Invalid movement due to the rules of movement of Queen."); 
                        return false;
                    }else{
                        if(i==d-b){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    System.out.println("Invalid movement due to the rules of movement of Queen."); 
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
                         System.out.println("Invalid movement due to the rules of movement of Queen."); 
                        return false;
                    }else{
                        if(i==b-d){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    System.out.println("Invalid movement due to the rules of movement of Queen."); 
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
                         System.out.println("Invalid movement due to the rules of movement of Queen."); 
                        return false;
                    }else{
                        if(i==d-b){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    System.out.println("Invalid movement due to the rules of movement of Queen."); 
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
                         System.out.println("Invalid movement due to the rules of movement of Queen."); 
                        return false;
                    }else{
                        if(i==b-d){
                            if(Board.hasPiece(c,d)==true){
                                if(Board.getPiece(c,d).getColour() != Board.getPiece(a,b).getColour() ){
                                    return true;
                                }else{
                                    System.out.println("Invalid movement due to the rules of movement of Queen."); 
                                    return false;
                                }
                            }else{
                                return true;
                            }
                            
                        }
                    }                    
                 } 

                }
            }

        }else{
            System.out.println("Invalid movement due to the rules of movement of Queen."); 
            return false;
        }
        System.out.println("Invalid movement due to the rules of movement of Queen."); 
        return false;
    }
}
