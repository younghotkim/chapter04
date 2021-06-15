package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		Integer i01 = (int)((Math.random()*45)+1);
		Integer i02 = (int)((Math.random()*45)+1);
		Integer i03 = (int)((Math.random()*45)+1);
		Integer i04 = (int)((Math.random()*45)+1);
		Integer i05 = (int)((Math.random()*45)+1);
		Integer i06 = (int)((Math.random()*45)+1);
		
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04);
		iSet.add(i05);
		iSet.add(i06);
		
		for (int num : iSet) {
			if (iSet.size()==6)
			System.out.println(num);
		}
		
		

	}

}
