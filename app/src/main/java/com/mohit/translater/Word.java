package com.mohit.translater;

public class Word {
 private String mDefaultTranslation;
 private String mMiwokTranslation;
 private int mimageResourceId=NO_IMAGE_PROVIDED;
 private int maudioResourceId;
 private static final int NO_IMAGE_PROVIDED=-1;

 public Word(String DefaultTranslation, String MiwokTranslation,int audioResourceId){
     mDefaultTranslation=DefaultTranslation;
     mMiwokTranslation = MiwokTranslation;
     maudioResourceId=audioResourceId;
 }
 public Word(String DefaultTranslation, String MiwokTranslation,int imageResourceId,int audioResourceId){
     mDefaultTranslation=DefaultTranslation;
     mMiwokTranslation = MiwokTranslation;
     mimageResourceId=imageResourceId;
     maudioResourceId=audioResourceId;
 }
    public String getDefaultTranslation(){
         return mDefaultTranslation;
     }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceId(){return mimageResourceId; }
    public int getMaudioResourceId(){
    return maudioResourceId;
    }
    public boolean hasImage(){

         return mimageResourceId != NO_IMAGE_PROVIDED;

    }



}
