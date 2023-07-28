package com.qbra.navigationjava;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.qbra.navigationjava.FirstFragmentDirections;


public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSecondFragment(view);
            }
        });
    }

    public void goToSecondFragment(View view) {
        //NavDirections action = FirstFragmentDirections.actionFirstFragment2ToSecondFragment2();
        com.qbra.navigationjava.FirstFragmentDirections.ActionFirstFragment2ToSecondFragment2 action = FirstFragmentDirections.actionFirstFragment2ToSecondFragment2();
        action.setAge(21);
        Navigation.findNavController(view).navigate(action);
    }
}