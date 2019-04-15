package br.com.jvcm.listexample.model;

import android.support.annotation.DrawableRes;
import android.widget.Button;

import br.com.jvcm.listexample.enums.CarEnum;
import br.com.jvcm.listexample.enums.CopryrightCarEnum;

public class ExampleDataset {

    private String name;
    private String copyright;
    private @DrawableRes
    int image;
    private Button btninsert;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setCarImage();
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
        setCopyrightImage();
    }

    private void setCopyrightImage() {
        setImage(CopryrightCarEnum.
                fromString(getCopyright()).getResource());
    }

    private void setCarImage(){
        setImage(CarEnum.
                fromString(getName()).getResource());
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
