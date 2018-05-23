package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation fo that word.
 */

public class Word {

    // Default translation for the word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    //Audio resource ID for the word */
    private int mAudioResourceId;


    // Image resource ID for the word
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    // Create a new Word object
    // @param defaultTranslation is the word in a language that the user (such  as English)
    // @param miwokTranslation is the word in the Miwok language
    // @param audioResourceId is the resource ID for the audio file associated with this word
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    // Create a new Word object
    // @param defaultTranslation is the word in a language that the user (such  as English)
    // @param miwokTranslation is the word in the Miwok language
    // @param imageResourceID is the drawable resource ID for the image associated with the word
    // @param audioResourceId is the resource ID for the audio file associated with this word
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceId = audioResourceId;
    }

    // Get the default translation of the word.
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the Miwok translation of the word.
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    // Get the image resource ID of the word.
    public int getImageResourceID() {
        return mImageResourceID;
    }

    // Returns whether or not there is an image for this word
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    // Return the audio resource ID of the word.
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

}
