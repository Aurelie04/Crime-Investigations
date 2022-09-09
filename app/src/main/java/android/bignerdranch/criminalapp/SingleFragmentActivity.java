package android.bignerdranch.criminalapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public abstract class SingleFragmentActivity extends AppCompatActivity {
    protected abstract Fragment createdFragment();

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_frame);

            FragmentManager fm = getSupportFragmentManager();

            Fragment fragment = fm.findFragmentById(R.id.fragment_container_view_tag);
            if(fragment==null){
                fragment = createdFragment();
                fm.beginTransaction().add(R.id.fragment_container_view_tag,fragment).commit();
            }
        }

        }




