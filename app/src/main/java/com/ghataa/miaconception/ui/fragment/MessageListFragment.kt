package com.ghataa.miaconception.ui.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ghataa.miaconception.R
import com.ghataa.miaconception.databinding.FragmentMessageListBinding
import com.ghataa.miaconception.model.Message
import com.ghataa.miaconception.ui.adapter.MessageAdapter
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MessageListFragment : Fragment() {

    private lateinit var binding: FragmentMessageListBinding

    companion object {
        val TAG = MessageListFragment().javaClass.canonicalName
        val DB_NODE_MESSAGES = "messages"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_message_list, container, false)

        setFirebaseDatabase()

        return binding.root
    }

    private fun setFirebaseDatabase() {
        val databaseReference = FirebaseDatabase.getInstance().getReference(DB_NODE_MESSAGES)

        databaseReference.addValueEventListener(object : ValueEventListener {

            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val messages: MutableList<Message> = mutableListOf()
                messages.clear()
                dataSnapshot.children.mapNotNullTo(messages) { it.getValue<Message>(Message::class.java) }
                messages.reverse()

                binding.messageListRecyclerView.adapter = MessageAdapter(messages)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.d(TAG, "Cancelled: " + databaseError.message)
            }
        })
    }
}
