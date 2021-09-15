package com.example.rapdio.recyclerview

import com.example.rapdio.recyclerview.ContactTempModel

interface ContactCommunicator {
    fun onContactDelete(tempModel: ContactTempModel)
}