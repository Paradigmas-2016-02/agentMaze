package agentMaze;

import graphics.*;
import jade.core.Agent;

import java.util.Vector;

import javax.swing.*;

import jade.wrapper.AgentController;
import jade.wrapper.PlatformController;

public class MazeAgent extends Agent {
	public static Vector horde = new Vector();
	public static Vector hordeS = new Vector();
	public static Vector potentialVictims = new Vector();
	public static Vector potentialVictimsS = new Vector();
	protected JFrame m_frame = null;
	
	protected void setup() {
		SetupUI();
		PlatformController container = getContainerController();
		for (int i = 0; i < 10; i++){
			String localName = "Monster_" + i;
			try {
				AgentController monster = container.createNewAgent(localName, "agentMaze", null);
				monster.start();
			} catch (Exception e){
				System.out.println("Error while turning into monster: " + e);
				e.printStackTrace();
			}
		}
	}
	
	public MazeAgent getThis(){
		return this;
	}
	
	private void SetupUI() {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new MazeMap(getThis());
			}
		});
	}
}