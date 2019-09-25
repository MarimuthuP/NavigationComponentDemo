package com.maram.navigationcomponentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_profile_list.*

/**
 * Created by Marimuthu on 2019-09-25.
 */
class ProfileListFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile_list,container,false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goDetails.setOnClickListener {
            //Navigation.findNavController(it).navigate(R.id.action_profileListFragment_to_myProfileDetailsFragment)
            val action = ProfileListFragmentDirections.actionProfileListFragmentToMyProfileDetailsFragment()
            action.setMyName("Yeah! Done");
            findNavController().navigate(action)
        }
    }
}
