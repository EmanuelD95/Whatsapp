package com.emanuel.whatsapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.emanuel.whatsapp.databinding.ItemContactBinding

class ContactViewHolder(view: View):RecyclerView.ViewHolder(view){
    val binding = ItemContactBinding.bind(view)

    fun render(contact: Contact){
        binding.tvName.text = contact.name
        binding.tvMessage.text = contact.message
        binding.tvTimestamp.text = contact.timestamp
        binding.tvNumberMessage.text = contact.numberMessage.toString()

        val isVisible = contact.newMessage
        if (isVisible) {
            binding.vNewMessage.visibility = View.VISIBLE
            binding.tvNumberMessage.visibility = View.VISIBLE
        } else {
            binding.vNewMessage.visibility = View.GONE
            binding.tvNumberMessage.visibility = View.GONE

        }

        Glide
            .with(binding.ivAvatar.context)
            .load(contact.avatar)
            //.centerCrop()
            .circleCrop()
            .into(binding.ivAvatar);
    }
}
