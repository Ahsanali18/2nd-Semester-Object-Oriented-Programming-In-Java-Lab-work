package SirNaveen;/*
1. **Custom Exception Handling:**
Implement a custom exception class named `MiningRigTempEx` which extends the
`Exception` class. This custom exception is used to indicate when a
mining rig's temperature is outside the acceptable range.
The exception should be capable of accepting a custom message indicating whether the rig is too hot or too cold.*/
/*
2. **Mining Rig Model:** Create a class named `MiningRig` with attributes to track 
the mining rig's current temperature (`rigTemp`) and the type of cryptocurrency being mined (`coinType`). 
Include appropriate constructors, getters, and setters for these attributes.
*/

class MiningRingTempEx extends Exception{
	MiningRingTempEx(String msg){
		super(msg);
	}
}
class MinigRing{
	int ringTemp;
	String coinType;
	
	MinigRing(String coinType, int ringTemp){
		this.coinType=coinType;
		this.ringTemp=ringTemp;
	}
	public String getCointType() {
		return coinType;
	}
	public int getringTemp() {
		return ringTemp;
	}
}
/*
3. **Miner Information:** Define a class named `Miner` with an attribute `minerName` 
to store the name of the person or entity doing the mining. The class should also contain a method named
`checkRigTemp` which takes a `MiningRig` object as a parameter. This method checks the temperature of the mining rig:
 - If the temperature is below 10 degrees Celsius, it throws a `MiningRigTempEx` with a message indicating that the 
 rig is too cold.
   - If the temperature is above 80 degrees Celsius, it throws a `MiningRigTempEx` with a
   message indicating that the rig is too hot.
   - If the temperature is within the acceptable range, it prints a message indicating that 
   the rig's temperature is normal.*/

class Miner{
	String minerName;
	
	public Miner(String minName){
		this.minerName=minName;
	}
	
	public void checkRigTemp(MinigRing ring) throws Exception{
		if(ring.ringTemp<10) {
			throw new MiningRingTempEx("Rig is too cold");
		}
		else if(ring.ringTemp>80) {
			throw new MiningRingTempEx("Rig is too hot");
		}
		else 
			System.out.println("Rig's Temp is moderate");
	}
}
/*
4. **Simulation Control:** In the main class `CoinMiner`, simulate the scenario by creating an
instance of a `Miner` and a `MiningRig`. The mining rig should be initialized with a specific type of 
cryptocurrency and its current temperature. Use a try-catch block to catch and handle the potential 
`MiningRigTempEx` thrown when checking the rig's temperature. Display appropriate messages to the console
based on the outcome.*/


public class CoinMiner {
	public static void main(String[] args) {
	
		Miner miner=new Miner("XYZ");
		MinigRing ring= new MinigRing("ABC", 80);
		try {
			miner.checkRigTemp(ring);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(miner.minerName);

	}	
		
}
