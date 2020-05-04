package com.example.projectsw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;


public class LandingPageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landingpageactivity);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment.getId() == R.id.bi_titlebar) {
            Bundle b = new Bundle();
            b.putString(TitleBarFragment.ARG_PAGE_TITLE, "Manage your residents");
            b.putBoolean(TitleBarFragment.ARG_SHOW_HOME, false);
            b.putBoolean(TitleBarFragment.ARG_SHOW_MENU, true);
            fragment.setArguments(b);
        }
    }


}
