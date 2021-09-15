package com.example.rapdio.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rapdio.viewModel.AfterClickingRideNow

class RidesViewModel : ViewModel() {

    companion object {
        var ride: MutableLiveData<Int> = MutableLiveData()
    }

    fun openRiderFragment(distance: Int) {
        AfterClickingRideNow.ride.value = distance
    }

    fun setRiderFragment(): LiveData<Int> {
        return AfterClickingRideNow.ride
    }
}