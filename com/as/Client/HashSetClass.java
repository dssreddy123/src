package com.as.Client;

import java.util.HashSet;
//import java.util.TreeSet;

public class HashSetClass {
public static void main(String[] args) {

HashSet stateList= new HashSet();
stateList.add("CA");
stateList.add("NJ");
stateList.add("AZ");
stateList.add("TX");
stateList.add("TX");

for (Object object : stateList) {
	System.out.println(object);
}
for(int i=0; i<stateList.size(); i++){
	System.out.println(stateList);
}

}	


}
