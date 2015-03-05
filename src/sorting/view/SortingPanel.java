package sorting.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import sorting.control.SortingController;
import sorting.control.SortingController;
import sorting.view.SortingFrame;

public class SortingPanel extends JPanel
{
	
	/**
	 * connects app controller to base controller
	 */
	private SortingController baseController;
	
	/**
	 * adds a button to the panel
	 */
	private JButton sortButton;
	
	private JButton searchButton; 
	
	/**
	 * adds a text field to the panel
	 */
	private JTextField inputField;
	
	/**
	 * changes layout of the panel
	 */
	private SpringLayout baseLayout;
	
	/**
	 * adds scroll bars to the chatPane
	 */
	private JScrollPane textPane;
	
	/**
	 * declares the chatArea
	 */
	private JTextArea displayArea;
	
	
	/**
	 * connects chatbot panel to base controller
	 * @param baseController on the panel is the same as baseController on the appController
	 */
	public SortingPanel(SortingController baseController)
	{
		this.baseController = baseController;
		
		sortButton = new JButton("Sort");
		searchButton = new JButton("Search");
		inputField = new JTextField(20);
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, searchButton, 14, SpringLayout.NORTH, sortButton);
		baseLayout.putConstraint(SpringLayout.WEST, searchButton, 6, SpringLayout.EAST, sortButton);
		baseLayout.putConstraint(SpringLayout.EAST, searchButton, 306, SpringLayout.WEST, this);
		displayArea = new JTextArea(15,35);
		textPane = new JScrollPane(displayArea);
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * sets up window pane
	 */
	private void setupPane()
	{
		displayArea.setLineWrap(true);
		displayArea.setWrapStyleWord(true);
		displayArea.setEditable(false);
		displayArea.setBackground(Color.BLACK);
		displayArea.setForeground(Color.WHITE);
	}
	
	/**
	 * sets up the panel view
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.YELLOW);
		this.add(textPane);
		this.setSize(700, 400);
		this.add(sortButton);
		this.add(searchButton);
		this.add(inputField);
		inputField.setBackground(Color.RED);
			
	}
	
	/**
	 * sets up the layout view
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 150, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textPane, -100, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 270, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, sortButton, 41, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, sortButton, -500, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sortButton, -61, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sortButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 98, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 0, SpringLayout.WEST, sortButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, 168, SpringLayout.NORTH, this);
	}
	
	/**
	 * listens for a button click
	 */
	private void setupListeners()
	{
		
	}
	
	
}
