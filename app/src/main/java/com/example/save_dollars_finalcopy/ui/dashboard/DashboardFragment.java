package com.example.save_dollars_finalcopy.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.save_dollars_finalcopy.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel incDayViewModel;
    private DashboardViewModel incWeekViewModel;
    private DashboardViewModel incMonthViewModel;
    private DashboardViewModel incYearViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        incDayViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        final EditText day = root.findViewById(R.id.incDaily);

        incDayViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                day.setText(s);
            }
        });

        incWeekViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        final EditText week = root.findViewById(R.id.incWeekly);

        incWeekViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                week.setText(s);
            }
        });

        incMonthViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        final EditText month = root.findViewById(R.id.incMonthly);

        incMonthViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                month.setText(s);
            }
        });

        incYearViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        final EditText year = root.findViewById(R.id.incYearly);

        incYearViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                year.setText(s);
            }
        });
        return root;
    }
}