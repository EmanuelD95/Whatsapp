package com.emanuel.whatsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.emanuel.whatsapp.Contact
import com.emanuel.whatsapp.ContactViewHolder
import com.emanuel.whatsapp.R

class ContactAdapter(private val contactList: List<Contact>): RecyclerView.Adapter<ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ContactViewHolder(layoutInflater.inflate(R.layout.item_contact, parent, false))
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val item = contactList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}