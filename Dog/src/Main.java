
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog D1 = new Dog();
Dog D2 = new Dog();
Dog D3 = new Dog();

D1.breed = "Bullidog";
D1.size = "large";
D1.colour = "light gray";
D1.age = "five years";

D2.breed = "Beagle";
D2.size = "large";
D2.colour = "orange";
D2.age = "six years";

D3.breed = "German Shepherd";
D3.size = "large";
D3.colour = "white & orange";
D3.age = "six years";

D1.printInfo();
D2.printInfo();
D3.printInfo();
}
}
