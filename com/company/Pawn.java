package com.company;
public class Pawn extends Piece {
/*
    public Pawn(PlayerType player) {


        public boolean isValidMove(Coordinate initPos, Coordinate finalPos) {
            if (initPos.equals(finalPos)) {
                return false;
            }

            //  pawn moves.
            if (Math.abs(initPos.getY() - finalPos.getY()) == 1
                    && Math.abs(initPos.getX() - finalPos.getX()) == 0) {
                // White can only move forward
                if (this.getPlayer() == PlayerType.WHITE) {
                    if (initPos.getY() < finalPos.getY()) {
                        return true;
                    }
                }
                // Black can only move backward in a sense.
                if (this.getPlayer() == PlayerType.BLACK) {
                    if (initPos.getY() > finalPos.getY()) {
                        return true;
                    }
                }

            }


            if (Math.abs(initPos.getY() - finalPos.getY()) == 2
                    && Math.abs(initPos.getX() - finalPos.getX()) == 0
                    && (initPos.getY() == 1 || initPos.getY() == 6)) {

                // White can only move forward
                if (this.getPlayer() == PlayerType.WHITE) {
                    if (initPos.getY() < finalPos.getY()) {
                        return true;
                    }
                }
                // Black can only move backward in a sense.
                if (this.getPlayer() == PlayerType.BLACK) {
                    if (initPos.getY() > finalPos.getY()) {
                        return true;
                    }
                }

            }

            // This if for normal pawn captures.


            return false;
        }

        public Coordinate[] getPath(Coordinate initPos, Coordinate finalPos) {
            //This is for pawn captures
            if (initPos.getX()!=finalPos.getX()){return new Coordinate[]{initPos,finalPos};}
            //This is for normal pawn moves and first pawn moves.
            int pathLength = Math.abs(initPos.getY() - finalPos.getY()) + 1;
            Coordinate[] path = new Coordinate[pathLength];

            for (int cnt = 0; cnt < pathLength; cnt++) {
                path[cnt] = new Coordinate(initPos.getX(), Math.min(initPos.getY(),
                        finalPos.getY()) + cnt);
            }

            return path;
        }
*/
    }