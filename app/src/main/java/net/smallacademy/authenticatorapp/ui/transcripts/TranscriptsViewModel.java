package net.smallacademy.authenticatorapp.ui.transcripts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TranscriptsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TranscriptsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}