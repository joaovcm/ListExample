package br.com.jvcm.listexample.model;

import android.support.annotation.DrawableRes;
import android.widget.Button;

public class ExampleDataset {

    private String name;
    private String copyright;
    private @DrawableRes int image;
    private Button btninsert;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
