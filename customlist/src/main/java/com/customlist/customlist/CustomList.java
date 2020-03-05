package com.customlist.customlist;

public class CustomList<object> {
	
	private  int SIZE=5,index,size;
	private Object list[];
	
	public CustomList(){
		this.list=new Object[SIZE];
		this.size=SIZE;
	}
	
	public int size() {
		return this.index;
	}
	
	public void add(object obj){
		if(this.index==this.size-1){
			increaseSize();
		}
		list[this.index]=obj;
		this.index++;
	}
	
	private void increaseSize() {
		this.size=this.size+SIZE;
		Object newList[]=new Object[this.size];
		for(int i=0; i<list.length;i++){
			newList[i]=list[i];
		}
		this.list=newList;
	}
	
	public object get(int i) throws Exception{
		if(i>=0 && i<this.index)
			return (object)list[i];
		else if(i>=this.index){
			throw new Exception("ArrayIndexOutOfBound");
		}
		else{
			throw new Exception("Negative Value");
		}		
	}
	
	public void remove(int i) throws Exception{
		if(i>=this.index){
			throw new Exception("ArrayIndexOutOfBound");
		}
		if(i<0){
			throw new Exception("Negative Value");
		}
		for(int k=i; k<this.list.length-1;k++){
			list[k]=list[k+1];
		}
		this.index--;
	}
}
