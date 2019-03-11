package com.example.android.miwok;

/**
 *{@link Word} represents a vocabulary word.
 * It contains a default translation and a Miwok translation.
 *
 */
public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageId = NO_IMAGE_PROVIDED;
    private int mSoundId;

    /**
     *
     * @param defaultT is the default translation of the word
     * @param miwokT is the miwok translation of the word
     * @param imgId is the image associated with the word (optional)
     */
    public Word(String defaultT, String miwokT, int imgId, int soundId){
        mDefaultTranslation = defaultT;
        mMiwokTranslation = miwokT;
        mImageId = imgId;
        mSoundId = soundId;
    }
    public Word(String defaultT, String miwokT, int soundId){
        mDefaultTranslation = defaultT;
        mMiwokTranslation = miwokT;
        mSoundId = soundId;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageId(){
        return mImageId;
    }
    public boolean hasImage(){
        return mImageId != NO_IMAGE_PROVIDED;
    }
    public int getSoundId(){
        return mSoundId;
    }

}
