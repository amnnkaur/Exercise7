package com.example.c0782918_ex7.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Name - Amanpreet kaur\n" +
                "        Student ID - C0782918");
    }

    public LiveData<String> getText() {
        return mText;
    }
}