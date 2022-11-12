package com.emanuel.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.emanuel.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupContact()
    }
    private fun setupContact() {
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        binding.rvContact.adapter = ContactAdapter(ContactProvider.contactList)
    }
}