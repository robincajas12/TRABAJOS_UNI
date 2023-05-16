package Main;
public class Program {

	public static void main(String[] args) {
		/*
		 Use todos los tipos primitivos para declarar dos variables
		 y use los operadores los cinco operadores aritméticos entre
		 las dos variables declaradas para realizar las operaciones
		 correspondientes.  Los  resultados  de  las  operaciones  
		 deben  ser  asignados  en  nuevas  variables. 
		 Imprima variables de los resultados en pantalla.  
		 */
		
		// Tipos primitivos: int, short, long, double, float, boolean, byte, char.
		int num1Entero = 5, num2Entero = 6;
		int resultadoSuma = num1Entero + num2Entero;
		int resultadoResta = num1Entero - num2Entero;
		int resultadoMultiplicacion = num1Entero * num2Entero;
		int resultadoDivision = num1Entero / num2Entero;
		int resultadoResiduo = num1Entero % num2Entero;
		System.out.println("Operadores matemáticos en para int: ");
		System.out.println("num1 : " + num1Entero + " num2 : " + num2Entero);
		System.out.println("num1 + num2 = " + resultadoSuma);
		System.out.println("num1 - num2 = " + resultadoResta);
		System.out.println("num1 * num2 = " + resultadoMultiplicacion);
		System.out.println("num1 / num2 = " + resultadoDivision);
		System.out.println("num1 % num2 = " + resultadoResiduo);
		
		long longNum1 = 500000000, longNum2 = 37;
		long resultadoSumaParaLong = longNum1 + longNum2;
		long resultadoRestaParaLong = longNum1 - longNum2;
		long resultadoMultiplicacionParaLong = longNum1 * longNum2;
		long resultadoDivisionParaLong = longNum1 / longNum2;
		long resultadoResiduoParaLong = longNum1 % longNum2;
		System.out.println("Operadores matemáticos para Long: ");
		System.out.println("num1 : " + longNum1 + " num2 : " + longNum2);
		System.out.println("num1 + num2 = " + resultadoSumaParaLong);
		System.out.println("num1 - num2 = " + resultadoRestaParaLong);
		System.out.println("num1 * num2 = " + resultadoMultiplicacionParaLong);
		System.out.println("num1 / num2 = " + resultadoDivisionParaLong);
		System.out.println("num1 % num2 = " + resultadoResiduoParaLong);
		
		short shortNum1 = 10, shortNum2 = 2;
	    short resultadoSumaParaShort = (short)(shortNum1 + shortNum2);
	    short resultadoRestaParaShort = (short)(shortNum1 - shortNum2);
	    short resultadoMultiplicacionParaShort = (short)(shortNum1 * shortNum2);
	    short resultadoDivisionParaShort = (short)(shortNum1 / shortNum2);
	    short resultadoResiduoParaShort = (short)(shortNum1 % shortNum2);
	    System.out.println("Operadores matemáticos para Short: ");
		System.out.println("num1 : " + shortNum1 + " num2 : " + shortNum2);
	    System.out.println("num1 + num2 = " + resultadoSumaParaShort);
	    System.out.println("num1 - num2 = " + resultadoRestaParaShort);
	    System.out.println("num1 * num2 = " + resultadoMultiplicacionParaShort);
	    System.out.println("num1 / num2 = " + resultadoDivisionParaShort);
	    System.out.println("num1 % num2 = " + resultadoResiduoParaShort);
	    
	    double doubleNum1 = 3.5, doubleNum2 = 2.7;
        double resultadoSumaParaDouble = doubleNum1 + doubleNum2;
        double resultadoRestaParaDouble = doubleNum1 - doubleNum2;
        double resultadoMultiplicacionParaDouble = doubleNum1 * doubleNum2;
        double resultadoDivisionParaDouble = doubleNum1 / doubleNum2;
        double resultadoResiduoParaDouble = doubleNum1 % doubleNum2;
        System.out.println("Operadores matemáticos para Double: ");
    	System.out.println("num1 : " + doubleNum1+ " num2 : " + doubleNum2);
        System.out.println("num1 + num2 = " + resultadoSumaParaDouble);
        System.out.println("num1 - num2 = " + resultadoRestaParaDouble);
        System.out.println("num1 * num2 = " + resultadoMultiplicacionParaDouble);
        System.out.println("num1 / num2 = " + resultadoDivisionParaDouble);
        System.out.println("num1 % num2 = " + resultadoResiduoParaDouble);
        
        float floatNum1 = 35.5f, floatNum2 = 27.7f;
        float resultadoSumaParaFloat = floatNum1 + floatNum2;
        float resultadoRestaParaFloat = floatNum1 - floatNum2;
        float resultadoMultiplicacionParaFloat = floatNum1 * floatNum2;
        float resultadoDivisionParaFloat = floatNum1 / floatNum2;
        float resultadoResiduoParaFloat = floatNum1 % floatNum2;
        System.out.println("Operadores matemáticos para Float: ");
    	System.out.println("num1 : " + floatNum1 + " num2 : " + floatNum1);
        System.out.println("num1 + num2 = " + resultadoSumaParaFloat);
        System.out.println("num1 - num2 = " + resultadoRestaParaFloat);
        System.out.println("num1 * num2 = " + resultadoMultiplicacionParaFloat);
        System.out.println("num1 / num2 = " + resultadoDivisionParaFloat);
        System.out.println("num1 % num2 = " + resultadoResiduoParaFloat);
        
        
        byte byteNum1 = 3, byteNum2 = 2;
        byte resultadoSumaParaByte = (byte)(byteNum1 + byteNum2);
        byte resultadoRestaParaByte = (byte)(byteNum1 - byteNum2);
        byte resultadoMultiplicacionParaByte = (byte)(byteNum1 * byteNum2);
        byte resultadoDivisionParaByte = (byte)(byteNum1 / byteNum2);
        byte resultadoResiduoParaByte = (byte)(byteNum1 % byteNum2);
        System.out.println("Operadores matemáticos para Byte: ");
    	System.out.println("num1 : " + byteNum1 + " num2 : " + byteNum2);
        System.out.println("num1 + num2 = " + resultadoSumaParaByte);
        System.out.println("num1 - num2 = " + resultadoRestaParaByte);
        System.out.println("num1 * num2 = " + resultadoMultiplicacionParaByte);
        System.out.println("num1 / num2 = " + resultadoDivisionParaByte);
        System.out.println("num1 % num2 = " + resultadoResiduoParaByte);
        
        
        char char1 = 'D', char2 = 'S';
       
        char resultadoSumaParaChar = (char)(char1 + char2);
        char resultadoRestaParaChar = (char)(char1 - char2);
        char resultadoMultiplicacionParaChar = (char)(char1 * char2);
        char resultadoDivisionParaChar = (char)(char1 / char2);
        char resultadoResiduoParaChar = (char)(char1 % char2); 
      
        System.out.println("Operadores matemáticos para Char: ");
    	System.out.println("num1 : " + char1 + " num2 : " + char2);
        System.out.println("num1 + num2 = " + resultadoSumaParaChar);
        System.out.println("num1 - num2 = " + resultadoRestaParaChar);
        System.out.println("num1 * num2 = " + resultadoMultiplicacionParaChar);
        System.out.println("num1 / num2 = " + resultadoDivisionParaChar);
        System.out.println("num1 % num2 = " + resultadoResiduoParaChar);
          
        
        /*
         Para que variables de tipos primitivos
         no es posible aplicar los operadores aritméticos?  
         Indique que operadores dan errores de compilación o ejecución.
         */
        
        // No es posible aplicar operadores aritmeticoas a los booleanos
        // Para Char, byte y short se necesita hacer un casting para poder realizar las operaciones correspondientes
        // y guardarlo en una varibale del mismo tipo, si no se hace un casting se puede guardar en un int
        
      /*  boolean verdad = true;
        boolean falsedad = false;
        boolean result = verdad + falsedad; // No se puede hacer ninguna operacion aritmetica
        */
	}

}
