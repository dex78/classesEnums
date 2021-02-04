package components;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A supplier for the state vector components when offset tracking is enabled or disabled.
 * @param <T> Type of the DeviceTrackComponent, OFFSET or NoOFFSET
 */
public final class DeviceTrackComponentSupplier<T extends DeviceTrackComponent> {
    /**
     * List of the DeviceTrackComponents.
     */
    private final List<T> deviceTrackComponents;

    /**
     * Instance with offset tracking enabled.
     */
    public static final DeviceTrackComponentSupplier<DeviceTrackComponentOFFSET> OFFSET_COMPONENTS = new DeviceTrackComponentSupplier<>(Arrays.asList(
            DeviceTrackComponentOFFSET.POSITION,
            DeviceTrackComponentOFFSET.VELOCITY,
            DeviceTrackComponentOFFSET.OFFSET));

    /**
     * Instance with offset tracking disabled.
     */
    public static final DeviceTrackComponentSupplier<DeviceTrackComponentNoOFFSET> NO_OFFSET_COMPONENTS = new DeviceTrackComponentSupplier<>(Arrays.asList(
            DeviceTrackComponentNoOFFSET.POSITION,
            DeviceTrackComponentNoOFFSET.VELOCITY));

    private DeviceTrackComponentSupplier(final List<T> components) {
        deviceTrackComponents = Collections.unmodifiableList(components);
    }

    public List<T> get() {
        return deviceTrackComponents;
    }

    /** @return The total number of values. */
    public int getLength() {
        return deviceTrackComponents.size();
    }
}
