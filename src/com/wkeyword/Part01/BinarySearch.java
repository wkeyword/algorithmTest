package com.wkeyword.Part01;
/*
 *	实现简单的二分查找 
 */
public class BinarySearch {
	
	public static int rank(int key,int[] a) {
		int lo=0;
		int hi=a.length-1;//计算数组的长度
		while (lo <= hi) {
			int mid=lo + (hi-lo)/2;
			if (key < a[mid]) {
				hi=mid-1;
			}else if (key >a[mid]) {
				lo=mid+1;
			}else {
				return mid;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args){
		System.out.println("hello");
		
	}
}
