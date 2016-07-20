package com.ga.android.myapplication;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class PlaceholderFragment extends Fragment {

   //This is a blank fragment
   //Implement your own version of Fragments for this lab

   ImageView saget;
   @Nullable
   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
      View view = inflater.inflate(R.layout.fragment_image,container,false);
      saget = (ImageView)view.findViewById(R.id.saget_image);
      saget.setImageResource(R.drawable.saget);

      return view;

   }


   }
