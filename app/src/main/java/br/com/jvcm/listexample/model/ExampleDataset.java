package br.com.jvcm.listexample.model;

import android.support.annotation.DrawableRes;
import android.widget.Button;

import br.com.jvcm.listexample.enums.CarEnum;
import br.com.jvcm.listexample.enums.CopryrightCarEnum;

public class ExampleDataset {

    private String name;
    private String copyright;
    @DrawableRes
    private int imageCopyright;
    @DrawableRes
    private int imgeCar;
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
        setImageCopyright(CopryrightCarEnum.
                fromString(getCopyright()).getResource());
    }

    public int getImageCopyright() {
        return imageCopyright;
    }

    public void setImageCopyright(int imageCopyright) {
        this.imageCopyright = imageCopyright;
    }

    public int getImgeCar() {
        return imgeCar;
    }

    public void setImgeCar(int imgeCar) {
        this.imgeCar = imgeCar;
    }

    private void setCarImage() {
        setImgeCar(CarEnum.fromString(getName()).getResource());
    }
}
