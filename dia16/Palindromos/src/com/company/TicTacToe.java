package com.company;

public class TicTacToe {
    private boolean xTurn = false;
    private char[][] board;
    public TicTacToe() {
        board = new char[3][3];
        init();
    }    public TicTacToe(int size) {
        board = new char[size][size];
        init();
    }    private void init() {
        // fill all board cells with '-'
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
    }    public void draw() {
        // iterate over board and print
        System.out.println();
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }    private void drawPosition(int x, int y) {
        if (xTurn){
            board[x][y] = 'X';

        }   else {
            board[x][y] = '0';
        }
        board[x][y] = 'X';
    }    private boolean checkWin(char who) {
        return false;
    }    public void move(int x, int y) {
        drawPosition(x, y);
        draw();        xTurn = !xTurn;        // check if allowed
        // drawPosition(x,y)
        // draw()
        // checkWin()
    }    public boolean isxTurn() {
        return this.xTurn;
    }
}