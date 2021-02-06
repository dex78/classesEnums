package components;

/** Enum for shared functionality when offset tracking is enabled. */
public enum DeviceTrackComponentOFFSET implements DeviceTrackComponent {
    /** Represents the position of this device's clock, relative to position's of other devices. */
    POSITION(0, INITIAL_NOISE_POSITION),
    /** The second order (change over time) velocity component of POSITION. */
    VELOCITY(1, INITIAL_NOISE_VELOCITY),
    /** The offset of one device. Usually this offset is due to different cable lengths and electrical paths. */
    OFFSET(2, INITIAL_NOISE_OFFSET);

    /** The initial noise of the position which is being tracked in s. */
    public static final double INITIAL_NOISE_POSITION = 20.0;

    /**
     * The initial noise of the velocity which is being tracked in s/s.
     * noise 1e-12 s^2/s^2 -> standard deviation 1e-6 s/s -> standard deviation 300 m/s
     */
    public static final double INITIAL_NOISE_VELOCITY = 1e-14;

    /**
     * The initial noise of the offset which is being tracked in s.
     * noise 1e-16 s^2 -> standard deviation 1e-8 s -> standard deviation 3 m
     */
    public static final double INITIAL_NOISE_OFFSET = 1e-16;

    private final int index;
    private final double initialNoise;

    DeviceTrackComponentOFFSET(final int index, final double initialNoise) {
        this.index = index;
        this.initialNoise = initialNoise;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public double getInitialNoise() {
        return initialNoise;
    }
}
