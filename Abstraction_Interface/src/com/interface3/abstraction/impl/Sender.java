package com.interface3.abstraction.impl;

import com.interface3.abstraction.app.Messenger;

public class Sender implements Messenger {

		@Override
		public void sendMsg() {
			System.out.println("Implemenation in Sender Class...");

		}

	}

