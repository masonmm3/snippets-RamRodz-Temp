package advanced;

//now that we have done structs, lets explain scoping

public class tScoping {
    public float number = 0;

    public tScoping() {
        //this is called a constructor, ill explain it in the next file
    }

    public void main() {
        //within main we can access numebr
        float numbers = number;

        //however even if we run function;
        function();

        //we cant access other number;
    }

    public void function() {
        float otherNumber = 2;
        float numbers = number;
        //here we can access number still (this is a reference to the current class structure);

    }
}