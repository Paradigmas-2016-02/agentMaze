package graphics;

import java.awt.event.*;

public class Chrono implements ActionListener {
	
	MazeCanvas rc;

	Chrono(MazeCanvas rc) {
		this.rc = rc;
	}

	public void actionPerformed(ActionEvent arg0){
		rc.myRepaint();
	}
}
