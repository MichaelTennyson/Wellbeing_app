package com.TeamBee.WellbeingTracker;

import android.widget.ImageView;

public class items {
    private String image_name;
    private int image;

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }



    public items(int image, String image_name) {
        this.image = image;
        this.image_name = image_name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
