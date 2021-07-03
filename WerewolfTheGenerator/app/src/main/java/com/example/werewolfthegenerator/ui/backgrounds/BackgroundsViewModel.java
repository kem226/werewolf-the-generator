package com.example.werewolfthegenerator.ui.backgrounds;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BackgroundsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BackgroundsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is backgrounds fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}