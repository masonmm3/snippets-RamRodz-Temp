package Basics;

public class Variables {

    //ignore the below for now this will be explained later
    public static void main() {
        //Variables are really important in code. They are what make up the core of logic flow.

        //variables are data types, stored under a name, which can be modified.


        //numeric variable example
        int count = 0;

        //count is 0

        count = 1;

        //count now = 1

        count = 2 + 2;

        //variables can be used to do math and calculations
        
        
        //Variables can also be added together
        int anotherCount = 2;

        //NOTE: count as used here would use count before which is 4 and add 2
        count = count + anotherCount;
        //count = 6 afterwards. this is a complicated concept that changes language to language and fails many students on exams, so dont think too hard.

        //you can also modify with shorthand notation
        count += anotherCount;

        count = count^2;
        //count now = 8

        // subtraction (-) times (*) divide (/) and mod (%) can also be used 

        //Logic variable example
        boolean isThing = false;
        boolean thingExists = true;

        isThing = true;

        //logic variables can be compared to change the output
        isThing = thingExists == true;
        // == signifies that they are both the same state, in this case, true;
        //because they are isThing now = true

        //you can also compare numbers to change the state of a logic operator
        boolean largerThan2;
        int number = 4;
        largerThan2 = number > 2;
        //because count is > 2 largerThan2 is true;
        largerThan2 = number >= 3;
        //this would check if count is larger or equal to 3
        largerThan2 = number < 2;
        //this would check if count is less than 2

        //the ! is a not or inverse symbol.
        largerThan2 = !largerThan2;
        //this sets largerThan2 to the opposite of its current value (true)
    }

}
