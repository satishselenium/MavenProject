package testCases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Snippet {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
	    System.out.println("Hello, World!");
        int a[]={2,5,3,4,6,1,4,5,12,34,34,56,2,1,1,2,3,45,67,7,8};
        sortingArray(a);
		
//		String val = "sssjkhkjghjhgjhgkjnnnngngihgihighgiohgohgohgohssrtete";
//		val = val.trim();
//		val=val.replace(" ", "");
//		char[] valchar = val.toCharArray();
//		Map<String,Integer> uniquevalue = new LinkedHashMap<String, Integer>();
//		for (int i = 0;i<=val.length()-1;i++) {
//			String tem = Character.toString(valchar[i]);
//			if(uniquevalue.containsKey(tem)) {
//				uniquevalue.replace(tem, uniquevalue.get(tem), (uniquevalue.get(tem)+1));
//				//uniquevalue.replace(Character.toString(valchar[i]), (uniquevalue.get(valchar[i])+1));
//			}else {
//				uniquevalue.put(tem, 1);
//			}
//			tem="";
//		}
//		
//		for ( String key : uniquevalue.keySet() ) {
//		    System.out.println( key+" repeated for "+uniquevalue.get(key) );
//		}
	}

//    public static void main(String args[])
//    {
//    
//    }
    private static void sortingArray(int []a){
    System.out.println("Hello, World!"+a.length);
        for(int i=0;i<a.length-1;i++){
        for(int j=0;j<a.length-1;j++){
            if(a[j]>a[j+1]){
            int temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
            }
        }
        }
                for(int i=0;i<a.length;i++){
                        System.out.println("array is"+a[i]);

                }
        
    }
	
}

