package pt.ipp.estg.dwdn.pdm1.semana_10;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class CouterFragment extends Fragment implements View.OnClickListener{

    private Button btnCounter;
    private SharedViewModel sharedViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mContentView = inflater.inflate(R.layout.activity_main, container, false);
        btnCounter = mContentView.findViewById(R.id.toast);
        btnCounter.setOnClickListener(this);

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        return mContentView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.toast:
                sharedViewModel.count();
                break;
        }
    }
}
