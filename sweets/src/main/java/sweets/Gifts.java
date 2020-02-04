package sweets;
import java.util.*;
public class Gifts {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		List<Sweets> s=new ArrayList<>();
		s.add(new Chocolate("DairyMilk",50,20.5f,60));
		s.add(new Chocolate("MilkyBar",20,10.2f,40));
		s.add(new Chocolate("FiveStar",30,21.5f,55));
		s.add(new Chocolate("KitKat",60,30.2f,65));
		s.add(new Jelly("JustJelly",5,5.1f,45));
		s.add(new Jelly("JollyRancher",10,5.1f,50));
		s.add(new Jelly("JellyBelly",15,7.5f,65));
		s.add(new Candy("Hershey's_Kisses",60,8.1f,90));
		s.add(new Candy("LaffyTaffy",90,30.1f,75));
		s.add(new Candy("Nerds",10,2.6f,10));
		s.add(new Candy("MilkyWay",30,15.6f,25));
		s.add(new Candy("DoubleBubbleGum",5,3.0f,15));
		List<Sweets> ch=new ArrayList<>();
		int n=s.size();
		float tw=0.0f;
		for(int i=0;i<n;i++) tw+=s.get(i).weight;
		System.out.println("Total Weight of Gift is : "+tw);
		for(int i=0;i<n;i++) {
			if(s.get(i) instanceof Chocolate) ch.add(s.get(i));
		}
		System.out.print("Enter the Option :\n1.sortByCost\n2.sortByWeight\n3.sortBySweetness\n");
		int option=in.nextInt();
		if(option==1) Collections.sort(ch,new sortByCost());
		else if(option==2) Collections.sort(ch,new sortByWeight());
		else Collections.sort(ch,new sortBySweetness());
		System.out.println("Chocolates Present in the Gift are:");
		for(int i=0;i<ch.size();i++){
			System.out.println(ch.get(i).Name+" "+ch.get(i).cost+" "+ch.get(i).weight+" "+ch.get(i).sweetness);
		}
		System.out.println("Do you Want List of Candies(y/n)");
		char c=in.next().charAt(0);
		if(c=='y'){
			System.out.print("Enter the Option :\n1.Cost\n2.Weight\n3.Sweetness\n");
			option=in.nextInt();
			System.out.println("Enter the Range");
			int min=in.nextInt();
			int max=in.nextInt();
			Sweets curr;
			if(option==1) {
				for(int i=0;i<n;i++) {
					curr=s.get(i);
					if(curr instanceof Candy && curr.cost>=min && curr.cost<=max){
						System.out.println(curr.Name+" "+curr.cost+" "+curr.weight+" "+curr.sweetness);
					}
				}
			}
			else if(option==2) {
				for(int i=0;i<n;i++) {
					curr=s.get(i);
					if(curr instanceof Candy && curr.weight>=min && curr.weight<=max){
						System.out.println(curr.Name+" "+curr.cost+" "+curr.weight+" "+curr.sweetness);
					}
				}
			}
			else {
				for(int i=0;i<n;i++) {
					curr=s.get(i);
					if(curr instanceof Candy && curr.sweetness>=min && curr.sweetness<=max){
						System.out.println(curr.Name+" "+curr.cost+" "+curr.weight+" "+curr.sweetness);
					}
				}
			}
		}
		in.close();
	}
}
