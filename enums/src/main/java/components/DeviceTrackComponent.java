package components;

/** An interface to get the index and initial noise of the different state vector components per device. */
public interface DeviceTrackComponent {

    /** @return The value of the component index. */
    int getIndex();

    /** @return The initial noise for the given deviceTrackComponent. */
    double getInitialNoise();

    /** The initial noise of the position which is being tracked in s. */
    double INITIAL_NOISE_POSITION = 20.0;

    /**
     * The initial noise of the velocity which is being tracked in s/s.
     * noise 1e-12 s^2/s^2 -> standard deviation 1e-6 s/s -> standard deviation 300 m/s
     */
    double INITIAL_NOISE_VELOCITY = 1e-14;

    /**
     * The initial noise of the offset which is being tracked in s.
     * noise 1e-16 s^2 -> standard deviation 1e-8 s -> standard deviation 3 m
     */
    double INITIAL_NOISE_OFFSET = 1e-16;

    /** The index of the position. */
    int INDEX_POSITION = 0;

    /** The index of the velocity. */
    int INDEX_VELOCITY = 1;

    /** The index of the offset. */
    int INDEX_OFFSET = 2;
}

