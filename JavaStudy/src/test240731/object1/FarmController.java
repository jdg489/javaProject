package test240731.object1;

import java.util.ArrayList;
import java.util.HashMap;

public class FarmController {
	private HashMap<Farm,Integer> hMap = new HashMap<>();
	private ArrayList<Farm> list = new ArrayList<> ();
	
	public boolean addNewKind(Farm f, int amount) {
		return true;
	}
	
	public boolean removeKind(Farm f) {
		return true;
	}
	
	public boolean changeAmount(Farm f , int amount) {
		return true;
	}
	
	public HashMap<Farm , Integer> printFarm() {
		return null;
	}
	
	public boolean buyFarm(Farm f) {
		return true;
	}
	
	public boolean removeFarm(Farm f) {
		return true;
	}
	
	public ArrayList<Farm> printBuyFarm() {
		return null;
	}
}
