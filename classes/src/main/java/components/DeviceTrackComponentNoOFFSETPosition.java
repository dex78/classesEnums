package components;

/** The Position component when offset tracking is disabled. */
public class DeviceTrackComponentNoOFFSETPosition implements DeviceTrackComponentNoOFFSET, DeviceTrackComponentPosition {

    /**  Represents the position in time relative to positions of other devices. */
    public static final DeviceTrackComponentNoOFFSETPosition INSTANCE = new DeviceTrackComponentNoOFFSETPosition();

}