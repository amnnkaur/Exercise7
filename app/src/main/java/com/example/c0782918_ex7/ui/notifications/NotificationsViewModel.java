package com.example.c0782918_ex7.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
       mText.setValue(" Lambton in Toronto at Cestar College\n" +
               "        Mobile- 416-485-2098\n" +
               "        400-265 Yorkland Blvd\n" +
               "        Toronto, ON M2J 1S5\n" +
               "        lambton@cestarcollege.com");
    }

    public LiveData<String> getText() {
        return mText;
    }
}