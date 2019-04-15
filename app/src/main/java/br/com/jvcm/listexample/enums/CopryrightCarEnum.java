package br.com.jvcm.listexample.enums;

import android.support.annotation.DrawableRes;

import java.util.ArrayList;
import java.util.List;

import br.com.jvcm.listexample.R;

public enum CopryrightCarEnum {
    HONDA("Honda", R.drawable.ic_honda_logo),
    TOYOTA("Toyota", R.drawable.ic_launcher_foreground),
    GM("Gm", R.drawable.ic_logo_gm),
    FIAT("Fiat", R.drawable.ic_fiat_logo),
    FERRARI("Ferrari", R.drawable.ic_ferrari_logo),
    FORD("Ford", R.drawable.ic_ford_logo),
    HYUNDAI("Hyundai", R.drawable.ic_hyundai_logo),
    VOLKSWAGEN("Volkswagen", R.drawable.ic_volkswagen_logo),
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

    public static List getCollection(){
       List itens = new ArrayList();

       for(CopryrightCarEnum item: CopryrightCarEnum.values()){
           if(item==NONE) break;
           itens.add(item.mName);
       }

       return itens;
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
