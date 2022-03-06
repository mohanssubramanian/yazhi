package org.yazith;
interface waterbottleinterface{
	String color ="blue";
	void fillup();
}
public class InterfaceA implements waterbottleinterface
{
	public static void main (String [] args) {
		System.out.println(color);
		InterfaceA ex = new InterfaceA();
		ex.fillup();
		
	}
public void fillup() {
	System.out.println("it is filled");
}
}

