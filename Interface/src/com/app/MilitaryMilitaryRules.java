package com.app;

import com.impl.MilitaryRules;

public class MilitaryMilitaryRules implements MilitaryRules {

		@Override
		public boolean wearUniform() {
			return true;
		}

		@Override
		public String service() {
			return "Security";
		}

		@Override
		public int unitNumber() {
			return 100;
		}

	}


