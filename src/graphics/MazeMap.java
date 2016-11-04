package graphics;

import javax.swing.JFrame;
import agentMaze.MazeAgent;

public class MazeMap extends JFrame {

	private MazeAgent myAgent;
	private int map[][];
	
	public MazeMap(MazeAgent agent){
		myAgent = agent;
		setTitle("Raccoon City Outbreak");
		MazeCanvas canvas = new MazeCanvas();
		add(canvas);
		setSize(100,100);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.createBufferStrategy(2);
	}
	
	public void beginningMaze() {
		map = new { 1, 1,
			1, 1};
	}
}