package com.g3;

import java.util.*;
/**
 * 	��ʮ��ѡ�����㷨
 * @author Administrator
 *
 */
public class RandomNum {

	/**
	 * 
	 * @param startNum ��ʼ��Χ
	 * @param stopNum ������Χ
	 * @param rangeNum ���ɵ����������
	 * @return
	 */
	public static int[] rand(int startNum,int stopNum,int rangeNum) {
		Set<Integer> numSet = new TreeSet<Integer>();//ʹ��TreeSet�������С�������С�
		while (numSet.size() != rangeNum) {
			numSet.add(new Integer(new Random().nextInt(stopNum-startNum) + startNum));
		}
		int [] result=new int[numSet.size()];
		Iterator iter=numSet.iterator();
		int i=0;
		while(iter.hasNext()){
			result[i++]=Integer.parseInt(iter.next().toString());
		}
		return result;
	}
	
	/**
	 * ����
	 * @param args
	 */
	public static void main(String args[]) {
		int a[] = rand(1, 33, 6);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
	}

}
