package com.zfp;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//       String strArray[]={"1","2","3"};
//       Digui MyDigui = new Digui();
       
      
      // MyDigui.ListAll(Arrays.asList(strArray), "");
//       int i =7;
//      // System.out.println(i%3);
//   MyDigui.CalNum();
      //double dArray[]= new double[10];
       double dArray[]= {4,2,1,2,1,7,9,8,6,0,-1,-8,-0.5};
       QucikSort qs = new QucikSort();
       double a = 1;
       double b =2 ;
       
//       qs.Swap(a, b);
//       System.out.print(a+" "+b);
       qs.Sort(dArray,0,dArray.length-1);
       
       for(int i =0 ;i<dArray.length;i++)
    	   System.out.print(dArray[i]+" ");
       
	}

}
