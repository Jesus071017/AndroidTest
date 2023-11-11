package com.example.contacts.ui.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.contacts.data.repository.ContactRepository
import kotlinx.coroutines.launch

class ContactViewModel(application: Application) : AndroidViewModel(application){

    private val contactRepository = ContactRepository(application)

    private val _loginResult = MutableLiveData<Boolean>()
    
    val loginResult : LiveData<Boolean>
        get() = _loginResult

    fun validateLogin(user: String, password: String) {
        viewModelScope.launch {
            val isValidLogin = contactRepository.test()

        }
    }
}