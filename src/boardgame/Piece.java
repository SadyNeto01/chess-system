package boardgame;

public class Piece {
	//position is protected because it's not a position in the board, just a position in the matrix
	protected Position position;
	private Board board;
	//to create a piece we just receive the board because at the beginning, position is null
	public Piece(Board board) {
		this.board = board;
	}
	//only classes in the same package or subpackages can acess the board
	protected Board getBoard() {
		return board;
	}

}
