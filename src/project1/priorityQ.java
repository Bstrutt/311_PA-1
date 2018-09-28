package project1;

import java.util.ArrayList;

public class priorityQ {
	ArrayList<tuple> A = new ArrayList<tuple>(); 
	int size;
	/* Parent/Child accessability methods*/
	int parent(int i) {	return (i/2);}	
	int left(int i) { return i*2; }	
	int right(int i) { return (i*2)+1;}
	
	void swap(int x, int y) {
		tuple temp = A.get(y);
		A.set(y, A.get(x));
		A.set(x, temp);
		
	}
	
	/* Priority Q construction */
	priorityQ(){
		A.set(0, null);
		size = 0;
	}
	
	void add(tuple t){
		A.add(t);
		size++;
		//heapify
	}
	
	void heapify() {
		
	}
	
	tuple returnMax() {
		return A.get(1);
	}
	
	tuple extractMax() {
		tuple a = returnMax();
		A.remove(1);
		size--;
		//heapify
		
		return a;
	}
	void remove(int i) {
		A.remove(i);
		size--;
		//heapify
	}
	void decrementPriority(int i, int k) {	
		//int current = A.get(i).key();
		//A.get(i).changeKey( current - k);
	}
	
	ArrayList<tuple> priorityArray(){
		
		
		return null;
	}
}
