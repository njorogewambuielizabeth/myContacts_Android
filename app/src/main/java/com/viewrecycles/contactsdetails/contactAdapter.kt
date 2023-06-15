package com.viewrecycles.contactsdetails

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.viewrecycles.contactsdetails.databinding.ContactlistBinding

class contactAdapter( var contactlist: List<ContactData>): RecyclerView.Adapter<ContactViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding= ContactlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ContactViewHolder(binding)
}

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var phone =contactlist[position]
        var binding=holder.binding
        binding.tvName.text=phone.name
        binding.tvEmail.text=phone.email
        binding.tvPhoneNumber.text=phone.phoneNumber
        Picasso
            .get()
            .load(phone.avatar)
            .resize(60,60)

            .into(binding.ivAvatar)

    }

    override fun getItemCount(): Int {
        return contactlist.size
    }
}
class ContactViewHolder(var binding: ContactlistBinding): RecyclerView.ViewHolder(binding.root){}