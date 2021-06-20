package com.example.werewolfthegenerator.ui.attributes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AttributesViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AttributesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the attributes fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}