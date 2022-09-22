package android.bignerdranch.criminalapp;

import androidx.fragment.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createdFragment() {
        return new CrimeListFragment();
    }
}
