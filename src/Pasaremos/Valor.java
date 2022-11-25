package Pasaremos;

public class Valor  implements Productos {

	    @Override
	    public double QuesoSeco(double lb){return lb*90;}
	    @Override
	    public double QuesoMozarrella(double lb){return lb*80;}
	    @Override
	    public double QuesoCrema(double lb){return lb*45;}
	    @Override
	    public double QuesoAmarillo(double lb){return lb*35;}
	    @Override
	    public double Quesoquesillo(double lb){return lb*85;}
	    @Override
	    public double Lecheagria(double litros){return litros*30; }
	    @Override
	    public double Cuajada(double lb){return lb*70;}
	
}
