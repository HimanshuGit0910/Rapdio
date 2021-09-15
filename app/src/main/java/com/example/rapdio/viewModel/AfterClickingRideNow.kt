package com.example.rapdio.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AfterClickingRideNow : ViewModel() {
    companion object {
        var ride: MutableLiveData<Int> = MutableLiveData()
    }

    fun setMapRider(distance: Int) {
        ride.value = distance
    }

    fun getMapRider(): LiveData<Int> {
        return ride
    }

}