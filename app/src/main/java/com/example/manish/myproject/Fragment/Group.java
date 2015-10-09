package com.example.manish.myproject.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.manish.myproject.R;

/**
 * Created by manish on 9/10/15.
 */
public class Group extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.groups,container,false);
        return v;
    }
}

