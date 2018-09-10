package com.ghataa.miaconception.util

import com.ghataa.miaconception.model.Message

class CommonUtil {

    companion object {

        val imageNumberList = mutableListOf(1081, 1067, 1076, 1057, 1043, 998, 993, 972, 961, 940, 918, 898, 882, 856)

        fun getRandomImageNumber(): Int {
            return imageNumberList[(0 until imageNumberList.size).shuffled().last()]
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

            return mutableListOf(message1, message2, message3, message4, message5, message6, message7, message8, message9)
        }
    }
}