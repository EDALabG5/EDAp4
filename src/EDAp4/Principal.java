package EDAp4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import graphsDSESIUCLM.*;
import java.util.Iterator;

public class Principal implements Iterable<Graph>{
	public static Scanner Teclado = new Scanner(System.in);
	public static void main(String[] args){
		
		File archivo = new File(new File("").getAbsolutePath() + "\\src\\MetroBikeShare_2016_Q3_trips.csv");
		Graph grafo = Lectura(archivo);
		
	}
	
	
	public static Graph Lectura(File fichero){ //leemos el fichero con un Split
		
		Graph gr = null;
		
		Nodo n1, n2;
		try{
			Scanner leer = new Scanner(fichero);
			leer.nextLine();
			while(leer.hasNextLine()){
				String linea = leer.nextLine();
				String[] lineacomoarray = linea.split(",");
				int tiempo = Integer.parseInt(lineacomoarray[1]);
				n1 = new Nodo(lineacomoarray[4], lineacomoarray[5], lineacomoarray[6]);
				n2 = new Nodo(lineacomoarray[7], lineacomoarray[8], lineacomoarray[9]);
				
				ElementoDecorado e1 = new ElementoDecorado(lineacomoarray[4], n1);
				ElementoDecorado e2 = new ElementoDecorado(lineacomoarray[7], n2);
				
				Vertex<ElementoDecorado> v1, v2;
				
				for(int i = 0; i < gr.)
				
				v1= gr.insertVertex(v1);
				v2= gr.insertVertex(n2);
				gr.insertEdge(v1, v2)
			
				if(tiempo <=300 && ){
				if(lista.isEmpty()){
					lista.add(nuevo);
				}
				else if(!lista.isEmpty()){
					boolean añadir = true;
					for(int i = 0; i < lista.size() && añadir;i++){
						if(lista.get(i).n1.getID().equals(nuevo.n1.getID()) && lista.get(i).n2.getID().equals(nuevo.n2.getID()) || nuevo.n1.getID().equals(nuevo.n2.getID())){
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
		
		return gr;
	}


	@Override
	public Iterator<Graph> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
