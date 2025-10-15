package intermediate;

public class Switches {
    //Switches are shorthand if statements primarily focused on int, and enums.
      public enum RobotState {
        IDLE,
        PREP,
        SCORING
    }

    private void main() {
        RobotState state = RobotState.IDLE;
        boolean hasPiece = true;

        switch (state) {
            //case IDLE represents state == RobotState.IDLE
            case IDLE:
                if (hasPiece) {
                    state = RobotState.PREP;
                }
                //break marks the end of code within this case of state
                break;
            case PREP:
                state = RobotState.SCORING;
                break;
            case SCORING:
                state = RobotState.IDLE;
                hasPiece = false;
            default:
                break;
        }
    }
}
