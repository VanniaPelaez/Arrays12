package Package1;

public class Main {

	public static void main(String[] args) {
	
		int enteros[] = new int[15];	
		String nombres[] = new String[20];
		Array objetos[] = new Array[100];
		
		enteros[9] = 5;
		nombres[0] = "Francisco";
		
		Array code = new Array();
		code.Show(enteros);
		code.Show(nombres);
		code.Show(objetos);
		code.Look(enteros, 5);
		code.Look(nombres, "Francisco");
		code.Delete(enteros, 5);
		code.Show(enteros);
		code.Delete(nombres, "Francisco");
		code.Show(nombres);

	}

}
