package sorting.control;

import sorting.model.Sorting;
import sorting.view.SortingFrame;

public class SortingController
{
	private SortingFrame appFrame;
	private Sorting mySorter;
	private int [] wholeNumbers;
	private double [] realNumbers;
	private String [] wordage;
	
	public int[] getWholeNumbers()
	{
		return wholeNumbers;
	}


	public double[] getRealNumbers()
	{
		return realNumbers;
	}


	public String[] getWordage()
	{
		return wordage;
	}


	public void setWholenumbers(int[] wholenumbers)
	{
		this.wholeNumbers = wholenumbers;
	}


	public void setRealNumbers(double[] realNumbers)
	{
		this.realNumbers = realNumbers;
	}


	public void setWordage(String[] wordage)
	{
		this.wordage = wordage;
	}


	public SortingController()
	{
		mySorter = new Sorting();
		appFrame = new SortingFrame(this);
	}
	

	public void start()
	{
			fillTheArrays();
			for(int spot : wholeNumbers)
			{
				System.out.print(spot + ", ");
			}
			System.out.println();
			mySorter.selectionSort(wholeNumbers);
			System.out.print(mySorter.sortingTime(mySorter.getSortTime()));
			
			for(int spot : wholeNumbers)
			{
				System.out.print(spot + ", ");
			}
	}


	private void fillTheArrays()
	{
		randomIntArray();
		randomDoubleArray();
		
	}

	private void randomDoubleArray()
	{
		realNumbers = new double[999];
		for(int spot = 0; spot < realNumbers.length; spot++)
		{
			realNumbers[spot] = Math.random()* 9000;
			if(spot% 7 > 3 && spot % 9 < 3)
				//makes numbers negative
			{
				realNumbers[spot]*= -1.000;
			}
		}
	}
	
	private void randomIntArray()
	{
		wholeNumbers = new int [999];
		for(int spot = 0; spot < wholeNumbers.length; spot++)
		{
			wholeNumbers[spot] = (int)(Math.random()* 55555);
		}
	}

}
