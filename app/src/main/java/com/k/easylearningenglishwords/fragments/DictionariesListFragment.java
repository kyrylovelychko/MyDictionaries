package com.k.easylearningenglishwords.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.k.easylearningenglishwords.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class DictionariesListFragment extends Fragment {

    public DictionariesListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dictionaries_list, container, false);
    }
}