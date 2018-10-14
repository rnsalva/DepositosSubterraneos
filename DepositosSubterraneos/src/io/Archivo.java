package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {

	public Cargar leerArchivo(String path) throws FileNotFoundException{
		
		FileReader fr = new FileReader(path);
		Scanner sc = new Scanner(fr);
		int cantDep = sc.nextInt();
		double volumenTot;
		Deposito vec[] = new Deposito[cantDep];
		
		for (int i = 0; i < cantDep; i++)
			vec[i] = new Deposito(sc.nextDouble(),sc.nextDouble(),0);
		
		volumenTot = sc.nextDouble();
		sc.close();
		
		return new Cargar(vec,volumenTot);
	}
	
	public void escribirArchivo(String path, int[] vec) throws IOException{
		PrintWriter ptr = new PrintWriter(path);
		if(vec.length == 1)
			ptr.println("Rebasan: " + vec[0]);
		else
			ptr.println(vec[0] + "\n" + vec[1]);
		ptr.close();
	}
}
