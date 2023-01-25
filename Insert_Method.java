package Array;
public class Insert_Method {
	public static void main(String[] args) {
		  StringBuffer sb1 = new StringBuffer("value1 is ");  
          System.out.println("string1: "+sb1);  
       // inserting boolean argument  
          sb1.insert(10,true);  
          // print the StringBuffer after inserting  
          System.out.println("after insert: " + sb1);  
  
          StringBuffer sb2 = new StringBuffer("two is greater then one? ");  
          System.out.println("string2: " + sb2);  
            
          // inserting boolean argument      
          sb2.insert(sb2.length(),false);  
            
          // print the string buffer after inserting  
          System.out.println("after insert: " + sb2);  
	}
}
