public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
//        if (checkPosition(line, column, toLine, toColumn)) return false;
//        else if (getDeltaOfLines(line, toLine) == 1 && getDeltaOfColumns(column, toColumn) == 0)
//            return true;
//        else if (getDeltaOfLines(line, toLine) == 0 && getDeltaOfColumns(column, toColumn) == 1)
//            return true;
//        // else if ((toLine - line) == -1 && getDeltaOfColumns(column, toColumn) == 0)
//        //     return true;
//        // else if (getDeltaOfLines(line, toLine) == 0 && (toColumn - column) == -1)
//        //     return true;
//        return getDeltaOfLines(line, toLine) == 1 && (getDeltaOfColumns(column, toColumn)) == 1;

        if (checkPosition(line, column, toLine, toColumn)) return false;
        else if ((getDeltaOfLines(line, toLine) == 1 && getDeltaOfColumns(column, toColumn) == 0)
                || (getDeltaOfLines(line, toLine) == 0 && getDeltaOfColumns(column, toColumn) == 1)
                || (getDeltaOfLines(line, toLine) == 1 && (getDeltaOfColumns(column, toColumn)) == 1))
            return chessBoard.board[toLine][toColumn] == null;
        return false;
    }// goes around itself

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        if (ChessBoard.checkPos(line) && ChessBoard.checkPos(column)) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (chessBoard.board[i][j] != null) {
                        if (!chessBoard.board[i][j].getColor().equals(color) && chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        } else return true;
    }
}
