package com.interace3.abstraction.boot;

import com.interface3.abstraction.app.Internet;
import com.interface3.abstraction.impl.Browser;
import com.interface3.abstraction.impl.InternetImpl;

public class BrowserMain {


		public static void main(String[] args) {
			Internet internet = new InternetImpl();

			Browser browser = new Browser();
			browser.setInternet(internet);
			browser.connect();
		}

	}

