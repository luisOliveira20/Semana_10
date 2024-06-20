package pt.ipp.estg.dwdn.pdm1.semana_10;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class DisplayFragment extends Fragment {
    private TextView count;
    private SharedViewModel sharedViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mContentView = inflater.inflate(R.layout.activity_main, container, false);
        count = mContentView.findViewById(R.id.count);

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        Observer<Integer> counterObserver = count -> updateCounter(count);
        sharedViewModel.getCount().observe(getViewLifecycleOwner(), counterObserver);

        return mContentView;
    }
    private void updateCounter(int count) {
        count.setText(String.valueOf(count));
    }
}
