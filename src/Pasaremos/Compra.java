package Pasaremos;

public class Compra {
	
		   double lb, litros;
		   double [][]Ma;
		   public Compra(){}

		   public Compra(double litros, double lb){
		     this.litros=litros;
		     this.lb=lb;
		   }

		   public void setlb(double lb){this.lb=lb;}

		   public double getlb(){return lb;}

		  public void setlitros(double litros){this.litros=litros;}
		 
		  public double getlitros(){return litros;}

		   public void menu(){
			 
						
			System.out.println("¿Que Producto desea llevar?");
		     System.out.println("1.- Queso Seco" + "\n2.- Queso Mozarrella" + "\n3.- Queso Crema"  +  "\n4.- Queso Amarillo" +  "\n5.- Queso Quesillo" +  "\n6.-Lecheagria "+"\n7.-Cuajada");
		     
					
		   }

		
}
