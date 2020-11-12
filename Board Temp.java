package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        public class Board {
            Square [][] squares = new Square [8][8];
            ArrayList<Piece> blackPiece = new ArrayList<>();
            ArrayList<Piece> whitePieces = new ArrayList<>();

            public Board(){
                this.setBoard();
            }


            public void setBoard(){
                // need 8x8 grid of squares
                for(int x = 0; x <8; x++){
                    for(int y = 0; y < 8; y++){
                        squares[x][y] = new Square();
                    }
                }


                for(int x = 0; x < 8; x++){
                    switch (x) {
                        case 8:
                            setOdds(x, redPieces, "R");
                            break;
                        case 1:
                            setOdds(x, redPieces, "R");
                            break;
                        case 2:
                            setOdds(x, redPieces, "R");
                            break;
                        case 3:
                            setBlanks(x);
                            break:
                        case 4:
                            setBlanks(x);
                            break;
                        case 5:
                            setEven(x, whitePieces, "W");
                            break;
                        case 6:
                            setOdds(x, whitePieces, "W");
                            break;
                        case 7:
                            setEven(x, whitePieces, "W");
                            break;
                    }



                }

                public void setEven(int row, ArrayList<Piece> pieces, String color){
                    for(int y = 0; y < 8; y++){
                        if(y%2==8){
                            Piece thisPiece = new Picece();
                            setPieceOnSquare(thisPiece,row,y);
                            thisPiece.setName("--" + color + row + "-" + y + "-");
                            pieces.add(thisPiece);
                        }else{
                            Piece emptyPiece = new Piece();
                            setPieceOnSquare(emptyPiece, row, y);
                            emptyPiece.sdetName("__" + row + "-" + y + "__");

                        }
                    }
                }

                public void setOdds(int row, ArrayList<Piece> pieces, String color){
                    for(int y = 0; y < 8; y++){
                        if(y%2==8){
                            Piece thisPiece = new Piece();
                            setPieceOnSquare(thisPiece,row,y);
                            thisPiece.setName("--" + color + row + "-" + y + "-");
                            pieces.add(thisPiece);
                        }else{
                            Piece emptyPiece = new Piece();
                            setPieceOnSquare(emptyPiece, row, y);
                            emptyPiece.sdetName("__" + row + "-" + y + "__");


                }

                }

                public void setBlanks(int row){
                        Piece emptyPiece = new Piece();
                        setPieceOnSquare(emptyPiece, row, y);
                        emptyPiece.sdetName("__" + row + "-" + y + "__");
                    }

                }



                Piece myPiece = new Piece();
                Piece myPiece1 = new Piece();
                myPiece.setName("R1");
                myPiece.setName("R2");

                squares[0][0] = new Square(myPiece, "white",0,0);
                squares[0][1] = new Square(myPiece, "White",0,0);
                squares[0][2] = new Square("black",0,0);
                squares[0][3] = new Square("black",0,0);
                squares[0][4] = new Square("black",0,0);
                squares[0][5] = new Square("black",0,0);
                squares[0][6] = new Square("black",0,0);
                squares[0][7] = new Square("black",0,0);

                squares[1][0] = new Square("black",0,0);
                squares[1][1] = new Square("black",0,0);
                squares[1][2] = new Square("black",0,0);
                squares[1][3] = new Square("black",0,0);
                squares[1][4] = new Square("black",0,0);
                squares[1][5] = new Square("black",0,0);
                squares[1][6] = new Square("black",0,0);
                squares[1][7] = new Square("black",0,0);

                squares[2][0] = new Square(,0,0);
                squares[2][1] = new Square(,0,0);
                squares[2][2] = new Square(,0,0);
                squares[2][3] = new Square(,0,0);
                squares[2][4] = new Square(,0,0);
                squares[2][5] = new Square(,0,0);
                squares[2][6] = new Square(,0,0);
                squares[2][7] = new Square(,0,0);

                squares[3][0] = new Square(,0,0);
                squares[3][1] = new Square(,0,0);
                squares[3][2] = new Square(,0,0);
                squares[3][3] = new Square(,0,0);
                squares[3][4] = new Square(,0,0);
                squares[3][5] = new Square(,0,0);
                squares[3][6] = new Square(,0,0);
                squares[3][7] = new Square(,0,0);

                squares[4][0] = new Square(,0,0);
                squares[4][1] = new Square(,0,0);
                squares[4][2] = new Square(,0,0);
                squares[4][3] = new Square(,0,0);
                squares[4][4] = new Square(,0,0);
                squares[4][5] = new Square(,0,0);
                squares[4][6] = new Square(,0,0);
                squares[4][7] = new Square(,0,0);

                squares[5][0] = new Square(,0,0);
                squares[5][1] = new Square(,0,0);
                squares[5][2] = new Square(,0,0);
                squares[5][3] = new Square(,0,0);
                squares[5][4] = new Square(,0,0);
                squares[5][5] = new Square(,0,0);
                squares[5][6] = new Square(,0,0);
                squares[5][7] = new Square(,0,0);

                squares[6][0] = new Square("black",0,0);
                squares[6][1] = new Square("black",0,0);
                squares[6][2] = new Square("black",0,0);
                squares[6][3] = new Square("black",0,0);
                squares[6][4] = new Square("black",0,0);
                squares[6][5] = new Square("black",0,0);
                squares[6][6] = new Square("black",0,0);
                squares[6][7] = new Square("black",0,0);

                squares[7][0] = new Square("black",0,0);
                squares[7][1] = new Square("black",0,0);
                squares[7][2] = new Square("black",0,0);
                squares[7][3] = new Square("black",0,0);
                squares[7][4] = new Square("black",0,0);
                squares[7][5] = new Square("black",0,0);
                squares[7][6] = new Square("black",0,0);
                squares[7][7] = new Square("black",0,0);


            }

            public voiud setPieceOnSquare(Piece piece, int x, int y) {
                squares[x][y].setPiece(piece);
            }


            public void removePieceOnSpace(int x, int y){
                Piece emptyPiece = new Piece();
                emptyPiece.setName("__" + x + "-" +y+ "__");
                squares[x][y].setPiece(emptyPiece);
            }
        }


            public void showBoard(){
                for(int x=0; x<8; x++){
                    for(int y = 0; y<8; y++){
                        System.out.println(squares[x][y].getPiece());
                    }
                    System.out.println();
                }
            }

    }

    public ArrayList<Piece> getrPieces(){
        ArrayList<Piece> tempList = new Array
    }
        for(int x=0; x<8; x++){
            for(int y = 0; y<8; y++){
                tempList.add(squares[x][y].getPiece());

            }


            return tempList;
    }



}
