package br.com.jvcm.listexample.model;

import android.widget.Button;

public class ExampleDataset {

    private String name;
    private String copyright;
    private String image;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
