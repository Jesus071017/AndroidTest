package com.example.contacts.data.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey

@Entity(tableName = "contact")
data class ContactModel(
    @PrimaryKey(autoGenerate = true) val id: Long? = null
)