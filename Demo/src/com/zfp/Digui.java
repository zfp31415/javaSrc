package com.zfp;


import java.util.LinkedList;
import java.util.List;

public class Digui {
	int num =0;
    /**
     * @author zfp
     * @version 1.0
     * @serialData 2016年3月2日
     * 功能描述：显示一个数组的全组合
     * 设计思路：如果这个数组只有一个数据 我们可以很容易的显示出这个数组的全部组合
     */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	void ListAll(List<String> array,String prefix){
		//判断数组是否为空
		if(array.isEmpty()) {
			System.out.println(prefix);
		
		}
		//接下来处理不为空的情况 
		for(int i =0;i<array.size();i++)
		{
			List temp = new LinkedList(array);
			String strTemp = prefix+temp.remove(i);
			if(!temp.isEmpty()){
				System.out.println(strTemp);
			}
			ListAll(temp,strTemp);
		}
		
	}
	
	//计算一个5位数满足abcde*4 =edcba;
	void CalNum()
	{
		for(int i =10000;i<99999;i++)
		{
			int temp = i*4;
			if(temp/10000==i%10&&i/10000==temp%10&&
					(temp/1000)%10==(i%100)/10&&(i/1000)%10==(temp%100)/10&&
					  (temp/100)%10==(i/100)%10&&(i/100)%10==(temp/100)%10)
				System.out.println(i);
			
		
	     }
	}
}
