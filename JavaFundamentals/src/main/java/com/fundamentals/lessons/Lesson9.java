package com.fundamentals.lessons;

/* Arrays */
public class Lesson9 {

        // An array of int values
        public void demoInArray() {
            int[] intArray = {23,45,12,8,92,103,37};
            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);
            } // end for
        } // end method

        // An array of Strings
        public void demoStringsArray() {
        String[] stringArray = new String[4];
        stringArray[0] = "Happy";
        stringArray[1] = "Monday";
        stringArray[2] = "Movie";
        stringArray[3] = "Day";

        for (int i =0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        } // end for
    } // end method

    /* Enhanced for loop */
    public void demoEnhancedFor() {
        int[] intArray = {23,45,12,8,92,103,37};

    for(int number : intArray){
        System.out.print(number + " ");
    } // end for

    } // End class

    /* Two-Dimensiopnal Array */
    public void demoTwoDimensions() {
        int[][] myArray = { {23,45} , {35,46} ,
                {57,98}, {32,48} };
        for(int i = 0; i< myArray.length; i++) {
            for(int k = 0; k < myArray[i].length; k++) {
                System.out.print(" ["+i+"]" + "["+k+"] = "+
                        myArray[i][k]);
            } // end inner for
        } // end outer for

        System.out.println();

        for(int[] ints : myArray) {
            for(int anInt : ints) {
                System.out.print(anInt + " ");
            } // end inner for
        } // end outer for

    } // end method

    /* Three-Dimensional Array */
    public void demoThreeDimensional() {
        String [][][] threeD = { {{"One", "Two"}, {"Three", "Four"}},
                {{"Five", "Six"}, {"Seven", "Eight"}}
        };

        for (String [][] twos : threeD) {
            for (String[] ones : twos) {
                for(String zero : ones) {
                    System.out.print(zero + " ");
                } // end inner inner for
            } // end inner for
        } // end outer for
    } // end method

    /* Jagged Array */
    public void demoJaggedArray() {
        String[][] calendarArray = new String[2][4];
        calendarArray[0][0] = "Jan";
        calendarArray[0][1] = "Feb";
        calendarArray[0][2] = "Mar";
        calendarArray[0][3] = "Apr";

        calendarArray[1][0] = "May";
        calendarArray[1][1] = "Jun";
        calendarArray[1][2] = "Jul";
        calendarArray[1][3] = "Aug";

        for(String[] first : calendarArray) {
            for (String second : first) {
                System.out.print(second + " ");
            } // end inner for
        } // end outer for
    } // end method


    } // end class
