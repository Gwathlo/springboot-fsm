package com.springboot.app.fsm.wrapper;

import com.springboot.app.fsm.wrapper.states.EnCursGSState;
import com.springboot.app.fsm.wrapper.states.EnviatGSState;
import com.springboot.app.fsm.wrapper.states.ErrorState;
import com.springboot.app.fsm.wrapper.states.FinalitzatState;
import com.springboot.app.fsm.wrapper.states.State;

public class NotificacionsGSFSM {

	// states
	private State[] states = {new EnviatGSState(), new EnCursGSState(), new FinalitzatState(), new ErrorState()};
	private enum availableStates {ENVGS, ECGS, FINA, ERRO};
	
	// transitions
    private int[][] transition = {{0,1,0,3}, {1,1,2,3}, {2,2,2,2}, {3,3,3,3}};
	
	// current state
	private int current = 0;

	
	private void next(int msg) {
        current = transition[current][msg];
    }

	public void enCursGS() {
		if(states[current].enCursGS()) {
			next(1);
		}
	}
	
	public void finalitzar() {
		if(states[current].finalitzar()) {
			next(2);
		}
	}

	public void error() {
		if(states[current].error()) {
			next(3);
		}
	}

	public void guardarEvidencies() {
		if(states[current].evidencies()) {
			next(current);
		}
	}
	
	public boolean setCurrentState(String state) {
		try {
			availableStates currentState = availableStates.valueOf(state);
			switch (currentState) {
			case ENVGS:
				current = 0;
				break;
			case ECGS:
				current = 1;
				break;
			case FINA:
				current = 2;
				break;
			case ERRO:
				current = 3;
				break;
			}
			return true;
		}catch (IllegalArgumentException e) {
			return false;
		}
	}

	

	
}
