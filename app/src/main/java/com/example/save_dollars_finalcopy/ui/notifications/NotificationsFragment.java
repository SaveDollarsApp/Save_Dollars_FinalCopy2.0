package com.example.save_dollars_finalcopy.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.save_dollars_finalcopy.R;
import com.example.save_dollars_finalcopy.ui.dashboard.DashboardViewModel;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel expDayViewModel;
    private NotificationsViewModel expWeekViewModel;
    private NotificationsViewModel expMonthViewModel;
    private NotificationsViewModel expYearViewModel;

    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, final Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        expDayViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        final EditText day = root.findViewById(R.id.expDaily);

        expDayViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                    if(!s.equals(expDayViewModel.getText().toString())) expDayViewModel.setText(s);
                day.setText(s);
//                expDayViewModel.setText(s);
            }
        });
//        expDayViewModel.setText(day.getText().toString());

        expWeekViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        final EditText week = root.findViewById(R.id.expWeekly);

        expWeekViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                week.setText(s);
            }
        });

        expMonthViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        final EditText month = root.findViewById(R.id.expMonthly);

        expMonthViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                month.setText(s);
            }
        });

        expYearViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        final EditText year = root.findViewById(R.id.expYearly);

        expYearViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                year.setText(s);
            }
        });
        return root;
    }
}