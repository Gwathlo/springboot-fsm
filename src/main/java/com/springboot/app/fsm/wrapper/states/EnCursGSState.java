package com.springboot.app.fsm.wrapper.states;

public class EnCursGSState extends State {

	@Override
	public boolean finalitzar() {
		return true;
	}
	
	@Override
	public boolean error() {
		return true;
	}
}
