package com.loveCoding.LinkedLists;

public class DoublyLinkedLists {

	private Node head;
	private Node tail;
	
	public boolean isEmpty(){
		return (this.tail==null && this.head==null);
	}
	
	public void addFirst(int data){
		Node newNode=new Node(data);
		if(isEmpty()) this.tail=newNode;
		else{
			this.head.setPrevious(newNode);
			newNode.setNext(head);
		}
		this.head=newNode;
	}
	
	public void addLast(int data){
		Node newNode = new Node(data);
		if(isEmpty()) this.head=newNode;
		else{
			this.tail.setNext(newNode);
			newNode.setPrevious(tail);
		}
		this.tail=newNode;
	}
	
	public boolean insertAfter(int index, int data){
		Node newNode=new Node(data);
		Node current=this.head;
		if(isEmpty()) return false;
		else if(head!=null && head.getNext()==null && index!=head.getData()) return false;
		while(current.getData()!=index){
		current=current.getNext();
		if(head.getData()==index && current!=null){
			newNode.setNext(head.getNext());
			head.getNext().setPrevious(newNode);
			newNode.setPrevious(head);
			head.setNext(newNode);
			return true;
			}else if(tail.getData()==index){
				tail.setNext(newNode);
				newNode.setPrevious(tail);
				this.tail=newNode;
				return true;
			}else if(current.getData()==index){
				newNode.setNext(current.getNext());
				current.getNext().setPrevious(newNode);
				newNode.setPrevious(current);
				current.setNext(newNode);
				return true;
			}
		}
		return false;
		
	}
	
	public Node deleteOdd(){
		if(isEmpty() || (head.getData()%2!=0 && head.getNext()==null)) return null;
	
			Node current=head;
			while(current.getNext()!=null)
			{
				if(current==head && current.getData()%2!=0){
					head=current.getNext();
					head.setPrevious(null);
					current=current.getNext();
				}else {
					if(current.getData()%2!=0 && (current!=head || current!=tail)){
						current.getNext().setPrevious(current.getPrevious());
						current.getPrevious().setNext(current.getNext());
					}
					current=current.getNext();
				}
				
			}
			if(tail!=null && tail.getData()%2!=0){
				tail=tail.getPrevious();
				tail.setNext(null);
			}
		
		
		return head;
	}
	
	public int length(){
		int count=0;
		if(isEmpty()) return 0;
		else if(head.getNext()==null) return 1;
		else{
			Node current=head;
			while(current.getNext()!=null){
				count+=1;
				current=current.getNext();
			}
			return count+1;
		}
	}
	
	public String toString(){
		String print="{";
		
		Node current=head;
		while(current!=null){
			print+=current.toString();
			current=current.getNext();
		}
		print+="}";
		return print;
				
	}
}
