package advanced;

//Classes, they are the CORE of java, you have seen all of these things in every other file but now we explain why

//Classes expand on the idea of a struct, isntead of just having values, you can have functions which modify themselves.
//lets get into it

//take a motor
class motor{
    //all motors have a max rpm
    public double MAX_RPM;

    //they also have a speed
    private double _rpm;
    //note that its private, that means it can only be accessed from within the scope of THIS class while public can be accessed from outside.

    //notics that this function lacks a return type and is the same name as the class. this is called a constructor
    public motor(double maxRPM) {
        MAX_RPM = maxRPM;
        //constructors allow you to pass values in from outside the class as soon as its created,
    }

    //now we can create a function which can be called from outside this class
    public void runMotor(float direction) {
        _rpm += 1 * direction;

        //now we can have helper functions also change rpm
        checkMax();
    }

    //note that its private, and thus cant be called outside the motor class
    private void checkMax() {
        if (Math.abs(_rpm) > MAX_RPM) {
            _rpm = MAX_RPM;
        }
    }

    //now we can use a getter to return the rpm without breaking logic flow
    public double getRPM() {
        return _rpm;
    }
}

//now lets apply it to code
public class uClasses {
    public static void main() {
        //lets create two Motors
        motor motorA = new motor(100); //not how my constructor value is asked for here
        motor motorB = new motor(20);

        //we now have TWO instances of motor, their both a motor but they have different attributes
        //that is the power of a class

        //now we can all our public function to run it
        motorA.runMotor(500);
        motorB.runMotor(-80);

        //note how both are independant, its no different than having two floats, they can just operate on themselves now!

        //if we log the outputs
        double motorASpeed = motorA.getRPM(); 
        double motorBSpeed = motorB.getRPM();

        //a would be 100
        //while b would be -20.

        //both of them share the functions of a motor but can be distinct.
    }
}
