package components;

/**
 * Interface for shared functionality of the Position components.
 */
public interface DeviceTrackComponentPosition extends DeviceTrackComponent {

    /**
     * The initial noise of the position which is being tracked in s.
     */
    double INITIAL_NOISE = 20.0;

    @Override
    default int getIndex() {
        return 0;
    }

    @Override
    default double getInitialNoise() {
        return INITIAL_NOISE;
    }
}
