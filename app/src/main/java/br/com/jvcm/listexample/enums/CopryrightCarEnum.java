package br.com.jvcm.listexample.enums;

import android.support.annotation.DrawableRes;

import br.com.jvcm.listexample.R;

public enum CopryrightCarEnum {
    HONDA("Honda", R.drawable.ic_honda_logo),
    TOYOTA("Toyota", R.drawable.ic_launcher_foreground),
    GM("Gm", R.drawable.ic_logo_gm),
    FIAT("Fiat", R.drawable.ic_launcher_foreground),
    FERRARI("Ferrari", R.drawable.ic_launcher_foreground),
    NONE("none", 0);

    private String mName;
    private int mResource;

   CopryrightCarEnum(String name, @DrawableRes int resource){
        mName = name;
        mResource = resource;
    }

    public int getResource() {
        return mResource;
    }

    public static CopryrightCarEnum fromString(String name){
       for (CopryrightCarEnum item: CopryrightCarEnum.values()){
          if(item.mName.equals(name)){
              return item;
          }
          else{
              continue;
          }
       }
       return NONE;
    }
}
