package com.example.myfragment;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class SecondActivity extends AppCompatActivity {
    private MViewModel mViewModel;
    private TextView mTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity2);
        mTextView=findViewById(R.id.desc);
        mViewModel = ViewModelProviders.of(this).get(MViewModel.class);

        mViewModel.getString().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.e("MainActivity", "耗时任务结束返回数据");
                mTextView.setText(s);
            }
        });

    }
}
