package ua.example.rash1k.remindme.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.example.rash1k.remindme.R;


public class ExampleFragment extends Fragment {

    private static final int LAYOUT = R.layout.frgament_example;

    public static ExampleFragment newInstance() {
        
        Bundle args = new Bundle();
        
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);
        return fragment;
    }
    

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(LAYOUT,container,false);
        
        
        return view;

    }
}
