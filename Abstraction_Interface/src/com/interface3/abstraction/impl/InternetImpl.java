package com.interface3.abstraction.impl;

import com.interface3.abstraction.app.Internet;

public class InternetImpl implements Internet {
		@Override
		public void connect() {
			System.out.println("Calling connect in Internetimple Class...");
			
		}
	}
