package curso;

public class ConversaoImplicita {

	public static void main(String[] args) {
		//do menor para o maior
		byte varByte = 21;
		int varInt = varByte;
		System.out.println("Byte: " + varByte); //concatenação
		System.out.println("Int: " + varInt);
				
		double varDouble = varByte;
		System.out.println("Double: " + varDouble);

	}

}
