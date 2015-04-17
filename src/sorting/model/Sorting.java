package sorting.model;

import java.util.ArrayList;

public class Sorting
{
	private long startTime;
	private long endTime;
	private long sortTime;

	public long getSortTime()
	{
		return sortTime;
	}

	public ArrayList<Integer> arraySort(ArrayList<Integer> sortedList)
	{

		int minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();

		for (int position = 0; position < sortedList.size(); position++)
		{
			minimumPosition = position;
			minimum = sortedList.get(position);

			for (int next = position + 1; next < sortedList.size(); next++)
			{
				if (sortedList.get(next) < minimum)
				{
					minimum = sortedList.get(next);
					minimumPosition = next;
				}
			}
			if (minimum != position)
			{
				arraySwap(sortedList, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;

		return sortedList;

	}

	public void quickSort(int[] sorting, int low, int high)
	{
		if (low < high)
		{
			int p = partitions(sorting, low, high);
			quickSort(sorting, low, p - 1);
			quickSort(sorting, p + 1, high);
		}
	}

	public int partitions(int[] sorting, int low, int high)
	{
		int pivotIndex = choosePivot(sorting, low, high);
		int pivotValue = sorting[pivotIndex];

		swap(sorting, pivotIndex, high);
		int storedIndex = low;

		for (int position = low; position <= high - 1; position++)
		{
			if (sorting[position] < pivotValue)
			{

				swap(sorting, position, storedIndex);
				storedIndex++;
			}
		}
		swap(sorting, storedIndex, high);
		return pivotIndex;
	}

	public int choosePivot(int[] sorting, int low, int high)
	{
		int pivot = low + (high - low) / 2;
		return pivot;
	}

	public String sortingTime(long sortTime)
	{
		String timeToSort = "";
		timeToSort += "\n" + "Days: " + sortTime / (1000 * 60 * 24) + "\n";
		timeToSort += "Hours: " + sortTime / (1000 * 60 * 60) % 24 + "\n";
		timeToSort += "Minutes: " + sortTime / (1000 * 60) % 60 + "\n";
		timeToSort += "Seconds: " + sortTime / (1000) % 60 + "\n";
		timeToSort += "miliseconds: " + sortTime % 1000 + "\n";

		return timeToSort;
	}

	public Gui[] guiSelectionSort(Gui[] unsortedThings)
	{

		Gui maximum;
		int maximumPosition;
		startTime = System.currentTimeMillis();

		for (int position = 0; position < unsortedThings.length; position++)
		{
			maximumPosition = position;
			maximum = unsortedThings[position];
			for (int next = position + 1; next < unsortedThings.length; next++)
			{
				if (unsortedThings[next].compareTo(maximum) > 0)
				{
					maximum = unsortedThings[next];
					maximumPosition = next;
				}
			}
			if (maximumPosition != position)
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

		for (int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];

			for (int next = position + 1; next < toBeSorted.length; next++)
			{
				if (toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if (minimum != position)
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

		for (int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];

			for (int next = position + 1; next < toBeSorted.length; next++)
			{
				if (toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if (minimum != position)
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

		for (int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];

			for (int next = position + 1; next < toBeSorted.length; next++)
			{
				if (toBeSorted[next].compareTo(minimum) < 0)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if (minimumPosition != position)
			{
				stringSwap(toBeSorted, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;

		return toBeSorted;
	}

	private void arraySwap(ArrayList<Integer> sortedList, int position, int change)
	{
		int temp = sortedList.get(position);
		sortedList.set(position, sortedList.get(change));
		sortedList.set(change, temp);
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
