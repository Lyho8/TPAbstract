package org.formation.tpinterface;

import java.util.*;

public class AreaCalculator {
	
	public static double sumArea(ArrayList<Surface> t){
		double res = 0.0;
		for(Surface s : t){
			res+=s.getArea();
		}
		return res;
	}
	
	public static List<Surface> orderSurface(Surface... surfaces){
		List<Surface> list = Arrays.asList(surfaces);
		Collections.sort(list, Collections.reverseOrder());
		return list;
	}
	
}
