package dk.itu.spvct.android.phonecontext;

import android.graphics.Color;
import android.location.Location;

import org.altbeacon.beacon.Beacon;

import java.util.Date;
import java.util.Random;

/**
 * Created by lars on 05/03/15.
 */
public class BeaconLocation {

    private Beacon mBeacon;
    private Location mLocation;
    private Date updated;
    private int color;

    public int getColor() {
        return color;
    }

    public BeaconLocation(Beacon beacon, Location location) {
        this.mBeacon = beacon;
        this.mLocation = location;
        updated = new Date();
        Random rnd = new Random();
        color = Color.argb(100, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

    public Beacon getBeacon() {
        return mBeacon;
    }

    public void setBeacon(Beacon beacon) {
        this.mBeacon = beacon;
    }

    public Location getLocation() {
        return mLocation;
    }

    public void setLocation(Location mLocation) {
        this.mLocation = mLocation;
        updated = new Date();
    }

}
