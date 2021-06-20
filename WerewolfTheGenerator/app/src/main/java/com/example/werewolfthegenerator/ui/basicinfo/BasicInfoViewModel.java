package com.example.werewolfthegenerator.ui.basicinfo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BasicInfoViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public BasicInfoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is basic info fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}