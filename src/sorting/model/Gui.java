package sorting.model;

public class Gui implements Comparable
{
	private String name;
	private double temp;
	private boolean isCool;

	public Gui(String name, double temp, boolean isCool)
	{
		this.name = name;
		this.temp = temp;
		this.isCool = isCool;
	}

	public String getName()
	{
		return name;
	}

	public double getTemp()
	{
		return temp;
	}

	public boolean isCool()
	{
		return isCool;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setTemp(double temp)
	{
		this.temp = temp;
	}

	public void setCool(boolean cool)
	{
		this.isCool = cool;
	}

	@Override
	public String toString()
	{
		String tempInfo = "";

		tempInfo += "hi! I'm a temperature object! my name is " + name;
		tempInfo += ", it is this warm outside..." + temp;
		if (isCool)
		{
			tempInfo += ", its actually cold!";
		}
		else
		{
			tempInfo += " its considered warm!";
		}

		return tempInfo;
	}

	/**
	 * 
	 * @param comparedTemp
	 * @return
	 */
	public int compareTo(Object comparedTemp)
	{
		int compared = 0;
		if (comparedTemp instanceof Gui)
		{
			if (this.temp < ((Gui) comparedTemp).getTemp() || (!this.isCool && ((Gui) comparedTemp).isCool()))
			{
				compared = -1;
			} 
			else if (this.temp > ((Gui) comparedTemp).getTemp() || (this.isCool && !((Gui) comparedTemp).isCool()))
			{
				compared = 1;
			}
		}
		
		return compared;
	}
}
