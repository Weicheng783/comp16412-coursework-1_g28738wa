package chess;

//This class requires your input
public abstract class Piece {
	private String symbol;

    protected PieceColour colour;

    // public Piece(String symbolIn){
    //     symbol = symbolIn;
    // }
    // public enum PieceColour {
    //     BLACK, WHITE
    // }

	public String getSymbol() {
		return symbol;
	}	

    public void setSymbol(String a){
        symbol = a;
    }

    public PieceColour getColour(){
        return colour;
    }

    public abstract boolean isLegitMove(int a, int b, int c, int d);
}
