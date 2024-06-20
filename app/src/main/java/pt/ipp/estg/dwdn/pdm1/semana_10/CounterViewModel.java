package pt.ipp.estg.dwdn.pdm1.semana_10;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    private MutableLiveData<Integer> counter;

    public MutableLiveData<Integer> count(){
        if(counter == null){
            counter = new MutableLiveData<>();
            counter.setValue(0);
        } else {
            counter.setValue(counter.getValue() + 1);
        }
        public MutableLiveData<Integer> getCount() {
            if (counter == null) {
                counter = new MutableLiveData<>();
                counter.setValue(0);
            }
            return counter;
        }
    }
    @Override
    protected void onCleared() {
        super.onCleared();
    }

    public LiveData<Integer> getCount() {
        return null;
    }
}
