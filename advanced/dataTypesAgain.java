package advanced;

public class dataTypesAgain {
    //Sometimes a data type isnt what you need it to be to be used
    //for example the following function only takes int
    public boolean isEven(int number) {
        int value = number % 2;
        //mod returns the remainder of a division value so 100 % 2 = 0 but 5 % 3 = 2 (3 goes into 5 onece leaving a remander of 2)
        
        return value == 0;   
    }

    //Howerver we may need to check a double.
    public static void main() {

        dataTypesAgain data = new dataTypesAgain();
        //we learn this next :)

        double number = 20.0;

        //in order to do so we need to use "casting"
        boolean even = data.isEven((int)number);
        //this turns your value into an int

        int smallValue = 2;
        //it can also be used to "upgrade" a data type to a larger type
        double largerValue = (double) smallValue;

        //HOWEVER be aware that not all values can be cast and when turning a double to an int, you will always loose the decimal WITHOUT rounding. 20.9 = 20, 20.1 = 20!
    }
}