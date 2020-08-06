package com.company;

public class SimpleHashTable {
    private StoredEmployee[] hashtable;
    public SimpleHashTable(){
        hashtable = new StoredEmployee[10];
    }
    private int hashKey(String key){
        return key.length()% hashtable.length;
    }
    public void put(String key, Employee employee){
        int hashedKey= hashKey(key);
        if(occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey==hashtable.length-1){
                hashedKey=0;
            }
            else{
                hashedKey++;
            }
            while(occupied(hashedKey) && hashedKey!=stopIndex){
                hashedKey = (hashedKey+1) % hashtable.length;
            }
        }
        if(occupied(hashedKey)){
            System.out.println("Sorry, that position is already taken at + "+hashedKey);
        }
        else{
            hashtable[hashedKey] = new StoredEmployee(key,employee);
        }
    }

    public Employee get(String key){
        int hashedKey = findKey(key);
       if(hashedKey==-1){
           return null;
       }
       else
           return hashtable[hashedKey].employee;
    }
    public void printHashtable(){
        for(int i =0; i<hashtable.length;i++){
            if(hashtable[i]==null){
                System.out.println("Empty");
            }
            else
            System.out.println("Position "+ i+ " "+hashtable[i].employee);
        }
    }
    private boolean occupied(int index){
        return hashtable[index]!=null;
    }

    public int findKey(String key){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey]!=null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        int stopIndex = hashedKey;
        if(hashedKey==hashtable.length-1){
            hashedKey=0;
        }
        else {
            hashedKey++;
        }
        while(hashedKey!=stopIndex && hashtable[hashedKey]!=null &&!hashtable[hashedKey].key.equals(key)){
            hashedKey = (hashedKey+1) % hashtable.length;
        }
        if(hashtable[hashedKey]!=null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        else
            return -1;
    }

    public Employee remove(String key){
        int hashedkey = findKey(key);
        if(hashedkey == -1){
            return null;
        }
        Employee employee = hashtable[hashedkey].employee;
        hashtable[hashedkey]=null;
        StoredEmployee[] oldHashtable = hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];
        for(int i = 0; i <oldHashtable.length; i++){
            if(oldHashtable[i]!=null){
                put(oldHashtable[i].key,oldHashtable[i].employee);
            }
        }
        return employee;
    }
}
