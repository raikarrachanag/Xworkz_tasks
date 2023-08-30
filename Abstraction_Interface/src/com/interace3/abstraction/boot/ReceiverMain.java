package com.interace3.abstraction.boot;

import com.interface3.abstraction.app.Messenger;
import com.interface3.abstraction.impl.Receiver;
import com.interface3.abstraction.impl.Sender;

public class ReceiverMain {


		public static void main(String[] args) {
			Messenger messenger=new Sender();
			
			Receiver receiver=new Receiver();
			receiver.setMessenger(messenger);
			receiver.send();

		}

}
