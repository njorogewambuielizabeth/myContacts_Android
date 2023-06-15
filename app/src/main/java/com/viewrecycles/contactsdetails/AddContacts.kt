package com.viewrecycles.contactsdetails


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.viewrecycles.contactsdetails.databinding.ActivityAddContactsBinding

class AddContacts : AppCompatActivity() {
    private lateinit var binding: ActivityAddContactsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
    override fun onResume() {
        super.onResume()
        validateAddContact()
    }

    private fun validateAddContact() {
        val firstName = binding.etFast.text.toString()
        val lastName = binding.etLast.text.toString()
        val phoneNumber = binding.etNumber.text.toString()
        val email = binding.etEmail.text.toString()
        var error = false

        if (firstName.isEmpty()) {
            binding.tillFast.error = "First Name required"
            error = true
        }

        if (lastName.isEmpty()) {
            binding.tillLast.error = "Last Name required"
            error = true
        }

        if (phoneNumber.isEmpty()) {
            binding.tillNumber.error = "Phone Number required"
            error = true
        }

        if (email.isEmpty()) {
            binding.tillEmail.error = "Email required"
            error = true
        }

        if (!error) {
            // TODO: Save the contact to the local database or perform desired action
            Toast.makeText(this, "Contact added successfully", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
