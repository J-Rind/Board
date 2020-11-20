
import com.sun.tools.jdeprscan.scan.Scan;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    Square[][] squares = new Square[8][8];
    ArrayList<Piece> blackPiece = new ArrayList<>();
    ArrayList<Piece> whitePiece = new ArrayList<>();

    public Board() {
        this.setBoard();
    }

    public void setBoard() {
        // need 8x8 grid of squares
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                squares[x][y] = new Square();
            }
        }

        for (int x = 0; x < 8; x++) {
            switch (x) {
                case 0:
                    setBack(x, blackPiece, "B");
                    break;
                case 1:
                    setFront(x, blackPiece, "B");
                    break;
                case 2:
                    setBlanks(x);
                    break;
                case 3:
                    setBlanks(x);
                    break;
                case 4:
                    setBlanks(x);
                    break;
                case 5:
                    setBlanks(x);
                    break;
                case 6:
                    setFront(x, whitePiece, "W");
                    break;
                case 7:
                    setBack(x, whitePiece, "W");
                    break;
            }
        }
    }
        /*public void resetBoard(){
            Scanner kb = new Scanner(System.in);
            String reset = "";
            reset.equalsIgnoreCase("reset");
            try {
                if (kb.hasNext(reset)) {
                    setBoard();
                }
            } catch (Exception exception) {
                System.out.println("Not a valid input");
            }
        }*/

    public void setFront(int row, ArrayList<Piece> pieces, String color) {
        for (int y = 1; y < 2; y++) {
            Piece thisPiece = new Piece();
            setPieceOnSquare(thisPiece, row, y);
            thisPiece.setName("--" + color + row + "-" + y + "-");
            pieces.add(thisPiece);
        }
    }

    public void setBack(int row, ArrayList<Piece> pieces, String color) {
        for (int y = 1; y < 2; y++) {
            switch (y) {
                case 0:
                    Piece rookPiece = new Piece();
                    setPieceOnSquare(rookPiece, row, y);
                    rookPiece.setName("--" + color + row + "-" + y + "-");
                    pieces.add(rookPiece);
                    break;
                case 1:
                    Piece knightPiece = new Piece();
                    setPieceOnSquare(knightPiece, row, y);
                    knightPiece.setName("--" + color + row + "-" + y + "-");
                    pieces.add(knightPiece);
                    break;
                case 2:
                    Piece bishopPiece = new Piece();
                    setPieceOnSquare(bishopPiece, row, y);
                    bishopPiece.setName("--" + color + row + "-" + y + "-");
                    pieces.add(bishopPiece);
                    break;
                case 3:
                    Piece queenPiece = new Piece();
                    setPieceOnSquare(queenPiece, row, y);
                    queenPiece.setName("--" + color + row + "-" + y + "-");
                    pieces.add(queenPiece);
                    break;
                case 4:
                    Piece kingPiece = new Piece();
                    setPieceOnSquare(kingPiece, row, y);
                    kingPiece.setName("--" + color + row + "-" + y + "-");
                    pieces.add(kingPiece);
                    break;
                case 5:
                    Piece bishopPiece1 = new Piece();
                    setPieceOnSquare(bishopPiece1, row, y);
                    bishopPiece1.setName("--" + color + row + "-" + y + "-");
                    pieces.add(bishopPiece1);
                    break;
                case 6:
                    Piece knightPiece1 = new Piece();
                    setPieceOnSquare(knightPiece1, row, y);
                    knightPiece1.setName("--" + color + row + "-" + y + "-");
                    pieces.add(knightPiece1);
                    break;
                case 7:
                    Piece rookPiece1 = new Piece();
                    setPieceOnSquare(rookPiece1, row, y);
                    rookPiece1.setName("--" + color + row + "-" + y + "-");
                    pieces.add(rookPiece1);
                    break;
            }

        }
    }

    public void setBlanks(int row) {
        for (int y = 0; y < 8; y++) {
            Piece emptyPiece = new Piece();
            setPieceOnSquare(emptyPiece, row, y);
            emptyPiece.setName("__" + row + "-" + y + "__");
        }
    }

    public void setPieceOnSquare(Piece piece, int x, int y) {
        squares[x][y].setPiece(piece);
    }

    public void removePieceOnSpace(int x, int y) {
        Piece emptyPiece = new Piece();
        emptyPiece.setName("__" + x + "-" + y + "__");
        squares[x][y].setPiece(emptyPiece);
    }

    public ArrayList<Piece> showBoard() {
        ArrayList<Piece> tempList = new ArrayList<>();
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                tempList.add(squares[x][y].getPiece());
                System.out.println(squares[x][y].getPiece());
            }
            System.out.println();
        }
        return tempList;
    }
}


