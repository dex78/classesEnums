package components;

/** Enum for shared functionality when offset tracking is enabled. */
public enum DeviceTrackComponentOFFSET implements DeviceTrackComponent {
    /** Represents the position of this device's clock, relative to position's of other devices. */
    POSITION {
        @Override
        public int getIndex() {
            return 0;
        }

        /**
         * The initial noise of the position which is being tracked in s.
         */
        public static final double INITIAL_NOISE = 20.0;

        @Override
        public double getInitialNoise() {
            return INITIAL_NOISE;
        }
    },
    /** The second order (change over time) velocity component of POSITION. */
    VELOCITY {
        @Override
        public int getIndex() {
            return 1;
        }

        /**
         * The initial noise of the velocity which is being tracked in s/s.
         * noise 1e-12 s^2/s^2 -> standard deviation 1e-6 s/s -> standard deviation 300 m/s
         */
        public static final double INITIAL_NOISE = 1e-14;

        @Override
        public double getInitialNoise() {
            return INITIAL_NOISE;
        }
    },
    /**
     * The offset of one device.
     * Usually this offset is due to different cable lengths and electrical paths.
     */
    OFFSET {
        @Override
        public int getIndex() {
            return 2;
        }
        /**
         * The initial noise of the offset which is being tracked in s.
         * noise 1e-16 s^2 -> standard deviation 1e-8 s -> standard deviation 3 m
         */
        public static final double INITIAL_NOISE = 1e-16;

        @Override
        public double getInitialNoise() {
            return INITIAL_NOISE;
        }
    }
}
