public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
//        if (checkPosition(line, column, toLine, toColumn)) return false;
//        return getDeltaOfLines(line, toLine) == (getDeltaOfColumns(column, toColumn));

        if (checkPosition(line, column, toLine, toColumn)) return false;
        else if (getDeltaOfLines(line, toLine) == (getDeltaOfColumns(column, toColumn)))
            return chessBoard.board[toLine][toColumn] == null;
        return false;
    }// diagonal moving
}