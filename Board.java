package com.company;

import java.util.ArrayList;

public class Board {
    //2D array to make the 8 by 8 grid of the board
    Square [][] squares = new Square [8][8];

    //arraylist to store the black pieces
    ArrayList<Piece> blackPiece = new ArrayList<>();
    //arraylist to store the white pieces
    ArrayList<Piece> whitePiece = new ArrayList<>();

    //board constructor
    public Board(){
        this.setBoard();
    }


    //sets the board at the beginning of the game
    public void setBoard(){
        // need 8x8 grid of squares
        //for loop builds columns
        for(int x = 0; x <8; x++){
            //nested for loop builds rows
            for(int y = 0; y < 8; y++){
                //2d array of squares using 8x8 grid makes board
                //using each square made by the for loop and nested for loop to iterate through
                //all 64 squares of the board
                squares[x][y] = new Square();
            }
        }

        //for loop to cycle through rows to establish setup of board
        for(int x = 0; x< 8; x++){
            //switch to establish each row
            switch(x){
                case 0:
                    //setting back row for black side
                    setBack(x, blackPiece,"B");
                    break;
                case 1:
                    //setting front row for black side
                    setFront(x, blackPiece, "B");
                    break;
                case 2:
                    //setting blank rows ↓
                    setBlanks(x);
                    break;
                case 3:
                    setBlanks(x);
                    break;
                case 4:
                    setBlanks(x);
                    break;
                case 5:
                    //setting blank rows ↑
                    setBlanks(x);
                    break;
                case 6:
                    //setting front row for white side
                    setFront(x, whitePiece,"W");
                    break;
                case 7:
                    //setting back row for white side
                    setBack(x, whitePiece, "W");
                    break;
            }
        }


    }


    //sets the front row of pieces
    public void setFront(int row, ArrayList<com.company.Piece> pieces, String color){
        for(int y = 0; y < 8; y++){
            //make piece object
            Piece thisPiece = new Piece();
            //calls function and passes piece object with coordinates
            setPieceOnSquare(thisPiece,row,y);
            //passes color and coordinates
            thisPiece.setName("--" + color + "pawn-" +  row + "-" + y + "-");
            //keeps track of pieces in arraylist
            pieces.add(thisPiece);
        }
    }



    //sets the back row pieces
    //as the order of the back row is the same for both the black and white
    //the function just has to cycle through the same order for both sides of the board
    public void setBack(int row, ArrayList<Piece> pieces, String color){
        //the order of the back row is rook, knight, bishop, queen, king, bishop, knight, rook, from left to right
        //so we used a switch to build each specific piece as the for loop iterates through each square
        for(int y = 0; y < 8; y++){
            switch(y){
                case 0:
                    // creates piece object
                    Piece rookPiece = new Piece();
                    // calls function to set piece on the square while passing the object and coordinate
                    setPieceOnSquare(rookPiece,row,y);
                    //sets the falue of the piece
                    rookPiece.setName("--" + color + "-rk1-" + row + "-" + y + "-");
                    //keeps track of pieces in arraylist
                    pieces.add(rookPiece);
                    break;

                //other cases do the same as this case, but for their respective pieces based on where they should be on the board
                case 1:
                    Piece knightPiece = new Piece();
                    setPieceOnSquare(knightPiece,row,y);
                    knightPiece.setName("--" + color + "-kn1-" + row + "-" + y + "-");
                    pieces.add(knightPiece);
                    break;
                case 2:
                    Piece bishopPiece = new Piece();
                    setPieceOnSquare(bishopPiece,row,y);
                    bishopPiece.setName("--" + color + "-bi1-" + row + "-" + y + "-");
                    pieces.add(bishopPiece);
                    break;
                case 3:
                    Piece queenPiece = new Piece();
                    setPieceOnSquare(queenPiece,row,y);
                    queenPiece.setName("--" + color + "-qu1-" + row + "-" + y + "-");
                    pieces.add(queenPiece);
                    break;
                case 4:
                    Piece kingPiece = new Piece();
                    setPieceOnSquare(kingPiece,row,y);
                    kingPiece.setName("--" + color + "-kg1-" + row + "-" + y + "-");
                    pieces.add(kingPiece);
                    break;
                case 5:
                    Piece bishopPiece1 = new Piece();
                    setPieceOnSquare(bishopPiece1,row,y);
                    bishopPiece1.setName("--" + color + "-bi2-" + row + "-" + y + "-");
                    pieces.add(bishopPiece1);
                    break;
                case 6:
                    Piece knightPiece1 = new Piece();
                    setPieceOnSquare(knightPiece1,row,y);
                    knightPiece1.setName("--" + color + "-kn2-" + row + "-" + y + "-");
                    pieces.add(knightPiece1);
                    break;
                case 7:
                    Piece rookPiece1 = new Piece();
                    setPieceOnSquare(rookPiece1,row,y);
                    rookPiece1.setName("--" + color + "-rk2-" + row + "-" + y + "-");
                    pieces.add(rookPiece1);
                    break;
            }

        }
    }


    //sets blank rows at the beginning of the game
    public void setBlanks(int row){
        for(int y = 0; y < 8; y++) {
            //makes empty piece object
            Piece emptyPiece = new Piece();
            //calls set function to pass empty piece and coordinates
            setPieceOnSquare(emptyPiece, row, y);
            //sets the "blank" value of the empty piece
            emptyPiece.setName("____" + row + "--" + y + "____");
        }
    }
    public void receiveMove (String input){
        String[] coords= input.split("");
        char c1= coords[0].charAt(0);
        int x1= c1-10;
        int y1= Integer.parseInt(coords[1])-1;
        char c2= coords[2].charAt(0);
        int x2= c2-10;
        int y2= Integer.parseInt(coords[3])-1;
        setPieceOnSquare(squares[x1][y1].getPiece,x2,y2);
        removePieceOnSpace(x1,y1);
    }
    
    //sets piece on square
    public void setPieceOnSquare(Piece piece, int x, int y) {
        //gets passed the piece and coordinates
        //then sets the the piece at the specific coordinate
        squares[x][y].setPiece(piece);
    }


    //remove pieces from board
    public void removePieceOnSpace(int x, int y){
        //gets passed coordinates to tell what square to remove piece from
        //makes new piece object
        Piece emptyPiece = new Piece();
        //sets the object as blank instead of as a piece
        emptyPiece.setName("__" + x + "-" + y + "__");
        //sets the blank object to the specific square
        squares[x][y].setPiece(emptyPiece);
    }

    //Display the board
    public ArrayList<Piece> showBoard(){
        ArrayList<Piece> tempList = new ArrayList<>();
        for(int x=0; x<8; x++){
            for(int y = 0; y<8; y++){
                //displays the square in each column
                System.out.print(squares[x][y].getPiece().getName());
                tempList.add(squares[x][y].getPiece());
            }
            //displays the square in each row
            //starts displaying a  new row of squares once
            // all previous squares were displayed in the previous row
            System.out.println();
        }
        return tempList;
    }


    public void resetBoard(){
        for(int x = 0; x <8; x++){
            //nested for loop to cycle through all rows and columns of board
            for(int y = 0; y < 8; y++){
                //remove all pieces on the board
                removePieceOnSpace(x, y);
            }
        }

        //set board back to beginning
        setBoard();
    }
}
