package components;


/**
 * Interface for shared functionality of the Velocity components.
 */
public interface DeviceTrackComponentVelocity extends DeviceTrackComponent {
    /**
     * The initial noise of the velocity which is being tracked in s/s.
     * noise 1e-12 s^2/s^2 -> standard deviation 1e-6 s/s -> standard deviation 300 m/s
     */
    double INITIAL_NOISE = 1e-14;

    @Override
    default int getIndex() {
        return 1;
    }

    @Override
    default double getInitialNoise() {
        return INITIAL_NOISE;
    }
}
