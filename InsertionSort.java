package com.project.insertionsort;

public class InsertionSort {
//   public static void insertSort(int[] num) {
//	   System.out.println("我进入了这里");
//	   for(int j=1;j<num.length;j++) {
//		   int key=num[j];
//		   int i=j-1;
//		   while(i>=0) {
//			   if(num[i]>key) {
//				   num[i+1]=num[i];
//				   num[i]=key;
//			   }
//			   i--;
//		   }
//	   }
//	   for (int i : num) {
//		System.out.println(i);
//	}
//   

  public static void insertSort(int[] num) {
	   System.out.println("我进入了这里");
	   for(int j=1;j<num.length;j++) {
		   int key=num[j];
		   int i=j-1;
		   while(i>=0) {
			   if(num[i]<key) {
				   num[i+1]=num[i];
				   num[i]=key;
			   }
			   i--;
		   }
	   }
	   for (int i : num) {
		System.out.println(i);
	}
  }
   public static void main(String[] args) {
	 int[] num= {31,41,59,26,41,58};
	 insertSort(num);
   }
}
