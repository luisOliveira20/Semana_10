package pt.ipp.estg.dwdn.pdm1.semana_10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CounterViewModel counterViewModel;
    private TextView hello;
    private Button toast;
    private TextView numero;
    private Button count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterViewModel = new ViewModelProvider(this).get(CounterViewModel.class);

        Observer<Integer> countObserver = new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                updateCounter(count);
            }
        };
        counterViewModel.getCount().observe(this, countObserver);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.count:
                counterViewModel.count();
                break;
        }
    }
    private void updateCounter(Button count){
        numero.setText(String.valueOf(count));
    }
}