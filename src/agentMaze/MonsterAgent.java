package agentMaze;

import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.core.AID;
import java.util.Random;

public class MonsterAgent extends Agent {

	private AID mockup = null;
	private static boolean searching = true;
	private static boolean chasing = false;
	private static boolean attacking = false;
	private int gPositionX; 
	private int gPositionY;
	private final int SPEED = 4;
	
	protected void setup() {
		this.mockup = new AID(getLocalName(),AID.ISLOCALNAME);
		
		addBehaviour (new CyclicBehaviour(this){

			@Override
			public void action() {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	private void attack(AID survivor) {
		ACLMessage hit = new ACLMessage(ACLMessage.REQUEST);
		hit.setContent("hit");
		hit.addReceiver(survivor);
		send(hit);
	}
	
	protected void takeDown() {
		
	}

	public int getgPositionX() {
		return gPositionX;
	}

	public void setgPositionX(int gPositionX) {
		this.gPositionX = gPositionX;
	}

	public int getgPositionY() {
		return gPositionY;
	}

	public void setgPositionY(int gPositionY) {
		this.gPositionY = gPositionY;
	}
}
