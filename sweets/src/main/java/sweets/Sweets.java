package sweets;
import java.util.*;
class sortByCost implements Comparator<Sweets>{
	@Override
	public int compare(Sweets s1, Sweets s2) {
		return s1.cost-s2.cost;
	}
}
class sortByWeight implements Comparator<Sweets>{
	@Override
	public int compare(Sweets s1, Sweets s2) {
		return Float.compare(s1.weight,s2.weight);
	}
}
class sortBySweetness implements Comparator<Sweets>{
	@Override
	public int compare(Sweets s1, Sweets s2) {
		return s1.sweetness-s2.sweetness;
	}
}
public class Sweets {
	String Name;
	int cost;
	float weight;
	int sweetness;
	public Sweets(String Name,int cost,float weight,int sweetness){
		this.Name=Name;
		this.cost=cost;
		this.weight=weight;
		this.sweetness=sweetness;
	}
}
