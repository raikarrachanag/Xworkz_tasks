package com.interace3.abstraction.boot;

import com.interface3.abstraction.app.Speaker;
import com.interface3.abstraction.impl.Bluetooth;
import com.interface3.abstraction.impl.Mobile;

public class BluetoothMain {
	

		public static void main(String[] args) {
			Speaker speaker=new Mobile();
			
			Bluetooth bluetooth=new Bluetooth();
			bluetooth.setSpeaker(speaker);
			bluetooth.Sound();
			

		}

	}
