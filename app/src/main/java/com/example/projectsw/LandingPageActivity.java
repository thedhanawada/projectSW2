package com.example.projectsw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;


public class LandingPageActivity extends AppCompatActivity {
    private SpaceNavigationView spaceNavigationView;
    Context context = LandingPageActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.landingpageactivity);
        spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);

        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Toast.makeText(LandingPageActivity.this,"onCentreButtonClick", Toast.LENGTH_SHORT).show();
                spaceNavigationView.shouldShowFullBadgeText(true);
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                Toast.makeText(LandingPageActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                if(itemIndex==1)
                {
                    Intent startChildActivityIntent = new Intent(context, LoginActivity.class);
                    ActivityOptions options =
                            ActivityOptions.makeCustomAnimation(context, R.anim.fade_in, R.anim.fade_out);

                    context.startActivity(startChildActivityIntent, options.toBundle());


                }
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                Toast.makeText(LandingPageActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
            }
        });


    }
    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment.getId() == R.id.bi_titlebar) {
            Bundle b = new Bundle();
            fragment.setArguments(b);
        }
    }



}
