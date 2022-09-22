package android.bignerdranch.criminalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createdFragment() {
        return new CrimeFragment();
    }
}