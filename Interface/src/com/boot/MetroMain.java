package com.boot;

import com.app.MetroMetroRules;
import com.impl.MetroRules;

public class MetroMain {


	public static void main(String[] args) {
		MetroRules metroRules = new MetroMetroRules();
		metroRules.announcement('F');
		metroRules.payment(14.25);
		metroRules.timings(11);
	}
}

