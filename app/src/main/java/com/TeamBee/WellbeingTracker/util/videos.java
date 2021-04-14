package com.TeamBee.WellbeingTracker.util;

import android.media.MediaRecorder;

public class videos {
    String videoURL;
    public videos(){}

    public videos(String videoURL){
        this.videoURL = videoURL;
    }

    public String getVideoURL(){
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }
}
