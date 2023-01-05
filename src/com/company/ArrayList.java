package com.company;

public class ArrayList {
    private Object[] objectList = new Object[0];
    public ArrayList(){}
    public int size(){
        return objectList.length;
    }
    public void add(Object obj){
        //make obj go at end
        //create new array
        //copy all old values
        Object[] tempA = new Object[objectList.length+1];
        for(int i =0; i<objectList.length; i++){
            tempA[i] = objectList[i];
        }
        tempA[objectList.length]=obj;
        objectList = tempA;
    }
    public void add(int index, Object obj){
        assert (index==0) && (objectList==null) || objectList != null && index<=objectList.length && index>=0: "Error: add()";
        Object[] tempA = new Object[objectList.length+1];
        for(int i =0; i<index; i++){
            tempA[i] = objectList[i];
        }
        tempA[index]=obj;
        for(int i =index; i<objectList.length; i++){
            tempA[i] = objectList[i];
        }
        objectList = tempA;
    }
    public Object get(int index){
        return objectList[index];
    }
    public Object remove(int index){
        Object[] tempA = new Object[objectList.length-1];
        for(int i =0; i<index; i++){
            tempA[i] = objectList[i];
        }
        for(int i=index+1; i<objectList.length-1; i++){
            tempA[i] = objectList[i];
        }
        objectList = tempA;
        return tempA.toString();
    }
    public String toString(){
        String rv = "[";
        for(int i =0; i<objectList.length-1; i++){
            rv = rv + objectList[i] + ", ";
        }
        rv = rv + objectList[objectList.length-1] + " ]";
        return rv;
    }
}
