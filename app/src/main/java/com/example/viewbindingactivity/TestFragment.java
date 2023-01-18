package com.example.viewbindingactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.viewbindingactivity.databinding.FragTextBinding;

public class TestFragment extends Fragment {
    private FragTextBinding mBinding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       mBinding = FragTextBinding.inflate(inflater,container,false);
       /*
       mBinding.btnFragment.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View view){
               mBinding.tvFragment.setText("fragment테스틋트트트");
           }
        });
*/
        return mBinding.getRoot();
    }

}
