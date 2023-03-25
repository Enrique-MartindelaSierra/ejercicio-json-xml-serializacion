package com.enrique.ejercicio_json_xml_serializacion.utilities;

import java.util.Scanner;

public class BasicUtils {

	public static int devolverNumeroConsola(){
		System.out.println("dame un numero");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		return num;
	}


}
