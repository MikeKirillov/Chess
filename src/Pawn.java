public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "P";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
//        if (checkPosition(line, column, toLine, toColumn)) return false;
//        else if ((getColor().equals("White") && line == 1 && getDeltaOfLines(line, toLine) <= 2) && getDeltaOfColumns(column, toColumn) == 0)
//            return true;
//        else if ((getColor().equals("Black") && line == 6 && ((toLine - line) == -2 || (toLine - line) == -1)) && getDeltaOfColumns(column, toColumn) == 0)
//            return true;
//        else if ((getColor().equals("White") && line > 1 && getDeltaOfLines(line, toLine) == 1) && getDeltaOfColumns(column, toColumn) == 0)
//            return true;
//        else return (getColor().equals("Black") && line < 6 && (toLine - line) == -1) && getDeltaOfColumns(column, toColumn) == 0;

        if (checkPosition(line, column, toLine, toColumn)) return false;
        else if (((getColor().equals("White") && line == 1 && getDeltaOfLines(line, toLine) <= 2) && getDeltaOfColumns(column, toColumn) == 0)
                || ((getColor().equals("Black") && line == 6 && ((toLine - line) == -2 || (toLine - line) == -1)) && getDeltaOfColumns(column, toColumn) == 0)
                || ((getColor().equals("White") && line > 1 && getDeltaOfLines(line, toLine) == 1) && getDeltaOfColumns(column, toColumn) == 0)
                || ((getColor().equals("Black") && line < 6 && (toLine - line) == -1) && getDeltaOfColumns(column, toColumn) == 0))
            return chessBoard.board[toLine][toColumn] == null;
        return false;
    }// move 2 spots if its 1st move else 1
}
