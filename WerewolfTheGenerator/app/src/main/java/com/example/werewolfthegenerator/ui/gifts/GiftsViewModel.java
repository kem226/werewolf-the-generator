package com.example.werewolfthegenerator.ui.gifts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GiftsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GiftsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gifts fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}