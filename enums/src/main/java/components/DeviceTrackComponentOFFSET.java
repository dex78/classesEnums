package components;

/** Enum for shared functionality when offset tracking is enabled. */
public enum DeviceTrackComponentOFFSET implements DeviceTrackComponent {
    /** Represents the position of this device's clock, relative to position's of other devices. */
    POSITION(INDEX_POSITION, INITIAL_NOISE_POSITION),
    /** The second order (change over time) velocity component of POSITION. */
    VELOCITY(INDEX_VELOCITY, INITIAL_NOISE_VELOCITY),
    /** The offset of one device. Usually this offset is due to different cable lengths and electrical paths. */
    OFFSET(INDEX_OFFSET, INITIAL_NOISE_OFFSET);

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
