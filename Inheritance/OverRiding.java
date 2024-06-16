package Inheritance;
/*
  Only methods could be overrided because same signatures i.e data types names etc
  Can't be applied on Constructor because in Contructor we use class name
  This doesn't happens in Association 
  private --> cann't be accessed
  final --> cann't be changed but can be accessed
  */

	
class Human{
	int a;
	
}


class Man extends Human /*Single Inheritance Performed*/{
	int b;
	   /*final --> If kept final then cannot allows the overriding */ void printa() {
		System.out.println(a);  //allows to access a doen't shows an error
	}
}

class AsianMan extends Man /*Multilevel Inheritance*/{ 
	 void printa() {
		System.out.println(a);  // a gets by Human class
		System.out.println(b);  // b gets by Man class
	}
}

public class OverRiding {

}
