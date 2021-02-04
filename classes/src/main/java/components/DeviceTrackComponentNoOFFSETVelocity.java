package components;

/** The Velocity component when offset tracking is disabled. */
public class DeviceTrackComponentNoOFFSETVelocity implements DeviceTrackComponentNoOFFSET, DeviceTrackComponentVelocity {

    /** The second order (change over time) velocity component of position. */
    public static final DeviceTrackComponentNoOFFSETVelocity INSTANCE = new DeviceTrackComponentNoOFFSETVelocity();

}