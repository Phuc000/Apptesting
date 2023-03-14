package com.example.apptest2.ui.bundesliga;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BundesligaViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public BundesligaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
