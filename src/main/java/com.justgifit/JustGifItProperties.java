package com.justgifit;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.File;

/**
 * Created by MaBa on 10/09/16.
 */
@ConfigurationProperties(prefix = "com.justgifit")
public class JustGifItProperties {

    /**
     * The location of animated gifs
     */
    private File gifLocation;

    /**
     * Whether or not to optimize web filters
     */
    private Boolean optimize;


    public File getGifLocation() {
        return gifLocation;
    }

    public void setGifLocation(File gifLocation) {

        this.gifLocation = gifLocation;
    }

    public Boolean getOptimize() {
        return optimize;
    }

    public void setOptimize(Boolean optimize) {
        this.optimize = optimize;
    }
}

