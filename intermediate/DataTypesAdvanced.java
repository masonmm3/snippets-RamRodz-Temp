package intermediate;
import java.util.Optional;
//PLEASE READ FUNCTIONS FIRST

public class DataTypesAdvanced {
    //There are a few advanced Data types and features that have value

    //first we introduce the idea of null, which means does not exist.
    //this is usually the result of an error though is sometimes intended
    //We have to handle null ourselves, its most commonly found in OPTIONALS
    public Optional<String> hasUser(String name) {
        if ("Mason" == name) {
            return Optional.of("Masons Data");
        } else {
            return Optional.empty();
        }
    }

    public void Optionalmain() {
        Optional<String> dataA = hasUser("Mason");
        Optional<String> dataB = hasUser("Carter");

        int goodData = 0;

        if (dataA.isPresent()) {
            goodData++; //the postfix opperator of ++ adds 1 its functionally the same as += and can be used inline
        } 

        if (dataB.isPresent()) {
            goodData++;
        }
    }
    //Furtunately the only place I have seen them is in Photon Vision which we wont work much with.

    //The second thing we will cover is ENUMS
    //Enums are powerful because the represent a number, as a name

    //they consist of a visibility an enum indicator, and a name
    public enum RobotState {
        //inside the brakets we put our states
        IDLE,
        SCORING,
        EXPLODED
        //by standard all enum names should be capital
        //enums are also assingned an int so IDLE = 0
        // so (int)IDLE will give a 0 SCORING is 1
    }

    public void EnumMain() {
        RobotState state = RobotState.IDLE;
        boolean hasGamePiece = true;

        if (state == RobotState.IDLE && hasGamePiece) { //booleans are already true or false and thus can be checked without operators
            state = RobotState.SCORING;
            hasGamePiece = true;
        } else if (state == RobotState.SCORING && hasGamePiece) {
            state = RobotState.EXPLODED;
        } else if (state == RobotState.SCORING && !hasGamePiece) {
            state = RobotState.IDLE;
        }

        //The above is known as a state machine and is great at handling fixed substates that are difficult to handle with sensor or external handeling
    }

}