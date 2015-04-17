package sorting.control;

import java.util.ArrayList;

import sorting.model.Gui;
import sorting.model.Sorting;
import sorting.view.SortingFrame;

public class SortingController
{
	private SortingFrame appFrame;
	private Sorting mySorter;
	private int[] wholeNumbers;
	private double [] realNumbers;
	private String [] wordage;
	private Gui [] myTemp;
	private ArrayList<Integer> arrayList;
	
	public int[] getWholeNumbers()
	{
		return wholeNumbers;
	}

	public Gui [] getMyTemp()
	{
		return myTemp;
	}
	
	public double[] getRealNumbers()
	{
		return realNumbers;
	}


	public String[] getWordage()
	{
		return wordage;
	}

	public void setMyTemp(Gui [] myTemp)
	{
		this.myTemp = myTemp;
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

	public Sorting getMySorter()
	{
		return mySorter;
	}
	
	public ArrayList<Integer> getArrayList()
	{
		return arrayList;
	}

	public void setArrayList(ArrayList<Integer> arrayList)
	{
		this.arrayList = arrayList;
	}

	public SortingController()
	{
		mySorter = new Sorting();
		appFrame = new SortingFrame(this);
		arrayList = new ArrayList<Integer>();
	}
	

	public void start()
	{
			fillTheArrays();
			//System.out.println(getMySorter().arraySort(arrayList));
	}


	private void fillTheArrays()
	{
		randomIntArray();
		randomDoubleArray();
		stringArray();
		fillMtTempArray();
		randomArrayListArray();
		
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
		wholeNumbers = new int [20];
		for(int spot = 0; spot < wholeNumbers.length; spot++)
		{
			wholeNumbers[spot] = (int)(Math.random()* 20);
		}
	}
	
	

	private void randomArrayListArray()
	{
		wholeNumbers = new int [5000];
		for(int spot = 0; spot < wholeNumbers.length; spot++)
		{
			int myRandom = (int)(Math.random()* 55555);
			wholeNumbers[spot] = myRandom;
			arrayList.add(myRandom);
		}
	}
	
	private void stringArray()
	{
		wordage = new String []
				{
				"dsadsada",
				"ffewwfe",
				"vdve2f2q",
				"vieho2w",
				"jgp3n",
				"vnjdrbvoi3w",
				"feifneipfnp2",
				"mksdmoiwe2djmoi2",
				"dwdjwidjiwdjwijdiw",
				"dwqdwq",
				"dsadsds"
				
				};
	}
	
	private void fillMtTempArray()
	{
	    myTemp = new Gui [20];
		
		for (int row = 0; row < myTemp.length; row++)
		{
			
				if (myTemp[row] == null)
				{
					double temp = (Math.random() * 144);
					boolean isCool;
					if (temp < 32)
					{
						isCool = true;
					}
					else
					{
						isCool = false;
					}
					myTemp[row] = new Gui("Object # " + row, temp, isCool);
				}
		}
	}
}
