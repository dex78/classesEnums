package components;

/** An interface to get the index and initial noise of the different state vector components per device. */
public interface DeviceTrackComponent {

    /** @return The value of the component index. */
    int getIndex();

    /** @return The initial noise for the given deviceTrackComponent. */
    double getInitialNoise();
}

