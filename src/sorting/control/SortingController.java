package sorting.control;

import sorting.view.SortingFrame;

public class SortingController
{
	private SortingFrame appFrame;
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
		this.wholenumbers = wholenumbers;
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
		appFrame = new SortingFrame(this);
	}
	

	public void start()
	{
			fillTheArrays();
	}


	private void fillTheArrays()
	{
		randomIntArray();
		
	}

	private void randomDoubleArray()
	{
		realNumbers = new double[5];
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
		wholeNumbers = new int [58];
		for(int spot = 0; spot < wholeNumbers.length; spot++)
		{
			wholeNumbers[spot] = (int)(Math.random()* 55555);
		}
		
		
	}

}
