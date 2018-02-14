import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hexInputt = scnr.nextLine();
        //random comment
        


        char spaceOne = 'a';
        char spaceTwo = 'b';
        char spaceThree = 'b';
        char spaceFour = 'b';
        char spaceFive = 'b';
        char spaceSix = 'b';
        char spaceSeven = 'b';
        char spaceEight = 'b';
        String hexInput;
        int stringLength = 0;

        int A, a = 10, B, b = 11, C, c = 12, D, d = 13, E, e = 14, F, f = 15;
        //int counter =  0;

        /*spaceOne = hexInput.charAt(0);
        spaceTwo = hexInput.charAt(1);
        spaceThree = hexInput.charAt(2);
        spaceFour = hexInput.charAt(3);
        spaceFive = hexInput.charAt(4);
        spaceSix = hexInput.charAt(5);
        spaceSeven = hexInput.charAt(6);
        spaceEight = hexInput.charAt(7);
        spaceNine = hexInput.charAt(8);*/

        double numOne = Math.pow(16, 0);
        double numTwo = Math.pow(16, 1);
        double numThree = Math.pow(16, 2);
        double numFour = Math.pow(16, 3);
        double numFive = Math.pow(16, 4);
        double numSix = Math.pow(16, 5);
        double numSeven = Math.pow(16, 6);
        double numEight = Math.pow(16, 7);
        double numNine = Math.pow(16, 8);
        double numTen = Math.pow(16, 9);
        int valueOne = 0, valueTwo = 0, valueThree = 0, valueFour = 0, valueFive = 0, valueSix = 0, valueSeven = 0, valueEight = 0;
        int totalSum = 0;

        if ((hexInputt.charAt(0)== '0') && (hexInputt.charAt(1) == 'x')) {
            hexInput = hexInputt.substring(2);
        }
        else {
            hexInput = hexInputt;
        }

        int stringLengthh = hexInput.length() ;
        stringLength = stringLengthh - 1;



        if (stringLength >= 0 ) {
            spaceOne = hexInput.charAt(stringLength);
            int numSpaceOne = Character.getNumericValue(spaceOne);
            valueOne = (int) numSpaceOne * (int) numOne;
        }

        else {
            valueOne = 0;
        }

        if ( stringLength >= 1) {
            spaceTwo = hexInput.charAt(stringLength - 1);
            int numSpaceTwo = Character.getNumericValue(spaceTwo);
            valueTwo = (int)numSpaceTwo * (int)numTwo;
        }
        else {
            valueTwo = 0;
        }
        if (stringLength >= 2) {
            spaceThree = hexInput.charAt(stringLength - 2);
            int numSpaceThree = Character.getNumericValue(spaceThree);
            valueThree = (int)numSpaceThree * (int)numThree;
        }
        else {
            valueThree = 0;
        }

        if (stringLength >= 3) {
            spaceFour = hexInput.charAt(stringLength - 3);
            int numSpaceFour = Character.getNumericValue(spaceFour);
            valueFour = (int)numSpaceFour * (int)numFour;
        }
        else {
            valueFour = 0;
        }

        if (stringLength >= 4) {
            spaceFive = hexInput.charAt(stringLength - 4);
            int numSpaceFive = Character.getNumericValue(spaceFive);
            valueFive = (int)numSpaceFive * (int)numFive;
        }
        else {
            valueFive = 0;
        }

        if (stringLength >= 5) {
            spaceSix = hexInput.charAt(stringLength - 5);
            int numSpaceSix = Character.getNumericValue(spaceSix);
            valueSix = (int)numSpaceSix * (int)numSix;
        }
        else {
            valueSix = 0;
        }

        if (stringLength >= 6) {
            spaceSeven = hexInput.charAt(stringLength - 6);
            int numSpaceSeven = Character.getNumericValue(spaceSeven);
            valueSeven = (int)numSpaceSeven * (int)numSeven;
        }
        else {
            valueSeven = 0;
        }

        if (stringLength >= 7) {
            spaceEight = hexInput.charAt(stringLength - 7);
            int numSpaceEight = Character.getNumericValue(spaceEight);
            valueEight = (int)numSpaceEight * (int)numEight;
        }
        else {
            valueEight = 0;
        }

        totalSum = (valueOne + valueTwo + valueThree + valueFour + valueFive + valueSix + valueSeven + valueEight);
        //String totalSumAsString = String.format("%.0f", totalSum);
        // http://javadevnotes.com/java-double-to-string-without-exponential-scientific-notation


        System.out.print("Your number is " + totalSumAsString + " in decimal");






                                }

                            }



