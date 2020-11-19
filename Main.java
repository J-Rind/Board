package com.company;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args)
    {
        Board myBoard = new Board;
        Piece newPiece = new Piece();

        ArrayList<Piece> gamePieces();
        gamePieces = newBoard.getPieces();

        myBoard.setPieceOnSquare(newPiece, x: ,y:);
        myBoard.removePieceOnSpace();
        System.out.println("==============================");
        myBoard.showBoard();
        System.out.println("==============================");

        for(Piece p: gamePieces) {
            System.out.println(p.getName());
        }

    }
}