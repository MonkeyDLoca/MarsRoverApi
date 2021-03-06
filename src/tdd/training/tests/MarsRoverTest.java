package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tdd.training.session1.MarsRover;
import tdd.training.session1.MarsRoverException;

public class MarsRoverTest {
	
	MarsRover sonic;
	
	@Before
	public void initialize() throws MarsRoverException{
		sonic = new MarsRover(10,10,"?(2,1)(4,5)?");
	}
	
	@Test
	public void noMove() throws MarsRoverException{
		assertEquals("?(0,0,N)?", sonic.executeCommand(""));
	}

	@Test
	public void OneMoveForward() throws MarsRoverException {
		assertEquals("?(0,1,N)?", sonic.executeCommand("f"));
	}
	
	@Test
	public void TwoMoveForward() throws MarsRoverException {
		assertEquals("?(1,1,E)(2,1)?", sonic.executeCommand("frff"));
	}
	
	@Test
	public void aTourWithRover() throws MarsRoverException {
		sonic = new MarsRover(10,10,"?(3,1)(4,5)?");
		assertEquals("?(2,1,N)?", sonic.executeCommand("ffrfflbbf"));
	}
	
	@Test(expected = MarsRoverException.class)
	public void errorRover() throws MarsRoverException {
		sonic = new MarsRover(2,2,"?(3,1)(4,5)?");
		assertEquals("?(2,1,N)?", sonic.executeCommand("fffff"));
	}


}
