package com.springboot.app.fsm.wrapper.states;

public abstract class State {

	public boolean enCursGS() {

		System.out.println("Transacció no definida");
		return false;
	}

	public boolean finalitzar() {
		
		System.out.println("Transacció no definida");
		return false;
	}

	public boolean error() {
		
		System.out.println("Transacció no definida");
		return false;
	}

	public boolean evidencies() {
		
		System.out.println("Transacció no definida");
		return false;
	}

}
