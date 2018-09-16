package com.example.a1.bestnosister.ui.fragment;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.a1.bestnosister.R;

public class ToolbatFragment extends Fragment {

    private Toolbar toolTitleBar;
    private ImageView titleImg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_toolbar,container,false);
        initView(view);
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
        menu.clear();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void initView(View view)
    {
        toolTitleBar = (Toolbar)view.findViewById(R.id.title_toolbar);
        titleImg = (ImageView)view.findViewById(R.id.tool_title_bar_img);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolTitleBar);
        //toolTitleBar.setTitle("百思不得姐");
        setHasOptionsMenu(true);
    }

}
