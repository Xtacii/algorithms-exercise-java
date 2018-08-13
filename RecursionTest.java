package com.project.test;

public class RecursionTest {
      public static void main(String[] args) {
//		recursion(10,"");
//    	test();
    	char[] a= {'a','b','c','h','j','k','r','s','g','d'};
    	recursion(10,a);
    	
	}
      public static String recursion(int n,String num) {
		  if(n>0) {
			recursion(n-1,num+'0');
			recursion(n-1,num+"1");
		  }else {
			  System.out.println(num);
		  }
		  return num;
      }
//      public static char[] recursion(int n,char[] num) {
//		  if(n>0) {
//			  char[] temp1=num;
//			  char[] temp2=num;
//			  for(int i=0;i<n;i++) {
//				  if(temp1[i]<91) {
//					  temp1[i]=(char)(temp1[i]+32);
//				  }
//			  }
//			  recursion(n-1,temp1);
//              for(int j=0;j<n;j++) {
//            	  if(temp2[j]>96) {
//            		  temp2[j]=(char)(temp1[j]-32);
//            	  }
//              }
//              recursion(n-1,temp2);
//		  }else {
//			  System.out.println(num);
//		  }
//		return num;
//      }
      public static char[] recursion(int n,char[] num) {
		  if(n>0) {
			  char[] temp1=num;
			  char[] temp2=num;
			  for(int i=0;i<n;i++) {
				  if(temp1[i]<91) {
					  temp1[i]=(char)(temp1[i]+32);
				  }
			  }
			  recursion(n-1,temp1);
              for(int j=0;j<n;j++) {
            	  if(temp2[j]>96) {
            		  temp2[j]=(char)(temp1[j]-32);
            	  }
              }
              recursion(n-1,temp2);
		  }else {
			  System.out.println(num);
		  }
		return num;
      }
      
      public static void test() {
    	char[] a= {'a','b','c'};
    	a[0]=(char) (a[0]+32);
    	System.out.println(a);
      }
      
      
     
}
