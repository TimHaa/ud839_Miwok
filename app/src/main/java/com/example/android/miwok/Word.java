package com.example.android.miwok;

/**
 *{@link Word} represents a vocabulary word.
 * It contains a default translation and a Miwok translation.
 *
 */
public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    public Word(String defaultT, String miwokT){
        mDefaultTranslation = defaultT;
        mMiwokTranslation = miwokT;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }


}
