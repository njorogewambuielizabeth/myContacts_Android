package com.viewrecycles.contactsdetails

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.viewrecycles.contactsdetails.databinding.ContactlistBinding

class contactAdapter( var contactlist: List<ContactData>): RecyclerView.Adapter<ContactViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding= ContactlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ContactViewHolder(binding)
}

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var phone =contactlist[position]
        holder.binding.tvName.text=phone.name
        holder.binding.tvEmail.text=phone.email
        holder.binding.tvPhoneNumber.text=phone.phoneNumber
    }

    override fun getItemCount(): Int {
        return contactlist.size
    }
}
class ContactViewHolder(var binding: ContactlistBinding): RecyclerView.ViewHolder(binding.root){}