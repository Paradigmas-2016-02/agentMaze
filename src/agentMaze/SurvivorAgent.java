package agentMaze;

import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.wrapper.AgentController;
import jade.wrapper.PlatformController;
import jade.core.AID;
import java.util.Random;

public class SurvivorAgent extends Agent {

	private AID mockup = null;
	private final int SPEED = 3;
	private boolean walking = true;
	private boolean avoiding = false;
	private int positionX;
	private int positionY;
	
	protected void setup() {
		this.mockup = new AID(getLocalName(),AID.ISLOCALNAME);
		
		addBehaviour (new CyclicBehaviour(this){

			@Override
			public void action() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	protected void takeDown() {
		
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
}
