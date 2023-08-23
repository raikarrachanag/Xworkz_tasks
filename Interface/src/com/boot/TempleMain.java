package com.boot;

import com.app.TempleTempleRules;
import com.impl.TempleRules;

public class TempleMain {

		public static void main(String[] args) {
			TempleRules rules = new TempleTempleRules();
			rules.openTimings(11);
			rules.NoMobile();
			rules.noSmoking();

		}

	}

