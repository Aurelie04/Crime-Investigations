package android.bignerdranch.criminalapp;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitle;
    private Button mDateButton;
    private CheckBox mCheckBox;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime =new Crime();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime,container,false);
        mTitle = (EditText) v.findViewById(R.id.crime_title);
        mTitle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
               //Left it blank intentionally
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            mCrime.setTitle(toString().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //Left it blank intentionally
            }
        });
        mDateButton = (Button) v.findViewById(R.id.crime_date);
        mDateButton.setText((mCrime.getDate().toString()));
        mDateButton.setEnabled(false);

        mCheckBox = (CheckBox) v.findViewById(R.id.crime_solved);

        mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                mCrime.setSolved(isChecked);
            }
        });
        return super.onCreateView(inflater, container, savedInstanceState);

    }
}
