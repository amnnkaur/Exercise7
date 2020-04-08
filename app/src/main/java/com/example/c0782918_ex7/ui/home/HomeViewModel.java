package com.example.c0782918_ex7.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Android is a mobile operating system developed by Google.\n" +
                "        It is used by several smartphones and tablets. \n" +
                "        Examples include the Sony Xperia, the Samsung Galaxy, and the Google Nexus One.\n" +
                "        The Android operating system (OS) is based on the Linux kernel.\n" +
                "        Unlike Apple's iOS, Android is open source, meaning developers can modify and customize the OS for each phone.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}