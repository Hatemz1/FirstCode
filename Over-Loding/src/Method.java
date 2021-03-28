import java.util.Scanner;
public class Method {
	
public static void Math(int q,int w) {
	int A =  q + w;
	System.out.println(A);
	 
}

public static void Math(double a,double s) {

 double B = a - s;
 System.out.println(B);
 
}

public static double Math (double z,int b) {
double Det = z/b;
	System.out.println(Det);
	
	return Det;
	
}

public static int Math (int r, int g, int h) {
int Set =r*g*h;
System.out.println(Set);

	
 return Set;	
 
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	
	Scanner input = new Scanner(System.in);
	int A =input.nextInt();
	double B =input.nextDouble();
	double Det =input.nextDouble();
	int Set =input.nextInt();
	
	}

}
