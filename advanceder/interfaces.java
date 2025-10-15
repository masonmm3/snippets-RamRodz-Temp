package advanceder;


//interfaces are a concept in oop that allow for what we refer to as polymorphism. polymorphism allows objects of different classes to be treated as a common type,
//enabling a single interface to be used with multiple implementations. This allows for a flexible and extensible design.

//below we have an example of an interface
interface motors {
    //to house universal variables in we create a calss that behaves like a "struct"
    public class motor {
        public int motorID = 0;
        public String name = "";
        public int maxSpeed = 0;
    }

    //to create a function we add a public default function
    //if the return is non null it must have a default return
    public default int setSpeed(int direction) {
            return 0;
        }
}

//in the above we create a template for all motors
//this allows us to do the following by 
//implementing the motors interface

class Neo implements motors {
    private int internalSpeed = 0;
    //to make use of shared constants you have to create a new version of a class
    private motor motor = new motor();

    public Neo(int motorID, int maxSpeed) {
        this.motor.maxSpeed = maxSpeed;
        this.motor.motorID = motorID;
    }

    //adding the overide keyword means that the function in the interface is replaced by this one
    @Override
    public int setSpeed(int direction) {
        internalSpeed += direction;
        //clamp limits the values ot be betwen the lower bound (input 2) amd the upper value (input 3)
        internalSpeed = Math.clamp(direction, -motor.maxSpeed, motor.maxSpeed);
        return internalSpeed;
    }

    //we can still make funcitons that are not a part of the interface in the child class
    // all that matters is we use the values in the interface
    public void disableMotor() {
        internalSpeed = 0;
        motor.maxSpeed = 0;
    }
}

class Falcon implements motors {
    //the true power is having multiple things that can do the same thing.
    //even though they arent identical
    private int currentSpeed = 0;
    private motor motor = new motor();

    public Falcon(String motorName, int maxVelocity) {
        this.motor.maxSpeed = maxVelocity;
        this.motor.name = motorName;
    }

    //here we can create a set speed with a different implementation
    @Override
    public int setSpeed(int direction) {
        currentSpeed += direction/60;
        //this motor uses RPS instead of RPM
        currentSpeed = Math.clamp(direction, -motor.maxSpeed, motor.maxSpeed);
        return currentSpeed;
    }
}

public class interfaces {
    private Neo neoMotor = new Neo(2, 100);
    private Falcon falconMotor = new Falcon("LEFT_FRONT",100);

    public interfaces() {
        
    }

    public void main() {
        //even though our neo and falcon are different we can use an array of 
        //motors to interface with both
        motors motors[] = {neoMotor, falconMotor};

        //this is called a foreach loop
        //if you dont need to modify one of the elements
        //they are useful as I can create a motor for each
        //element in the motors array
        for (motors motor : motors) {
            motor.setSpeed(0);
            //here we use it to set our motors velocity even though they are different
        }

        //You can also use them to create a generic interface.
        //for example in Advantage Kit code, we have ShooterIO which is a interface
        //Shooter can now use  ShooterIO for logic
        //ShooterNeo implements Shooter IO and has its own implementation of runFlywheels
        //ShooterFalcon Implements Shooter IO and has its own implementatino of runFlywheels
        //we can now hot swap the code between the two in robot container without changing the 
        //shooter implementation
    }

}
