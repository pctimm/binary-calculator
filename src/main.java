import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Write an integer number: ");
		System.out.print(">>> ");
		long entry = input.nextInt();
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
		// int a = Integer.parseInt(binary);
		System.out.println(binary + " binary");
		System.out.println();
		System.out.printf("<<< %d bits long\n", bitsNeeded);
		int bytes = 0;
		if (bitsNeeded >= 8) {
			bytes = bitsNeeded / 8;
			int bitsRest = bitsNeeded % 8;
			if (bitsRest == 0) {
				System.out.printf("Also... %d B long.\n", bytes);
			}
			else {
				System.out.printf("Also... %d B and %d b long.\n", bytes, bitsRest);
			}
		}
		
	}

}
