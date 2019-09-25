package com.maram.navigationcomponentdemo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.maram.navigationcomponentdemo.R
import kotlinx.android.synthetic.main.fragment_menu.*

/**
 * Created by Marimuthu on 2019-09-25.
 */
class MenuFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_menu,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goProfileList.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_menuFragment_to_profileListFragment)
        }

        goFavourite.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_menuFragment_to_favouriteFragment)
        }

        goAboutUs.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_menuFragment_to_aboutUsFragment)
        }

        goSettings.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_menuFragment_to_settingsFragment)
        }
    }
}