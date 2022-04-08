
public class Primo {

	public static void main(String[] args) {
		int n = 1;
		Primo(n);

	}

	public static boolean Primo(int n) {
	//	n = 1;
		int contDivisibles = 0;
		int max_divisibles = 2;
		boolean primo = false;
		boolean seguir = true;

		do {
			contDivisibles = 0;
			n++;
			for (int i = 1; i <= n; i++) {
				
				if ((n % i == 0)) {
					contDivisibles++;
				}
			}

			if (contDivisibles > max_divisibles) {
				primo = false;

			}
			
			if (contDivisibles == max_divisibles) {
				System.out.println(n);
				primo = true;
				
			}
			
		} while (seguir);
		return primo;

	}

}
