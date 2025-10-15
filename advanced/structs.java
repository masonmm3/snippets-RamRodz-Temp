package advanced;


//Structs are a common data type in proggramming languages however, java doesnt have them
//so we will use a class as one.
//up to this point we have used pre made "data types"
//structs and classes allow us to make our own
class point {
    public float x = 0;
    public float y = 0;
}
//here we create a structure of data containing two points, an x and a y. they need a default value so we set them = to 0

public class structs {

    public structs() {
    }

    public void main() {
        point point = new point();
        point.x = 3;
        point.y = 2;
        //here we create a new point and set x and y valeus;
        //for the moment dont worry about the new keyword, but know it creates
        //a new of something that is not a default data type

        //go down to the below function
        printPoint(point);

        //now if we access point.x its 0!
        System.out.println(point.x);
    }

    //the real power of structs is when they are used in tandom with functions
    public void printPoint(point point) {
        System.out.println(point.x);
        System.out.println(point.y);

        //you can not only access them, but you can change them
        point.x = 0;
    }
}

