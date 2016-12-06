package EDAp4;

import graphsDSESIUCLM;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Nodo;
import Trayecto;
public class Principal {
	public static Scanner Teclado = new Scanner(System.in);
	public static void main(String[] args){
		
		File archivo = new File(new File("").getAbsolutePath() + "\\src\\MetroBikeShare_2016_Q3_trips.csv");
		ArrayList<Trayecto> lista = new ArrayList<Trayecto>(Lectura(archivo));
		VerLista(lista);
	}
	
	
	public static void VerLista(ArrayList<Trayecto> lista){ //nos permite ver la lista de trayectos
		for(int i = 0; i < lista.size(); i++){
			System.out.println(i+" - "+lista.get(i).toString());
		}
	}
	
	public static ArrayList<Trayecto> Lectura(File fichero){ //leemos el fichero con un Split
		
		ArrayList<Trayecto> lista = new ArrayList<Trayecto>();
		Nodo n1,n2;
		try{
			Scanner leer = new Scanner(fichero);
			leer.nextLine();
			while(leer.hasNextLine()){
				String linea = leer.nextLine();
				String[] lineacomoarray = linea.split(",");
				int tiempo = Integer.parseInt(lineacomoarray[1]);
				n1 = new Nodo(Integer.parseInt(lineacomoarray[4]), Double.parseDouble(lineacomoarray[5]), Double.parseDouble(lineacomoarray[6]));
				n2 = new Nodo(Integer.parseInt(lineacomoarray[7]), Double.parseDouble(lineacomoarray[8]), Double.parseDouble(lineacomoarray[9]));
				Trayecto nuevo = new Trayecto(n1,n2,tiempo);
				if(tiempo <=300 && tiempo >= 0 && !n1.equals(n2)){
				if(lista.isEmpty()){
					lista.add(nuevo);
				}
				else if(!lista.isEmpty()){
					boolean añadir = true;
					for(int i = 0; i < lista.size() && añadir;i++){
						if(lista.get(i).n1.equals(nuevo.n1) && lista.get(i).n2.equals(nuevo.n2)){
							añadir = false;
						}
					}
					if(añadir){
						lista.add(nuevo);	
					}
				}
				}
			}
			leer.close();
		}catch (IOException e){
			System.out.println("Ha ocurrido un error, finalizando el programa");
		}
		
		return lista;
	}
	
}
