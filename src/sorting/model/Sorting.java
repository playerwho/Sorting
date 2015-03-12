package sorting.model;

public class Sorting
{
	private long startTime;
	private long endTime;
	private long sortTime;
	
	public long getSortTime()
	{
		return sortTime;
	}
	
	public String sortingTime(long sortTime)
	{
		String timeToSort = "";
		timeToSort += "\n" + "Days: " + sortTime/(1000*60*24) + "\n";
		timeToSort += "Hours: " + sortTime/(1000*60*60) % 24 + "\n";
		timeToSort += "Minutes: " + sortTime/(1000*60) % 60 + "\n";
		timeToSort += "Seconds: " + sortTime/(1000) % 60 + "\n";
		timeToSort += "miliseconds: " + sortTime % 1000 + "\n";
		
		return timeToSort;
	}
	
	public Gui[] guiSelectionSort(Gui[] unsortedThings)
	{
		
		Gui maximum;
		int maximumPosition;
		startTime = System.currentTimeMillis();
		
		for(int position = 0; position < unsortedThings.length; position++)
		{
			maximumPosition = position;
			maximum = unsortedThings[position];
			for(int next = position +1; next < unsortedThings.length; next++)
			{
				if(unsortedThings[next].compareTo(maximum) > 0)
				{
					maximum = unsortedThings[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				guiSwap(unsortedThings, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
				
		return unsortedThings;
				
	}
	
	public int[] selectionSort(int[] toBeSorted)
	{
		int minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();
		
		for(int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];
			
			for(int next = position +1;next < toBeSorted.length; next++)
			{
				if(toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if(minimum != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		
		return toBeSorted;
	}
	
	public double[] doubleSelectionSort(double[] toBeSorted)
	{
		double minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();
		
		for(int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];
			
			for(int next = position +1;next < toBeSorted.length; next++)
			{
				if(toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if(minimum != position)
			{
				doubleSwap(toBeSorted, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		
		return toBeSorted;
	}
	
	public String[] stringSelectionSort(String[] toBeSorted)
	{
		String minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();
		
		for(int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];
			
			for(int next = position +1;next < toBeSorted.length; next++)
			{
				if(toBeSorted[next].compareTo(minimum) < 0)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if(minimumPosition != position)
			{
				stringSwap(toBeSorted, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		
		return toBeSorted;
	}
	private void guiSwap(Gui[] array, int position, int change)
	{
		Gui dsds = array[position];
		array[position] = array[change];
	    array[change] = dsds;
	}
	
	private void stringSwap(String[] array, int position, int change)
	{
		String temp = array[position];
		array[position] = array[change];
	    array[change] = temp;
	}
	
	private void doubleSwap(double[] array, int position, int change)
	{
		double temp = array[position];
		array[position] = array[change];
	    array[change] = temp;
	}
	
	private void swap(int[] array, int position, int change)
	{
		int temp = array[position];
		array[position] = array[change];
	    array[change] = temp;
	}
}
