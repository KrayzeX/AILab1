package com.company;

import java.util.Arrays;

public interface CommonFunctions {

    default boolean isGoalState(int[][]currentState) {
        if(currentState == null) {
            throw new IllegalArgumentException("The state cannot be empty");
        }
        int[][] goalState = new int[3][3];
        goalState[0][0] = 0;
        goalState[0][1] = 1;
        goalState[0][2] = 2;
        goalState[1][0] = 3;
        goalState[1][1] = 4;
        goalState[1][2] = 5;
        goalState[2][0] = 6;
        goalState[2][1] = 7;
        goalState[2][2] = 8;
        int count = 0;
        for(int i = 0; i < 3; i++) {
            if(Arrays.equals(goalState[i], currentState[i])) {
                count++;
            }
        }
        if(count == 3) {
            return true;
        }
        else {
            return false;
        }
    }

    default void printStateOfBoard(int[][]stateToPrint) {
        if(stateToPrint == null) {
            throw new IllegalArgumentException("State cannot be empty");
        }
        for (int i = 0; i < stateToPrint.length; i++) {
            for (int j = 0; j < stateToPrint[0].length; j++) {
                System.out.print(stateToPrint[i][j]);
            }
            System.out.println();
        }
    }
}
