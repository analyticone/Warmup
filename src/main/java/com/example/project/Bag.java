package com.example.project;

public class Bag
{
    private static final int INITIAL_SIZE = 20;
	private Integer[] bag;
	private int next;

	public Bag()  
	{
		this(20); 
	}

	public Bag(int capacity)
	{
		bag = new Integer[capacity];
	}
	
	public void add(int item)
	{
		if (next == bag.length)
			changeCapacity(2*bag.length);;

		bag[next++] = item;
	}

	public int count(int item)
	{
		int itemCount = 0;
		for (int i = 0; i < next; i++)
			if (bag[i] == item)
				++itemCount;
		return itemCount;  
		
	}
	public int size()
	{
		return next+1;
	}

	public boolean contains(int item)
	{
		for (int i = 0; i < next; i++)
			if (bag[i] == item)
				return true;
		return false;
	}

	@Override
	public String toString()
	{
		String result = "Bag: "; 

		for (int i = 0; i < next; i++)
			result += bag[i] + " ";

		return result;
	}

	public void changeCapacity(int newLength)
	{
		bag = Arrays.copyOf(bag, newLength);
	}
}
