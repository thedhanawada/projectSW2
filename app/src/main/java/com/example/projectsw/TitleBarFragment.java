package com.example.projectsw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TitleBarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TitleBarFragment extends Fragment {
    public static final String ARG_PAGE_TITLE = "page_title";
    public static final String ARG_SHOW_MENU = "show_menu";
    public static final String ARG_SHOW_HOME = "show_home";
    public static final String ARG_SHOW_BACK = "show_back";
    public static final String ARG_RESIDENT_NAME = "resident_name";
    public static final String ARG_RESIDENT_DOB = "resident_dob";
    public static final String ARG_RESIDENT_PHOTO_URL = "resident_photo_url";

    private String pageTitle;
    private Boolean showMenu;
    private Boolean showHome;
    private Boolean showBack;
    private String residentName;
    private String residentDob;
    private String residentPhotoUrl;

    private View view;

    public TitleBarFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment TitleBar.
     */
    public static TitleBarFragment newInstance(String title, Boolean showMenu, Boolean showHome, Boolean showBack, String residentName, String residentDob, String residentPhotoUrl) {
        TitleBarFragment fragment = new TitleBarFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PAGE_TITLE, title);
        args.putString(ARG_SHOW_HOME, Boolean.toString(showHome));
        args.putString(ARG_SHOW_MENU, Boolean.toString(showMenu));
        args.putString(ARG_SHOW_BACK, Boolean.toString(showBack));
        args.putString(ARG_RESIDENT_NAME, residentName);
        args.putString(ARG_RESIDENT_DOB, residentDob);
        args.putString(ARG_RESIDENT_PHOTO_URL, residentPhotoUrl);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
        }
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_title_bar, container, false);
        SpaceNavigationView spaceNavigationView = (SpaceNavigationView) view.findViewById(R.id.space);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.showIconOnly();
        spaceNavigationView.addSpaceItem(new SpaceItem("HOME", R.drawable.icon_home_48));
        spaceNavigationView.addSpaceItem(new SpaceItem("SEARCH", R.drawable.user_icon));

        return view;

    }



    }
