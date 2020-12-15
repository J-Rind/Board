package com.company;
import java.util.ArrayList;


public class Pawn extends Piece {


    public Pawn(int x, int y, String t, Boolean white) {
        super(x, y, t, white);
    }
    public int pMove = 0;

    @Override
    public void moveTo(int x, int y, King myKing, ArrayList<Piece> arr){

        int[] myCoords = new int[]{this.getX(), this.getY()};
        int moved = 0;

        updateRange(arr);

        for (int[] coordinate : this.range) {
            if (coordinate[0] == x && coordinate[1] == y) {
                this.setX(x);
                this.setY(y);
                System.out.println(this.getName() + " Moved to: (" + this.getX() + "," + this.getY() + ")");
                this.pMove++;
                moved++;
                break;
            }
        }

        updateRange(arr);

        if (myKing.kingCheck(arr) == true)
        {
            System.out.println("!! king is in check, moving piece back !!");
            this.setX(myCoords[0]);
            this.setY(myCoords[1]);
            this.pMove--;
        }

        if(moved != 1)
        {
            System.out.println("piece not moved, not in range");
        }
    }

    @Override
    public void getRange(ArrayList<Piece> arr){
        this.range.clear();

        int X = this.getX();
        int Y = this.getY();
        int moved = 0;

        // Moving 2 spaces for first move
        if (pMove == 0){                //??If piece has not been moved
            if (this.getColor()) {
                for (int x = X, y = Y + 1; y <= Y + 2; y++) {
                    if (getPiece(x, y, arr) == 0) {
                        this.range.add(new int[]{x, y});
                    } else if (getPiece(x, y, arr) == 1 || getPiece(x, y, arr) == 2) {
                        break;
                    }
                }
                // Up-Right
                if (this.getPiece(X + 1, Y + 1, arr) == 2){
                    this.range.add (new int [] {X+1, Y+1});
                }
                // Up-Left
                if (this.getPiece(X - 1, Y + 1, arr) == 2){
                    this.range.add (new int [] {X-1, Y+1});
                }
            }else if (!this.getColor()) {
                for (int x = X, y = Y-1; y >= Y - 2; y-- ) {
                    if (getPiece(x, y, arr) == 0) {
                        this.range.add(new int[]{x, y});
                    } else if (getPiece(x, y, arr) == 1 || getPiece(x, y, arr) == 2) {
                        break;
                    }
                }
                // Down-Right
                if (this.getPiece(X + 1, Y - 1, arr) == 2){
                    this.range.add (new int [] {X+1, Y-1});
                }
                // Down-Left
                if (this.getPiece(X - 1, Y - 1, arr) == 2){
                    this.range.add (new int [] {X-1, Y-1});
                }
            }
        }
        else {
            if (this.getColor()){
                // Up-Right
                if (this.getPiece(X + 1, Y + 1, arr) == 2){
                    this.range.add (new int [] {X+1, Y+1});
                }
                // Up-Left
                if (this.getPiece(X - 1, Y + 1, arr) == 2){
                    this.range.add (new int [] {X-1, Y+1});
                }
                // Up
                if (this.getPiece(X, Y + 1, arr) == 0){
                    this.range.add (new int [] {X, Y+1});
                }
            }
            else if (!this.getColor()){
                // Down-Right
                if (this.getPiece(X + 1, Y - 1, arr) == 2){
                    this.range.add (new int [] {X+1, Y-1});
                }
                // Down-Left
                if (this.getPiece(X - 1, Y - 1, arr) == 2){
                    this.range.add (new int [] {X-1, Y-1});
                }
                // Down
                if (this.getPiece(X, Y - 1, arr) == 0){
                    this.range.add (new int [] {X, Y-1});
                }
            }
        }

    }
}