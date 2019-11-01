package com.example.save_dollars_finalcopy.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("0");
    }

    public LiveData<String> getText() {
        return mText;
    }
    public void setText(String s) { mText.setValue(s); }
}