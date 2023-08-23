package com.app;

import com.impl.EngineeringRules;

public class EngineerEngineerRules implements EngineeringRules {

	@Override
	public void engineeringBranch(String name) {
    System.out.println("invoking branch in engineeringRule");
	}

	@Override
	public int classTime(int time) {
    System.out.println("invoking time in engineeringRule");
		return time;
	}

	@Override
	public boolean attiendance(boolean present) {
    System.out.println("invoking attiedance in engineeringRule");
		return true;
	}

}
