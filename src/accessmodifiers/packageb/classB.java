package accessmodifiers.packageb;

import accessmodifiers.packagea.classA;  //import the other package class

public class classB extends classA {  // can extend a class from another package (inheritance via extends keyword)
	public static void main(String[] args) {
		classA aObj = new classA();
		
		//System.out.println(aObj.a); //private  
		//System.out.println(aObj.b); //default package
		//System.out.println(aObj.c); //protected - it is inherited but not directly accessible
		System.out.println(aObj.d); //public available
		
		/*
		 * create object of this class and now protected members 
		 * are accessible from the inheriting class
		 */
		
		classB cObj = new classB();
		System.out.println(cObj.c); 
	}
}
