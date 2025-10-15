package intermediate;

public class Functions {
    //A function is made up of several things
    //First, a visibility modifier such as public or private, then a return type, such as int, or boolean, 
    // finally, a name followed by () 
    // inside the () your passthrough values. then start you code section indicated by and ended by {}

    private boolean isRunning(int passthrough) {
        if (passthrough > 1) {
            return true;
        } else {
            return false;
        }
    }
    //above we have a funciton with a private visibility, that returns a boolean, named isRunning with an integer input.
    //if the input is larger than 1, then the funcitons returns true, else if retuns false.


    public static void main() {
        //The main function gains the static indicator which will be explained at a later point
        Functions func = new Functions();
        //The above creates a class instance which will be explained later

        boolean run = func.isRunning(10);
        //run now = true
    }

    //you can input multiple values to a function by seperating them with a ,

    private double scale(double a, double b) {
        return a * b;
    }

    
}
