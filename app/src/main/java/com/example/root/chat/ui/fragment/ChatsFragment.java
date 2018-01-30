package com.example.root.chat.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.root.chat.R;

/**
 * Created by root on 1/30/18.
 */

public class ChatsFragment extends Fragment {
    private View mMainView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mMainView = inflater.inflate(R.layout.fragment_chats, container, false);
        return mMainView;
    }
}
