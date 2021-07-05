public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
//        if (checkPosition(line, column, toLine, toColumn)) return false;
//        else if (getDeltaOfLines(line, toLine) > 0 && getDeltaOfColumns(column, toColumn) == 0)
//            return true;
//        else if (getDeltaOfLines(line, toLine) == 0 && getDeltaOfColumns(column, toColumn) > 0)
//            return true;
//        else if ((toLine - line) < 0 && getDeltaOfColumns(column, toColumn) == 0)
//            return true;
//        else return getDeltaOfLines(line, toLine) == 0 && (toColumn - column) < 0;

        if (checkPosition(line, column, toLine, toColumn)) return false;
        else if ((getDeltaOfLines(line, toLine) > 0 && getDeltaOfColumns(column, toColumn) == 0)
                || (getDeltaOfLines(line, toLine) == 0 && getDeltaOfColumns(column, toColumn) > 0)
                || ((toLine - line) < 0 && getDeltaOfColumns(column, toColumn) == 0)
                || (getDeltaOfLines(line, toLine) == 0 && (toColumn - column) < 0))
            return chessBoard.board[toLine][toColumn] == null;
        return false;
    }// moves straight till the edge of the board
}
