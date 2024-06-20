package pt.ipp.estg.dwdn.pdm1.semana_10;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private MutableLiveData<Integer> counter;

    public void count(){
        if(counter == null){
            counter = new MutableLiveData<>();
            counter.setValue(0);
        } else {
            counter.setValue(counter.getValue() + 1);
        }
    }
    public MutableLiveData<Integer> getCount(){
        if (counter == null) {
            counter = new MutableLiveData<>();
            counter.setValue(0);
        }
        return counter;
    }
}
