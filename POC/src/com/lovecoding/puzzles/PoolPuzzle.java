package com.lovecoding.puzzles;

public class PoolPuzzle {

	public static void main(String[] args) {
		
		/*
		 * Output
		 * a noise
		 * annoys
		 * an oyster
		 */
		int x=0;
		while(x<3){
			
			if(x<1){
				System.out.print("a");
				System.out.print(" ");
				System.out.print("n");
				System.out.print("oise");
				
			}
	
		if(x>1){
			System.out.print("an");
			x=x+2;
		}
		if(x==1){
			System.out.print("annoys");
			
		}
		if(x>3){
			System.out.print(" oyster");
		}
		x=x+1;
		System.out.println("");
	}
}
}
