package com.ghataa.miaconception.ui.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ghataa.miaconception.R
import com.ghataa.miaconception.databinding.FragmentMessageListBinding

class MessageListFragment : Fragment() {

    private lateinit var binding: FragmentMessageListBinding

    companion object {
        val TAG = MessageListFragment().javaClass.canonicalName
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_message_list, container, false)

        return binding.root
    }
}