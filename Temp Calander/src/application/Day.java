package application;

import java.util.ArrayList;

public class Day 
{
	public int curDay;
	public ArrayList<String> toDoList;//might change this later to another object
	
	public Day()
	{
		curDay = -1;
		toDoList = new ArrayList<String>();
	}
	
	public Day(int d)
	{
		curDay = d;
		toDoList = new ArrayList<String>();
	}
	
	public void addActivity(String activity)
	{
		toDoList.add(activity);
	}
	
	public void removeActivity(String activity)
	{
		toDoList.remove(activity);
	}
	
	public int getDay()
	{
		return curDay;
	}
	
	public ArrayList<String> getToDoList()
	{
		return toDoList;
	}
	
	public void setDay(int d)
	{
		curDay = d;
	}
	
	
	public void setToDoList(ArrayList<String> list)
	{
		for(int i=0;i<list.size();i++)
		{
			toDoList.add(list.get(i));
		}
	}
	
}
