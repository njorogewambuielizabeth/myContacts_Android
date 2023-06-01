package com.viewrecycles.contactsdetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.viewrecycles.contactsdetails.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        var contact1=ContactData("","Elizabeth Njoroge","+254742325744","wambuinjoroge@gmail.com")
        var contact2=ContactData("","Virginia Njenga","+254721757535","viinjenga@gmail.com")
        var contact3=ContactData("","MaryAnne Njoki","+254705080519","mariekikie@gmail.com")
        var contact4=ContactData("","Vallary Buraje","+254756904329","vallaryburaje@gmail.com")
        var contact5=ContactData("","Esther Nyokabi","+254746413469","essynyoks@gmail.com")
        var contact6=ContactData("","Mary Nungari","+2540112660635","nungarimary@gmail.com")
        var contact7=ContactData("","Amelia Wambui","+254767904314","miafoi54@gmail.com")
        var contact8=ContactData("","Elizabeth Njoroge","+254742325744","wambuinjoroge@gmail.com")
        var contact9=ContactData("","Virginia Njenga","+254721757535","viinjenga@gmail.com")
        var contact10=ContactData("","MaryAnne Njoki","+254705080519","mariekikie@gmail.com")
        var contact11=ContactData("","Vallary Buraje","+254756904329","vallaryburaje@gmail.com")
        var contact12=ContactData("","Esther Nyokabi","+254746413469","essynyoks@gmail.com")
        var contact13=ContactData("","Mary Nungari","+2540112660635","nungarimary@gmail.com")
        var contact14=ContactData("","Amelia Wambui","+254767904314","miafoi54@gmail.com")

        var contactlist= listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,
        contact11,contact12,contact13,contact14)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        var contact=contactAdapter(contactlist)
        binding.rvContacts.adapter=contact
    }
}