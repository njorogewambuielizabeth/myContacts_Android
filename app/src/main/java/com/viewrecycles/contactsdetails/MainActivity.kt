package com.viewrecycles.contactsdetails

import android.content.Intent
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
        binding.tvAddConctact.setOnClickListener{
            AddContacts()
        }
    }
    override fun onResume() {
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        var contact1=ContactData("https://media.istockphoto.com/id/1386479313/photo/happy-millennial-afro-american-business-woman-posing-isolated-on-white.webp?b=1&s=170667a&w=0&k=20&c=ahypUC_KTc95VOsBkzLFZiCQ0VJwewfrSV43BOrLETM=","Elizabeth Njoroge","+254742325744","wambuinjoroge@gmail.com")
        var contact2=ContactData("https://media.istockphoto.com/id/1437816897/photo/business-woman-manager-or-human-resources-portrait-for-career-success-company-we-are-hiring.webp?b=1&s=170667a&w=0&k=20&c=YQ_j83pg9fB-HWOd1Qur3_kBmG_ot_hZty8pvoFkr6A=","Virginia Njenga","+254721757535","viinjenga@gmail.com")
        var contact3=ContactData("https://media.istockphoto.com/id/1208585275/photo/profile-of-a-serene-young-woman.webp?b=1&s=170667a&w=0&k=20&c=b0YisufDREAYdpfFBhuBHFkohw58QW-CpCIUX4LsGmY=","MaryAnne Njoki","+254705080519","mariekikie@gmail.com")
        var contact4=ContactData("https://images.unsplash.com/photo-1533973427779-4b8c2eb4c3cd?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8cHJvZmlsZSUyMHBob3RvJTIwZm9yJTIwYmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Vallary Buraje","+254756904329","vallaryburaje@gmail.com")
        var contact5=ContactData("https://images.unsplash.com/photo-1541216970279-affbfdd55aa8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fHByb2ZpbGUlMjBwaG90byUyMGZvciUyMGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Esther Nyokabi","+254746413469","essynyoks@gmail.com")
        var contact6=ContactData("https://images.unsplash.com/photo-1544005313-94ddf0286df2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaG90b3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Mary Nungari","+2540112660635","nungarimary@gmail.com")
        var contact7=ContactData("https://media.istockphoto.com/id/1391365592/photo/beautiful-afro-woman.jpg?s=612x612&w=0&k=20&c=o4M2f5nPzpU3ipnjK6jZF6xRNCFem_kz51IcRFGZ6qs=","Amelia Wambui","+254767904314","miafoi54@gmail.com")
        var contact8=ContactData("https://media.istockphoto.com/id/1317804578/photo/one-businesswoman-headshot-smiling-at-the-camera.jpg?s=612x612&w=0&k=20&c=EqR2Lffp4tkIYzpqYh8aYIPRr-gmZliRHRxcQC5yylY=","Elizabeth Njoroge","+254742325744","wambuinjoroge@gmail.com")
        var contact9=ContactData("https://media.istockphoto.com/id/1305462732/photo/headshot-studio-portrait-of-a-woman-in-profile-looking-at-the-camera.jpg?s=612x612&w=0&k=20&c=T0R-pAmJJpErWc8hE0jSJnmptUFQ5MvtPX7NPJJln9s=","Virginia Njenga","+254721757535","viinjenga@gmail.com")
        var contact10=ContactData("https://media.istockphoto.com/id/1465454175/photo/portrait-of-beautiful-black-millennial-entrepreneur-woman-with-an-afro-hairstyle-and-looking.jpg?s=612x612&w=0&k=20&c=jtvDUfJGhxlT6S5vCgdhe7NNeOfCM4n4rmjvUuZGfWk=","MaryAnne Njoki","+254705080519","mariekikie@gmail.com")
        var contact11=ContactData("https://media.istockphoto.com/id/1430990251/photo/young-woman-on-a-pink-background.jpg?s=612x612&w=0&k=20&c=xwshRrgNIIY5D8LtFoL98R09w2L-JO5w2kF4uSRPcTI=","Vallary Buraje","+254756904329","vallaryburaje@gmail.com")
        var contact12=ContactData("https://media.istockphoto.com/id/1395567847/photo/girl-in-an-oversized-hoodie-wearing-wireless-headphones-face-in-profile-neon-pink-and-blue.jpg?s=612x612&w=0&k=20&c=cagKxGtgvCjAf9X3aLMR8ddeaiGlw6Je28htzSoNR0A=","Esther Nyokabi","+254746413469","essynyoks@gmail.com")
        var contact13=ContactData("https://media.istockphoto.com/id/938709362/photo/portrait-of-a-girl.jpg?s=612x612&w=0&k=20&c=UQGXpeiLrI78nO1B9peUn0D0fCSRrm-J8xohMWG2Lms=","Mary Nungari","+2540112660635","nungarimary@gmail.com")
        var contact14=ContactData("https://media.istockphoto.com/id/1399788030/photo/portrait-of-young-confident-indian-woman-pose-on-background.jpg?s=612x612&w=0&k=20&c=aQw5YhGl99hL1O77thwpQTmqVE7bc8rCX9H0gTeoX_k=","Amelia Wambui","+254767904314","miafoi54@gmail.com")

        var contactlist= listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,
        contact11,contact12,contact13,contact14)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        var contact=contactAdapter(contactlist)
        binding.rvContacts.adapter=contact
    }
    fun  openMainActivity2(){
        val intent= Intent(this,AddContacts::class.java)
//        val intent= Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
}