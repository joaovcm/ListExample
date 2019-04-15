package br.com.jvcm.listexample.enums;

import android.support.annotation.DrawableRes;

import br.com.jvcm.listexample.R;

public enum CarEnum {
    GOL("Gol", R.drawable.ic_gol_car),
    HB20("HB20", R.drawable.ic_hb20_car),
    SAVEIRO("Saveiro", R.drawable.ic_saveiro_car),
    ONIX("Onix", R.drawable.ic_onix_car),
    UNO("Uno", R.drawable.ic_uno_car),
    NONE("NOME", R.drawable.ic_launcher_foreground);

    private String mCarName;
    private int mResurce;

    CarEnum(String CarName, @DrawableRes int Resurce){
        mCarName = CarName;
        mResurce = Resurce;
    }

    public static CarEnum fromString(String value){
        for (CarEnum item: values()){
            if (item.mCarName.equals(value)){
                return item;
            }
        }
        return NONE;

    }


    public int getResource() { return mResurce; }
}
