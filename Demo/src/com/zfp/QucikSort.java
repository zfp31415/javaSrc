package com.zfp;

public class QucikSort {
     
//	void Swap(Double right,Double left)
//	{
//		double temp;
//		temp = left;
//		left = right;
//		right = temp;
//		
//	}
	int  partion(double[] dArray,int left ,int right)
	{
		 double p = dArray[left];
		while(left<right)
		{
			while(dArray[right]>=p&&right>left)
				 right--;
			
			while(dArray[left]<p&&right>left)
				left++;

			double  temp = dArray[left];
			dArray[left] = dArray[right];
			dArray[right] = temp;
		}
		return left;
	}
	
	void Sort(double[] dArray,int left,int right)
	{
		if(left<right)
		{
		int mid = partion(dArray,left,right);
		Sort(dArray,0,mid-1);
		Sort(dArray,mid+1,right);
		}
	}
}
