//made with Love by Amber Krause 
//Date created: 11/11/20

public class Square {
    Piece piece;
    String color;
    int x;
    int y;

    public Square(){

    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Square(Piece piece, String color, int x, int y){
        this.piece = piece;
        this.color = color;
        this.x = x;
        this.y = y;
    }
}
