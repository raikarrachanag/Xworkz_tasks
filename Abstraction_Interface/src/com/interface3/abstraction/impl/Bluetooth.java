package com.interface3.abstraction.impl;

import com.interface3.abstraction.app.Speaker;

public class Bluetooth {
	
		private Speaker speaker;
		
		public void Sound() {
			System.out.println("Calling method method in Bluetooth Class.....");
			this.speaker.Sound();
		}
		
		public void setSpeaker(Speaker speaker) {
			this.speaker = speaker;
		}
	}

