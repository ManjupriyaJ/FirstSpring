package com.test.aop;


public  class Operation{  
   public void msg(){System.out.println("msg method invoked");}  
    public int m(){System.out.println("m method invoked");return 2;}  
    public int k1(){System.out.println("k1 method invoked");return 3;}  
    public int ka(){System.out.println("k2 method invoked");return 4;}  
    public int kan(int age){ 
    	if(age<18){  
    	 throw new ArithmeticException("Not valid age");  
    	}  
    	 else{  
    		 System.out.println("Thanks for vote");  
    	 }  
    	System.out.println("k3 method invoked");return 5;
    }  
}  

