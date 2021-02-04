package components;

/**
 * The Position component when offset tracking is enabled.
 */
public class DeviceTrackComponentOFFSETPosition implements DeviceTrackComponentOFFSET, DeviceTrackComponentPosition {

    /** Represents the position in time of this device's clock, relative to positions of other devices. */
    public static final DeviceTrackComponentOFFSETPosition INSTANCE = new DeviceTrackComponentOFFSETPosition();

}
