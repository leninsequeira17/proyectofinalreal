package Pasaremos;
import java.util.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;



public class App {
	public static int ca,i,j,opc,ban;
	public static double[][]ma;
	public static double lb,lts;
	public static double subtotal=0.0;
	public static double Iva=0.0;
	public static Compra d= new Compra();
	public static Scanner s=new Scanner(System.in);
	public static ArrayList<Compra> pol = new ArrayList<Compra>();
    public static String nombre,apellido;
    
    
	public static void main(String args[])throws IOException{

		FileWriter fac = new FileWriter("C:\\Users\\JADPA-30\\Desktop\\ProyectoFinal\\ProyectoFinal\\Factura.txt");
		
	Productos cal= new Valor();
	

	ma=new double[2][10];
	
	
	System.out.println("Bienvenido a la 'queseria de mi sin ti' ");
	System.out.println("Ingrese su primer nombre y primer apellido");
	System.out.println("Ingrese su nombre:");
	nombre= s.next();
	System.out.println("Ingrese su apellido:");
	apellido= s.next();
	System.out.println(" ");
	
	System.out.println("Bienvenid@ "+nombre +" "+ apellido);
	System.out.println("Le ofrecemos los siguientes tipos de quesos: ");
	System.out.println("1.- Queso Seco" + "\n2.- Queso Mozarrella" + "\n3.- Queso Crema"  +  "\n4.- Queso Amarillo" +  "\n5.- Queso Quesillo" +  "\n6.- Lecheagria "+"\n7.- Cuajada");
	   System.out.println(" ");

	
	
	do{System.out.println("¿Cuantos productos desea llevar?");
	while(!s.hasNextInt()) {s.next();System.out.println("Ingresar solo numeros");}
	ca=s.nextInt();
	}while(ca<1 || ca>7);

	for(i=0;i<ca; i++){do{d.menu();
	while(!s.hasNextInt()) {s.next();System.out.println("Ingresar solo numeros");}

	opc=s.nextInt();}while(opc<1 || opc>7);;

	          switch(opc){
		case 1:{do{System.out.println("¿Cuantas libras de queso Seco desea llevar?"); 
		while(!s.hasNextInt()) {s.next();System.out.println("Ingresar solo numeros");}

			ma[0][i]=s.nextDouble();}while(ma[0][i]<0.5);
			ma[1][i]=cal.QuesoSeco(ma[0][i]);
			}break;

		case 2:{do{System.out.println("¿Cuantas libras de queso Mozarrella desea llevar?"); 
		while(!s.hasNextInt()) {s.next();System.out.println("Ingresar solo numeros");}

			ma[0][i]=s.nextDouble();}while(ma[0][i]<0.5);
			ma[1][i]=cal.QuesoMozarrella(ma[0][i]);
			}break;
		case 3:{do{System.out.println("¿Cuantas libras de queso crema desea llevar?"); 
		while(!s.hasNextInt()) {s.next();System.out.println("Ingresar solo numeros");}

			ma[0][i]=s.nextDouble();}while(ma[0][i]<0.5);
			ma[1][i]=cal.QuesoCrema(ma[0][i]);
			}break;
		case 4:{do{System.out.println("¿Cuantas libras de queso amarillo desea llevar?"); 
		while(!s.hasNextInt()) {s.next();System.out.println("Ingresar solo numeros");}

			ma[0][i]=s.nextDouble();}while(ma[0][i]<0.5);
			ma[1][i]=cal.QuesoAmarillo(ma[0][i]);
			}break;
		case 5:{do{System.out.println("¿Cuantas libras de queso quesillo desea llevar?"); 
		while(!s.hasNextInt()) {s.next();System.out.println("Ingresar solo numeros");}

			ma[0][i]=s.nextDouble();}while(ma[0][i]<0.5);
			ma[1][i]=cal.Quesoquesillo(ma[0][i]);
			}break;
		case 6:{do{System.out.println("¿Cuantas litros de lecheagria desea llevar?"); 
		while(!s.hasNextInt()) {s.next();System.out.println("Ingresar solo numeros");}

			ma[0][i]=s.nextDouble();}while(ma[0][i]<0.5);
			ma[1][i]=cal.Lecheagria(ma[0][i]);
			}break;
		case 7:{do{System.out.println("¿Cuantas libras de cuajada desea llevar?"); 
		while(!s.hasNextInt()) {s.next();System.out.println("Ingresar solo numeros");}

			ma[0][i]=s.nextDouble();}while(ma[0][i]<0.5);
			ma[1][i]=cal.Cuajada(ma[0][i]);
			}
		}



	}
	
	
	
	System.out.println(" ");
	System.out.println("             Queseria de mi sin ti            ");
	System.out.println(" ");
	System.out.println("Factura de compra.");
	System.out.println("Cliente: "+nombre+" "+apellido);
	System.out.println("----------------------------------------------");


	System.out.println("Productos \n"+"\t"+"\tcantidad"+"\t"+"Precio");
	
	
	for(i=0;i<ca;i++){
	System.out.print("Producto "+(i+1));
		for(j=0;j<2;j++){
	System.out.print("\t"+ma[j][i]+"\t");
	}System.out.println();
	}

	for(i=0;i<ca;i++){
	subtotal=subtotal+ma[1][i];
	}
	Iva=subtotal*0.15;
	
	
	System.out.println("\nSubtotal= "+subtotal);
	System.out.println("Iva= "+Iva);
	System.out.println("Total= "+(Iva+subtotal));
	System.out.println("----------------------------------------------");

	System.out.println("\n"+"\tGracias por su compra.");
	
	
	//Archivo guardar
	
	fac.write("             Queseria de mi sin ti            ");
	fac.write("\n ");
	fac.write("\nFactura de compra. ");
	fac.write("\nCliente: "+nombre+" "+apellido);
	fac.write("\n---------------------------------------------- ");
	fac.write("\nProductos \n"+"\t"+"\tcantidad"+"\t"+"Precio");
    fac.write("\nSubtotal: "+subtotal);
    fac.write("\nIva= "+Iva);
    fac.write("\nTotal= "+(Iva+subtotal));
    fac.write("\n----------------------------------------------");
    fac.write("\n"+"\tGracias por su compra.");
    
fac.close();
	
	}


	}


