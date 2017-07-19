package com.example.android.miwok;

/**
 * Created by Anumeha Agrawal on 7/14/2017.
 */

public class word {
    private String mdefaultword;
    private String mmiwokword;
    public word(String miwokword,String defaultword){
       mdefaultword=defaultword;
        mmiwokword=miwokword;
    }
    public String getMdefaultworddefault(){
        return mdefaultword;
    }
    public String getMmiwokword(){
        return mmiwokword;
    }
}
