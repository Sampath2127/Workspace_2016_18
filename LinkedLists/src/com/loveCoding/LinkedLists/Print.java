package com.loveCoding.LinkedLists;

public class Print {

	public static void main(String[] args) {

		DoublyLinkedLists list=new DoublyLinkedLists();
		
		list.addFirst(10);
		list.addFirst(15);
		list.addLast(25);
		list.addLast(30);
		list.addFirst(55);
		list.insertAfter(25,75);
		list.insertAfter(30, 777);
		System.out.println(list.length());
		System.out.println(list.toString());
		
		Node node=list.deleteOdd();
		
		while(node!=null){
			System.out.print(node.getData()+" ");
			node=node.getNext();
		}
	}

}
