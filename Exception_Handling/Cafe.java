package SirNaveen;
class CoffeeTempEx extends Exception{  // we can also extends the RuntimeException class which is a subclass of Exception
	private String message; // --> For modifying our own message
	CoffeeTempEx(String msg){
		super();
//		message = msg;
		
//        super(message);  // If we create our own message method i.e getmessage() then there is no need to super call.
        // -->constructor call -->  passes data or message to Exception class 
    } // --> If empty then not shows any error --> but we want a message. 
}

class CoffeeCup{
    private int ctemp;
    private String cName;
     
    CoffeeCup(String n, int t){
        cName= n;
        ctemp=t;
    }
    /*
    String getMessage() {  //For getting our own message on runtime 
    	return ""l;
    }*/
// 	if variables are private then we make the setters and getters to access the variables data.
//  create the attributes --> means default --> directly can be accessed.
    String getName(){
        return cName;
    }
    int getCTemp(){
        return ctemp;
    }
}
class Customer{
    String cusName;
/*
    CoffeeCup cup; --> for accessing the whole data and functions of coffeeCup class .
    	void setCofeeCup(CoffeeCup e) {
    		cup=e;  		
    	}*/
    
    Customer(String n){
        cusName=n;
    }
    String getCuName(){
        return cusName;
    }
  
    void CheckTemp(CoffeeCup c) throws CoffeeTempEx {// throws type of exception multiple exception can be checked by using 
    		if(c.getCTemp()<20)
            throw new CoffeeTempEx("Cofee is too cold");
            else if(c.getCTemp()>60)
            throw new CoffeeTempEx("Cofee is too Hot");
            else
            System.out.println("Cofee is normal");
        
    }	//If method created then we don't need to create object here.
}

class Cafe{
    public static void main(String args[]){
        Customer c1= new Customer("Mahad");
        CoffeeCup cc1= new CoffeeCup("Brew", 70);
        
//        customerobject.setCofeefunction(objecttpass)
        try{ // --> for handle
            c1.CheckTemp(cc1);
            
        }
        catch(Exception e){  //if throws towards parent i.e exception then to handle we have to use excption also
        					// if throws towards 
            System.out.println(e.getMessage());
        }
        
        System.out.println(c1.getCuName());
}
}