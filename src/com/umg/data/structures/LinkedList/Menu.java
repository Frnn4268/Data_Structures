package com.umg.data.structures.LinkedList;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		DoublyLinkedList<String> dl_nodes = new DoublyLinkedList<String>();
		
		System.out.println("____________Bienvenido_______________");
		System.out.println("_____________________________________");
		System.out.println("Ingrese al DoublyLinkedList que desea");
		System.out.println("");
		System.out.println("1.- Insertar al inicio");
		System.out.println("2.- Insertar al final");
		System.out.println("3.- Recorrer hacia adelante");
		System.out.println("4.- Recorrer hacia atr�s");
		System.out.println("5.- Mostrar el tama�o de la lista");
		System.out.println("6.- Mostrar si la lista est� vac�a");
		System.out.println("7.- Buscar elemento por valor");
		System.out.println("8.- Buscar elemento por �ndice");
		System.out.println("9.- Borrar un elemento");
		System.out.println("10.- Salir");
		
		try (Scanner sc = new Scanner(System.in)) {
			int op = sc.nextInt();
			
			switch(op) {
		    case 1:
		    	System.out.println("Insertar al Inicio");
		    	System.out.println();
		    	System.out.println("Agregue un dato 1");
		    	String datoIH = sc.next();
		    	System.out.println("Agregue un dato 2");
		    	String datoIH1 = sc.next();
		    	System.out.println("Agregue un dato 3");
		    	String datoIH2 = sc.next();
		    	System.out.println("");
		    	
		    	dl_nodes.insertAtHead(datoIH);
		    	dl_nodes.insertAtHead(datoIH1);
		    	dl_nodes.insertAtHead(datoIH2);
		    	
		    	dl_nodes.traverseForward();
		    	break;
		    
		    case 2:
		    	System.out.println("Insertar al Final");
		    	System.out.println();
		    	System.out.println("Agregue un dato 1");
		    	String datoIT= sc.next();
		    	System.out.println("Agregue un dato 2");
		    	String datoIT1 = sc.next();
		    	System.out.println("Agregue un dato 3");
		    	String datoIT2 = sc.next();
		    	System.out.println("");
		    	
		    	dl_nodes.insertAtTail(datoIT);
		    	dl_nodes.insertAtTail(datoIT1);
		    	dl_nodes.insertAtTail(datoIT2);
		    	
		    	dl_nodes.traverseBackward();
		    	break;
		    	
		    case 3:
		    	System.out.println("Recorrer hacia Adelante");
		    	System.out.println();
		    	System.out.println("Agregue un dato 1");
		    	String datoRD= sc.next();
		    	System.out.println("Agregue un dato 2");
		    	String datoRD1 = sc.next();
		    	System.out.println("Agregue un dato 3");
		    	String datoRD2 = sc.next();
		    	System.out.println("");
		    	
		    	dl_nodes.insertAtHead(datoRD);
		    	dl_nodes.insertAtHead(datoRD1);
		    	dl_nodes.insertAtHead(datoRD2);
		    	
		    	dl_nodes.traverseForward();
		    	break;
		    	
		    case 4:
		    	System.out.println("Recorrer hacia Atr�s");
		    	System.out.println();
				System.out.println("Agregue un dato 1");
		    	String datoRA= sc.next();
		    	System.out.println("Agregue un dato 2");
		    	String datoRA1 = sc.next();
		    	System.out.println("Agregue un dato 3");
		    	String datoRA2 = sc.next();
		    	System.out.println("");
		    	
		    	dl_nodes.insertAtHead(datoRA);
		    	dl_nodes.insertAtHead(datoRA1);
		    	dl_nodes.insertAtHead(datoRA2);
		    	
		    	dl_nodes.traverseBackward();
		    	break;
		    	
		    case 5:
		    	System.out.println("Mostrar el tama�o de la lista");
		    	System.out.println();
		    	System.out.println("Agregue un dato 1");
		    	String datoT= sc.next();
		    	System.out.println("Agregue un dato 2");
		    	String datoT1 = sc.next();
		    	System.out.println("Agregue un dato 3");
		    	String datoT2 = sc.next();
		    	System.out.println("");
		    	
		    	dl_nodes.insertAtHead(datoT);
		    	dl_nodes.insertAtHead(datoT1);
		    	dl_nodes.insertAtHead(datoT2);
		    	
		    	dl_nodes.traverseForward();
		    	
		    	int size = dl_nodes.size();

		    	System.out.println("El tama�o de la lista es: " + size);
		    	break;
		    	
		    case 6:
		    	System.out.println("Mostrar si la lista est� vac�a");
		    	System.out.println();
		    	System.out.println("�Desea ingresar datos?");
		    	System.out.println("1.- Si || 2.- No");
		    	System.out.println("");
		    	int dato = sc.nextInt();
		    	
		    	if (dato == 1) {
		    		System.out.println("Agregue un dato 1");
			    	String datoIHt = sc.next();
			    	System.out.println("Agregue un dato 2");
			    	String datoIHt1 = sc.next();
			    	System.out.println("Agregue un dato 3");
			    	String datoIHt2 = sc.next();
			    	System.out.println("");
			    	
			    	dl_nodes.insertAtHead(datoIHt);
			    	dl_nodes.insertAtHead(datoIHt1);
			    	dl_nodes.insertAtHead(datoIHt2);
			    	
			    	dl_nodes.traverseForward();
			    	
		    		Boolean res = dl_nodes.isEmpty();
		    		System.out.println("�La lista est� vac�a? " + res);
		    	} else {
		    		Boolean res = dl_nodes.isEmpty();
		    		System.out.println("�La lista est� vac�a? " + res);
		    	}
		    	break;
		    	
		    case 7:
		    	System.out.println("Buscar elemento por valor");
		    	System.out.println();
		    	System.out.println("Agregue un dato 1");
		    	String datoIHt = sc.next();
		    	System.out.println("Agregue un dato 2");
		    	String datoIHt1 = sc.next();
		    	System.out.println("Agregue un dato 3");
		    	String datoIHt2 = sc.next();
		    	System.out.println("");
		    	
		    	dl_nodes.insertAtHead(datoIHt);
		    	dl_nodes.insertAtHead(datoIHt1);
		    	dl_nodes.insertAtHead(datoIHt2);
		    	
		    	dl_nodes.traverseForward();

		    	System.out.println("");
		    	System.out.println("Ingrese el value a buscar:");
		    	int search = sc.nextInt();
		    	
		    	if (search == 1) {
		    		dl_nodes.searchByValue(datoIHt); 
		    		System.out.println("El valor es: " + datoIHt);
		    	} else if (search == 2) {
		    		dl_nodes.searchByValue(datoIHt1); 
		    		System.out.println("El valor es: " + datoIHt1);
		    	} else {
		    		dl_nodes.searchByValue(datoIHt2); 
		    		System.out.println("El valor es: " + datoIHt2);
		    	}
		    	break;
		    	
		    case 8:
		    	System.out.println("Buscar elemento por indice");
		    	System.out.println();
		    	System.out.println("Agregue un dato 1");
		    	String datoIHp = sc.next();
		    	System.out.println("Agregue un dato 2");
		    	String datoIHp1 = sc.next();
		    	System.out.println("Agregue un dato 3");
		    	String datoIHp2 = sc.next();
		    	System.out.println("");
		    	
		    	dl_nodes.insertAtHead(datoIHp);
		    	dl_nodes.insertAtHead(datoIHp1);
		    	dl_nodes.insertAtHead(datoIHp2);
		    	
		    	dl_nodes.traverseForward();

		    	System.out.println();
		    	System.out.println("Ingrese el indice a buscar:");
		    	int searchI = sc.nextInt();
		    	
		    	if (searchI == 1) {
		    		dl_nodes.searchByIndex(0); 
		    		System.out.println("El indice es: " + datoIHp);
		    	} else if (searchI == 2) {
		    		dl_nodes.searchByIndex(1); 
		    		System.out.println("El indice es: " + datoIHp1);
		    	} else {
		    		dl_nodes.searchByIndex(2);
		    		System.out.println("El indice es: " + datoIHp2);
		    	}
		    	break;
		    	
		    case 9:
		    	System.out.println("Borrar un elemento");
		    	System.out.println();
		    	System.out.println("Agregue un dato 1");
		    	String datoD = sc.next();
		    	System.out.println("Agregue un dato 2");
		    	String datoD1 = sc.next();
		    	System.out.println("Agregue un dato 3");
		    	String datoD2 = sc.next();
		    	System.out.println("");
		    	
		    	dl_nodes.insertAtHead(datoD);
		    	dl_nodes.insertAtHead(datoD1);
		    	dl_nodes.insertAtHead(datoD2);
		    	
		    	dl_nodes.traverseForward();

		    	System.out.println();
		    	System.out.println("Ingrese el indice a eliminar:");
		    	int delete = sc.nextInt();
		    	
		    	if (delete == 1) {
		    		dl_nodes.deleteFromPosition(1); 
		    	} else if (delete == 2) {
		    		dl_nodes.deleteFromPosition(2); 
		    	} else {
		    		dl_nodes.deleteFromPosition(3); 
		    	}
		    	
		    	System.out.println();
		    	dl_nodes.traverseForward();
		    	break;
			}
			
		}
		
	}
	
}
