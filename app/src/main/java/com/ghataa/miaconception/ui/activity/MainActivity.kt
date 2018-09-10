package com.ghataa.miaconception.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ghataa.miaconception.R
import com.ghataa.miaconception.ui.fragment.MessageListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, MessageListFragment(), MessageListFragment.TAG)
                    .commit()
        }
    }
}
