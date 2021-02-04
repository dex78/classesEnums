package components;

/**
 * The Velocity component when offset tracking is enabled.
 */
public class DeviceTrackComponentOFFSETVelocity implements DeviceTrackComponentOFFSET, DeviceTrackComponentVelocity {
    /** The second order (change over time) velocity component of position. */
    public static final DeviceTrackComponentOFFSETVelocity INSTANCE = new DeviceTrackComponentOFFSETVelocity();
}
