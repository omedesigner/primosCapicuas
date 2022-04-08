import java.util.ArrayList;

public class PrimosCapicuas {
	public static void main(String[] args) {
		int n = 1;
		int contador = 1, total = 50;
	
		ArrayList<Integer> primosCapicuas = new ArrayList<>();
		while (contador <= total) {
			
			if(esPrimoCapicua(n)) {
				primosCapicuas.add(n);
				contador++;
			}
			n++;	
		}
		System.out.println(primosCapicuas);
	}

	public static boolean esPrimoCapicua(int n) {
			if ((esPrimo(n) == true) && (esCapicua(n) == true)) {
				return true;
			} else {
				return false;
		}
	}

	public static boolean esPrimo(int n) {

		int contDivisibles = 0, max_divisibles = 2;
			contDivisibles = 0;
		for (int i = 1; i <= n; i++) {
			if ((n % i == 0)) {
				contDivisibles++;
			}
		}
		if (contDivisibles > max_divisibles) {
			return  false;
		}
		else {
			return  true;
		}

	}

	public static int darLaVuelta(int n) {
		String num = "" + n;
		String resultado = "";
		int pos = num.length() - 1;
		do {
			resultado += num.charAt(pos);
			pos--;
		} while (pos >= 0);
		int resu = Integer.parseInt(resultado);
		return resu;
	}

	public static boolean esCapicua(int n) {
		int numalreves = darLaVuelta(n);
		if (n == numalreves) {
			return true;
		} else {
			return false;
		}
	}
}