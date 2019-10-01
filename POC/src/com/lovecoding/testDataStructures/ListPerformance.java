package com.lovecoding.testDataStructures;

import java.util.ArrayList;
import java.util.List;

public class ListPerformance {


public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	long t0=System.currentTimeMillis();
	for(int i=0; i<1e5; i++){
		list.add(i);
	}
	long t1=System.currentTimeMillis();
	System.out.println(t1-t0);
}

}

