package com.example.contacts.data.repository

import android.content.Context
import com.example.contacts.data.db.AppDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactRepository(context: Context) {
    private val db = AppDatabase.getInstance(context)

    suspend fun test() {
        return withContext(Dispatchers.IO) {

        }
    }
}