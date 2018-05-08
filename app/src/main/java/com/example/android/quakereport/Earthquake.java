package com.example.android.quakereport;

public class Earthquake {



    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    /** Magnitude of the earthquake */
    private double mMagnitude;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mLocation;


    /** Time of the earthquake */
    private long mTimeInMilliseconds;


    /** Website URL of the earthquake */
    private String mUrl;


    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Earthquake(double magnitude, String location, long timeInMilliseconds,String url)
    {
       mMagnitude = magnitude;
       mLocation = location;
       mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the Android version number
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }



    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

}




