package net.smallacademy.authenticatorapp.ui.passport;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PassportViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PassportViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}