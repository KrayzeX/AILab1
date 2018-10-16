package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main implements CommonFunctions {

    public static void main(String[] args) {
        Main main = new Main();
        int [][] check = new int[3][3];
        check[0][0] = 0;
        check[0][1] = 1;
        check[0][2] = 2;
        check[1][0] = 3;
        check[1][1] = 5;
        check[1][2] = 4;
        check[2][0] = 6;
        check[2][1] = 7;
        check[2][2] = 8;
        main.printStateOfBoard(check);
        if(main.isGoalState(check)) {
            System.out.println("It's goal state");
        }

    }
}
