package com.springboot.app.fsm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootFsmApplicationTests {

	private int[][] transition = {{2,1,0}, {0,2,1}, {1,2,2}};
	
	enum availableStates {ENVGS, ECGS, FINA};
 
	@Test
	void contextLoads() {
	}

	@Test
	void transitions() {
		System.out.println(transition[0][3]);
		System.out.println(transition[1][2]);
		System.out.println(transition[1][0]);
	}
	
	@Test
	void state() {
		availableStates.valueOf("PACC");
	}
	
}
