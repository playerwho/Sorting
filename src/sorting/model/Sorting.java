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
		timeToSort += "Days: " + sortTime/(1000*60*24) + "\n";
		timeToSort += "Hours: " + sortTime/(1000*60*60) % 24 + "\n";
		timeToSort += "Minutes: " + sortTime/(1000*60) % 60 + "\n";
		timeToSort += "Seconds: " + sortTime/(1000) % 60 + "\n";
		timeToSort += "miliseconds: " + sortTime % 1000 + "\n";
		
		return timeToSort;
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
	
	private void swap(int[] array, int position, int change)
	{
		int temp = array[position];
		array[position] = array[change];
	    array[change] = temp;
	}
}
