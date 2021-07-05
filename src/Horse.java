public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "H";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
//        if (checkPosition(line, column, toLine, toColumn)) return false;
//        else if (getDeltaOfLines(line, toLine) == 1 && (getDeltaOfColumns(column, toColumn) == 2))
//            return true;
//        else return getDeltaOfLines(line, toLine) == 2 && getDeltaOfColumns(column, toColumn) == 1;

        if (checkPosition(line, column, toLine, toColumn)) return false;
        else if ((getDeltaOfLines(line, toLine) == 1 && (getDeltaOfColumns(column, toColumn) == 2)) ||
                (getDeltaOfLines(line, toLine) == 2 && getDeltaOfColumns(column, toColumn) == 1))
            return chessBoard.board[toLine][toColumn] == null;
        return false;
    }// move like a russian G
}
