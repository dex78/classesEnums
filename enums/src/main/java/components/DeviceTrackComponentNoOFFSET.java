package components;

/**
 * Enum for shared functionality when offset tracking is disabled.
 */
public enum DeviceTrackComponentNoOFFSET implements DeviceTrackComponent {

    /** Represents the position of this device's clock, relative to position's of other devices. */
    POSITION(0, DeviceTrackComponentOFFSET.POSITION.getInitialNoise()),
    /** The second order (change over time) velocity component of POSITION. */
    VELOCITY(1, DeviceTrackComponentOFFSET.VELOCITY.getInitialNoise());

    private final int index;
    private final double initialNoise;

    DeviceTrackComponentNoOFFSET(final int index, final double initialNoise) {
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
