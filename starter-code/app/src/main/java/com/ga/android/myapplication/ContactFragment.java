package com.ga.android.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by erickivet on 7/20/16.
 */
public class ContactFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(android.R.layout.simple_list_item_1,container,false);
        TextView contact = (TextView)view.findViewById(android.R.id.text1);
        contact.setText("1-800-377-SAGET\nsaget@sagetforking.com\nFacebook:facebook.com/saget\nTwitter:" +
                "twitter.com/therealsaget");
        return view;
    }
}
