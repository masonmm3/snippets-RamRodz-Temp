package Basics;

public class zIfs {
    public static void main() {
        //an important part of code is conditional logic. this is where IF comes into play.
        //ifs function very similarly to boolean varriables, if a value is would result in
        //a variable becoming true it runs the top,
        //else it runs the bottom

        if (4 > 2) {
            //This will run because 4 > 2 = true
        } else {
            //This will get skiped because the above condition ran
        }

        //ifs can be stacked with variables to allow for conditionals

        int number = 2;
        int checkAgainst = 4;

        if (number == checkAgainst) {
            number *= 2;
        } else {
            number = checkAgainst;
        }

        //ifs can also be stacked to create logic tress
        number = 2;
        checkAgainst = 4;

        if (number == checkAgainst) {
            number *= 2;
        } else if (number < checkAgainst) { 
            number = checkAgainst * 2;
            //because number is < check against, it does not run any code until the next comment
        } else if (number > checkAgainst) {
            number /= 4;
        } else {
            number = checkAgainst;
        }
        //at this point the code resumes regular execution.
        number = 2;
        checkAgainst = 4;
        //you can check mulitple cases in an if loop by using secondary conditions such as or(||) and and(&&);
        if (number == checkAgainst || number > checkAgainst * 4) {
            number *= 2;
        } else if (number < checkAgainst && number > checkAgainst / 2) { 
            number = checkAgainst * 2;
            //This is no longer true as 2 == 2 which is not >
        } else if (number > checkAgainst || number == 2) {
            //this is now true because 2 == 2. the or operator only needs ONE condition to be true
            number /= 4;
        } else {
            number = checkAgainst;
        }

        //the and and or operators can be combined to work with any data type.

        String word = "word";

        if (word == "word") {
            word = "WAIT";
        }

        boolean conditionA = false;
        boolean endState = true;

        if (conditionA || endState) {
            conditionA = false;
        }
    }
}
