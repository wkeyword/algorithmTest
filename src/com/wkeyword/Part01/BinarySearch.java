package com.wkeyword.Part01;
/*
 *	ʵ�ּ򵥵Ķ��ֲ��� 
 */
public class BinarySearch {
	
	public static int rank(int key,int[] a) {
		int lo=0;
		int hi=a.length-1;//��������ĳ���
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
