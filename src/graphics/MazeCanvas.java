package graphics;

import java.awt.*;
import java.awt.image.*;
import javax.swing.Timer;
import java.io.*;
import javax.imageio.*;

public class MazeCanvas extends Canvas {
	
	public MazeCanvas (){
		setIgnoreRepaint(true);
		Chrono chrono = new Chrono(this);
		new Timer(16, chrono).start();

	}
	
	public void myRepaint(){
		
		
	}
	
}
