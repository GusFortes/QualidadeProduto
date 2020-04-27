package pucrs.si.qp.t1;


/**
 * 
 * @author marco.mangan@pucrs.br
 * 
 */
public class App {

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */

	public static int verificaValoresInteiros(double a, double b, double c){
		int ladoA;
		int ladoB;
		int ladoC;

		if(a != Math.floor(a) || b != Math.floor(b) || c != Math.floor(c)){
			throw new RuntimeException("Os valores devem ser números inteiros. Verifique.");
		}else{
			ladoA = (int) a;
			ladoB = (int) b;
			ladoC = (int) c;
			return identificaTriangulo(ladoA, ladoB, ladoC);
		}

	}

	public static int identificaTriangulo(int a, int b, int c) {
		if ((a == 0) && (b == 0) && (c == 0)) {
			return tipos.INVALIDO.value();
		} else if ((a <= 0) || (b <= 0) || (c <= 0)) {
			throw new RuntimeException("Nenhum lado pode ser igual ou menor a 0. Verifique.");
		} else {
			if ((a < b + c) && (b < a + c) && (c < b + a)) {
				if ((a == b) && (b == c))
					return tipos.EQUILATERO.value();
				else if ((a != b) && (a != c) && (b != c))
					return tipos.ESCALENO.value();
				else
					return tipos.ISOSCELES.value();
			}
			return tipos.INVALIDO.value();
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Triângulos!");
		System.out.println(verificaValoresInteiros(2, 3, 4));
	}
}