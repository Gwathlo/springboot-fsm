package com.springboot.app.fsm.wrapper.states;

public class EnviatGSState extends State {

	@Override
	public boolean enCursGS() {
		return true;
	}
	
	@Override
	public boolean error() {
		return true;
	}
}
