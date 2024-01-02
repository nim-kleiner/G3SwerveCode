package edu.greenblitz.robotName.subsystems.Gyros;

import edu.greenblitz.robotName.RobotConstants;

public class GyroFactory {

    public static IAngleMeasurementGyro create() {
        return switch (RobotConstants.ROBOT_TYPE) {
            case ROBOT_NAME -> new NavXGyro();
            case REPLAY -> new ReplayGyro();
            default -> new SimulationGyro();
        };
    }

}
