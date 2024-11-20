package Unidad3;
import java.util.Random;
public class Act3Git {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random ();
		
		int[] Array = new int [20];
		
		for (int i = 0; i < Array.length; i++) {
			Array[i] = random.nextInt(10);
			System.out.println(Array[i]);
		}
	}

}
