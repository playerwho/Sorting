package sorting.view;

import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import sorting.control.SortingController;

/**
 * GUI Frame class for Chatbot, Shows basic framework code for a JFrame extension
 * @author Austin Widmeier
 * @version 1.1
 */
public class SortingFrame extends JFrame
{
	/**
	 * connects ChatbotPanel to basePanel
	 */
	private SortingPanel basePanel;
	
	/**
	 * connects ChatbotFrame to baseController
	 * @param baseController - basePanel is an object of ChatbotPanel 
	 */
	public SortingFrame(SortingController baseController)
	{
		basePanel = new SortingPanel(baseController);
		
		setupFrame();
	}

	/**
	 * sets up the frame of the panel
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(700, 400);
		setVisible(true);
	}
}
