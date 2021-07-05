public abstract class ChessPiece {
    String color;
    public boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public abstract String getColor();

    public abstract String getSymbol();

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    public int getDeltaOfLines(int line, int toLine) {// try implement it from the interface in piece classes
        return Math.abs(toLine - line);
    }

    public int getDeltaOfColumns(int column, int toColumn) {// try implement it from the interface in piece classes
        return Math.abs(toColumn - column);
    }

    public boolean checkPosition(int line, int column, int toLine, int toColumn) {
        // check if your next position is outside the board or in the same position
        if (toLine > 7 || toLine < 0 || toColumn > 7 || toColumn < 0) return true;
        else return line == toLine && column == toColumn;
    }
}
