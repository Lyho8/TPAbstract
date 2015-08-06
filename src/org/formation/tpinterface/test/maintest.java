package org.formation.tpinterface.test;

import java.util.*;

import org.formation.tpinterface.*;

public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Surface> t = new ArrayList<Surface>();
		t.add(new Circle(5));
		t.add(new Square(2));
		t.add(new Rectangle(3,4));
		
		((Circle) t.get(0)).printMe("Bonjour");
		System.out.println("Somme des surfaces : " + org.formation.tpinterface.AreaCalculator.sumArea(t) + " cm².");
		
		//Plante : on ne modifie pas une liste pendant qu'on la parcourt à moins d'utiliser un itérateur
		/*for(Surface s : t){
			if(s.getArea() > 10.0){
				System.out.println("Avant : " + t.size());
				t.remove(s);
				System.out.println("Après : " + t.size());
			}
		}*/
		
		//List<Surface> l = new ArrayList<>(Arrays.asList(tableau de surfaces));
		
		for(Iterator<Surface> iterator = t.iterator(); iterator.hasNext();){
			Surface s = iterator.next();
			if(s.getArea() > 10.0){
				System.out.println("Avant : " + t.size());
				iterator.remove();
				System.out.println("Après : " + t.size());
			}
		}
		
		System.out.println("\n\n");
		
		List<Surface> l = org.formation.tpinterface.AreaCalculator.orderSurface(new Circle(5.0), new Square(10.0), new Rectangle(2.0,4.0));
		for(Surface s : l){
			System.out.println(s.forme + ", surface de " + s.getArea() + " cm².");
		}
	}

}
