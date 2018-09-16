package com.example.a1.bestnosister.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.a1.bestnosister.R;

public class BottomFragment extends Fragment {
    private ImageView favouriteBt;
    private ImageView newsBt;
    private ImageView societyBt;
    private ImageView mineBt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_bottom,container,false);
        initView(view);
        return view;
    }

    public void initView(View view)
    {
        favouriteBt = (ImageView)view.findViewById(R.id.favourite_bt);
        newsBt = (ImageView)view.findViewById(R.id.new_bt);
        societyBt = (ImageView)view.findViewById(R.id.society_bt);
        mineBt = (ImageView)view.findViewById(R.id.mine_bt);
    }
}
