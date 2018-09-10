package com.ghataa.miaconception.ui.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ghataa.miaconception.R
import com.ghataa.miaconception.databinding.FragmentMessageListBinding
import com.ghataa.miaconception.model.Message
import com.ghataa.miaconception.ui.adapter.MessageAdapter

class MessageListFragment : Fragment() {

    private lateinit var binding: FragmentMessageListBinding

    companion object {
        val TAG = MessageListFragment().javaClass.canonicalName
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_message_list, container, false)

        binding.messageListRecyclerView.adapter = MessageAdapter(getMessageList())

        return binding.root
    }

    fun getMessageList(): List<Message> {
        val message1 = Message("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris neque tortor, porttitor ac posuere sed, dapibus nec tellus. Praesent aliquet elit consectetur a")
        val message2 = Message("Aliquam non dignissim purus, quis interdum fel")
        val message3 = Message("Ut non sollicitudin eros. Phasellus turpis nisi, laoreet et neque at, viverra dictum arcu.")
        val message4 = Message("Nulla varius lacus sit amet ante vehicula, sed scelerisque nisi sollicitudin. Suspendisse potenti. In commodo enim et finibus posuere. Aliquam efficitur venenatis justo, vel condimentum sapien volutpat quis. Proin a augue mollis, consectetur erat vitae, lacinia nibh. Duis semper nulla urna, ut malesuada velit aliquet id. Nulla imperdiet luctus dignissim.")
        val message5 = Message("Mauris odio nisi, commodo sed maximus nec, egestas non justo. Nunc vel purus molestie, pellentesque ante in, aliquam ligula. Aenean sed lacus fringilla, mollis nulla tristique, blandit est. Cras non volutpat metus, eget vulputate turpis. Pellentesque mollis fringilla velit, eu scelerisque eros fringilla a.")
        val message6 = Message("nc, scelerisque ultrices accumsan sed, egestas eget risus. Cras lorem lorem, aliquet ut mattis vel, sagittis ut ipsum. Proin posuere, ligula in pretium posuere, en")
        val message7 = Message("Ut non sollicitudin eros. Phasellus turpis nisi, laoreet et neque at, viverra dictum arcu.")
        val message8 = Message("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris neque tortor, porttitor ac posuere sed, dapibus nec tellus. Praesent aliquet elit consectetur a")
        val message9 = Message("Ut non sollicitudin eros. Phasellus turpis nisi, laoreet et neque at, viverra dictum arcu.")
        return mutableListOf<Message>(message1, message2, message3, message4, message5, message6, message7, message8, message9)
    }
}