package com.example.apptest2.ui.bundesliga;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.apptest2.databinding.FragmentBundesligaBinding;

public class BundesligaFragment extends Fragment {

    private FragmentBundesligaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BundesligaViewModel bundesligaViewModel =
                new ViewModelProvider(this).get(BundesligaViewModel.class);

        binding = FragmentBundesligaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBundesliga;
        bundesligaViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
