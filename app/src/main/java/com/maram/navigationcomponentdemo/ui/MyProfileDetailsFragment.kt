package com.maram.navigationcomponentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_myprofile.*

/**
 * Created by Marimuthu on 2019-09-25.
 */
class MyProfileDetailsFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_myprofile,container,false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = MyProfileDetailsFragmentArgs.fromBundle(arguments!!).myName
        tvDetailName.text = "Received Name: $name"
    }
}