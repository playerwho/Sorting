package sorting.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import sorting.control.SortingController;
import sorting.model.Gui;
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
	
	private JButton stringSort;
	
	private JButton ObjectSort;
	
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
		ObjectSort = new JButton("Sort Objects!");
		searchButton = new JButton("Double Sort");
		stringSort = new JButton("Sort Strings");
		inputField = new JTextField(20);
		baseLayout = new SpringLayout();
		
		
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
		this.add(stringSort);
		this.add(ObjectSort);
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
		baseLayout.putConstraint(SpringLayout.NORTH, searchButton, 14, SpringLayout.NORTH, sortButton);
		baseLayout.putConstraint(SpringLayout.WEST, searchButton, 6, SpringLayout.EAST, sortButton);
		baseLayout.putConstraint(SpringLayout.EAST, searchButton, 306, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, stringSort, 14, SpringLayout.NORTH, sortButton);
		baseLayout.putConstraint(SpringLayout.WEST, stringSort, 67, SpringLayout.EAST, searchButton);
		baseLayout.putConstraint(SpringLayout.EAST, ObjectSort, -284, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, ObjectSort, -57, SpringLayout.NORTH, textPane);
	}
	
	/**
	 * listens for a button click
	 */
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String rawArray = "";
				for(int number : baseController.getWholeNumbers())
				{
					rawArray += number + ", ";
				}
				baseController.getMySorter().selectionSort(baseController.getWholeNumbers());
				rawArray += baseController.getMySorter().sortingTime(baseController.getMySorter().getSortTime());
				for(int number : baseController.getWholeNumbers())
				{
					rawArray += number + ", ";
				}
				displayArea.setText(rawArray);	
			}
		});
		
		searchButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String rawArray = "";
				for(double number : baseController.getRealNumbers())
				{
					rawArray += number + ", ";
				}
				baseController.getMySorter().doubleSelectionSort(baseController.getRealNumbers());
				rawArray += baseController.getMySorter().sortingTime(baseController.getMySorter().getSortTime());
				for(double number : baseController.getRealNumbers())
				{
					rawArray += number + ", ";
				}
				displayArea.setText(rawArray);	
			}
		});
		
		stringSort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String rawArray = "";
				for(String number : baseController.getWordage())
				{
					rawArray += number + ", ";
				}
				baseController.getMySorter().stringSelectionSort(baseController.getWordage());
				rawArray += baseController.getMySorter().sortingTime(baseController.getMySorter().getSortTime());
				for(String number : baseController.getWordage())
				{
					rawArray += number + ", ";
				}
				displayArea.setText(rawArray);	
			}

		});
		
		ObjectSort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String rawArray = "";
				for(Gui number : baseController.getMyTemp())
				{
					rawArray += number + ", ";
				}
				baseController.getMySorter().guiSelectionSort(baseController.getMyTemp());
				rawArray += baseController.getMySorter().sortingTime(baseController.getMySorter().getSortTime());
				for(Gui number : baseController.getMyTemp())
				{
					rawArray += number + ", ";
					rawArray += "\n";
					rawArray += "\n";
				}
				displayArea.setText(rawArray);	
			}

		});
	}
	
	
}
