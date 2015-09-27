package com.qingwa.tiaoji;

public class Main {

	public static void main(String[] args) {
		int n = 9 ;//级数
		System.out.println(new Main().getCount(n));
	}
	public int getCount(int n){//斐波那契序列应用，青蛙跳级问题
		if(n >2){
			return getCount(n-1) + getCount(n-2);
		}else if(n==2){
			return 2;
		}else{
			return 1;
		}
	}

}
