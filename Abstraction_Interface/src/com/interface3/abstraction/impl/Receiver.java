package com.interface3.abstraction.impl;

import com.interface3.abstraction.app.Messenger;

public class Receiver {

		private Messenger messenger;
		
		public void send() {
			System.out.println("invoking method in receiver class....");
			this.messenger.sendMsg();
		}
		
		public void setMessenger(Messenger messenger) {
			this.messenger = messenger;
		}
	}

