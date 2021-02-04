package components;

/**
 * The Offset component when offset tracking is enabled.
 * Usually this offset is due to different cable lengths and electrical paths.
 */
public class DeviceTrackComponentOFFSETOffset implements DeviceTrackComponentOFFSET {

    /**
     * The initial noise of the offset which is being tracked in s.
     * noise 1e-16 s^2 -> standard deviation 1e-8 s -> standard deviation 3 m
     */
    private static final double INITIAL_NOISE = 1e-16;

    public static final DeviceTrackComponentOFFSETOffset INSTANCE = new DeviceTrackComponentOFFSETOffset();

    @Override
    public int getIndex() {
        return 2;
    }

    @Override
    public double getInitialNoise() {
        return INITIAL_NOISE;
    }
}
