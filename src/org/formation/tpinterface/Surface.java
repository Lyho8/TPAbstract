package org.formation.tpinterface;

public abstract class Surface implements Comparable<Surface> {
	
	public String forme = "";
	public abstract double getArea();
	
	@Override
	public int compareTo(Surface o){
		if(getArea()>o.getArea()){
			return 1;
		}
		else if(getArea()<o.getArea()){
			return -1;
		}
		return 0;
	}
}
