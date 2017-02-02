package com.bye.project;

import android.graphics.drawable.Drawable;

/**
 * Created by webster on 9/7/16.
 */
public class ImageGridModel {

    private Drawable image;
    private String caption;

    public ImageGridModel(Drawable xImage, String xCaption) {
        this.image = xImage;
        this.caption = xCaption;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

}