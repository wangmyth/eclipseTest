package com.g3;

import java.util.*;
/**
 * 	几十几选几的算法
 * @author Administrator
 *
 */
public class RandomNum {

	/**
	 * 
	 * @param startNum 开始范围
	 * @param stopNum 结束范围
	 * @param rangeNum 生成的随机数个数
	 * @return
	 */
	public static int[] rand(int startNum,int stopNum,int rangeNum) {
		Set<Integer> numSet = new TreeSet<Integer>();//使用TreeSet将结果从小到大排列。
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
	 * 测试
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
