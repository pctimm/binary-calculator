import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Write in an integer number: ");
		System.out.print(">>> ");
		int entry = input.nextInt();
		int bitsNeeded = 1;
		
		
		do {
			int multiplo = (int) Math.pow(2, bitsNeeded);
			if (entry < multiplo) {
				break;
			}
			else if (entry == multiplo) {
				bitsNeeded ++;
				break;
			}
			else {
				bitsNeeded ++;
			}
		} while (true);
		// System.out.println(bitsNeeded);

		int[] num = new int[bitsNeeded];
		for (int i = bitsNeeded; i > 0; i --) {
			int multiplo = (int) Math.pow(2, i - 1);
			if (entry >= multiplo) {
				num[i - 1] = 1;
				entry -= multiplo;
			}
			else {
				num[i - 1] = 0;
			}
		}
		// System.out.println(bitsNeeded);
		String binary = "";
		for (int i = bitsNeeded - 1; i >= 0; i --) {
			binary += num[i];
		}
		System.out.println(binary);
		System.out.printf(">>> %d bits long\n", bitsNeeded);
		
	}

}
