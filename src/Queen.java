public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "Q";
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
//        else if (getDeltaOfLines(line, toLine) == 0 && (toColumn - column) < 0)
//            return true;
//        return getDeltaOfLines(line, toLine) == (getDeltaOfColumns(column, toColumn));

        if (checkPosition(line, column, toLine, toColumn)) return false;
        else if ((getDeltaOfLines(line, toLine) > 0 && getDeltaOfColumns(column, toColumn) == 0)
                || (getDeltaOfLines(line, toLine) == 0 && getDeltaOfColumns(column, toColumn) > 0)
                || ((toLine - line) < 0 && getDeltaOfColumns(column, toColumn) == 0)
                || (getDeltaOfLines(line, toLine) == 0 && (toColumn - column) < 0)
                || (getDeltaOfLines(line, toLine) == (getDeltaOfColumns(column, toColumn))))
            return chessBoard.board[toLine][toColumn] == null;
        return false;
    }// goes straight and diagonal moving
}
