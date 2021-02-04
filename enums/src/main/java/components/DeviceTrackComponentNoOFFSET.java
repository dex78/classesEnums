package components;

/**
 * Enum for shared functionality when offset tracking is disabled.
 */
public enum DeviceTrackComponentNoOFFSET implements DeviceTrackComponent {

    /** Represents the position of this device's clock, relative to position's of other devices. */
    POSITION {
        @Override
        public int getIndex() {
            return 0;
        }

        @Override
        public double getInitialNoise() {
            return DeviceTrackComponentOFFSET.POSITION.getInitialNoise();
        }
    },
    /** The second order (change over time) velocity component of POSITION. */
    VELOCITY {
        @Override
        public int getIndex() {
            return 1;
        }

        @Override
        public double getInitialNoise() {
            return DeviceTrackComponentOFFSET.VELOCITY.getInitialNoise();
        }
    }
}
