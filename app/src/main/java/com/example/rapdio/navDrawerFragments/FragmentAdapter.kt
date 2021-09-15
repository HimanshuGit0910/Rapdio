package com.example.rapdio.navDrawerFragments

import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.rapdio.navDrawerFragments.FragmentA
import com.example.rapdio.navDrawerFragments.FragmentB
import com.example.rapdio.navDrawerFragments.MyRidesFragment


class FragmentAdapter(fragmentActivity: MyRidesFragment?,val name:String) :
    FragmentStateAdapter(fragmentActivity!!) {
    /**
     * This method is called when the user swipes the screen horizontally
     *
     * @param position position of the screen user wants to see
     * @return returns a fragment based on the position
     */


    /**
     * Total number of fragments to be seen in the view pager class
     */
    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return FragmentA.newInstance(name)
            1 -> return FragmentB.newInstance("This is second Fragment")

        }
        return FragmentA.newInstance("This is Default Fragment")
    }

    override fun getItemCount(): Int {
        return 2
    }
}