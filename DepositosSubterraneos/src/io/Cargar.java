package io;

public class Cargar {

	Deposito vec[];
	double volumenPetroleo;
	
	public Cargar(Deposito[] vec, double volumenPetroleo) {
		this.vec = vec;
		this.volumenPetroleo = volumenPetroleo;
	}
	
	public int[] cargarPetroleo(){

		double volumenPotencial = 0, profMax, profHasta;
		
		for(Deposito d: this.vec) //Calculo el volumen total potencial que puedo albergar en los depositos
			volumenPotencial += d.profundidad * d.superficie;
		
		if(volumenPotencial < this.volumenPetroleo) //Caso revalsa
			return new int[] {(int)(this.volumenPetroleo - volumenPotencial)};
		
		while(this.volumenPetroleo > 0){
			
			int j = 0;
			profMax = this.vec[0].profundidad;
			while(j < this.vec.length && this.vec[j].profundidad == profMax)
				j++;
			if(j == this.vec.length)
				profHasta = 0;
			else
				profHasta = this.vec[j].profundidad;
			
			calcularVol(this,profMax,profHasta);
		}
		int cant = 0;
		for(Deposito d:this.vec)
			cant += (d.volPetAct == 0) ? 0 : 1;

		return new int[] {cant , (int)this.vec[0].profundidad};
	}
	
	private static void calcularVol(Cargar carga, double profMax, double profHasta){
		
		double sumaSup = 0;
		double volPotencial = 0;
		
		for(int i = 0; i < carga.vec.length; i++)
			if(carga.vec[i].profundidad == profMax){
				sumaSup += carga.vec[i].superficie;
				volPotencial += (profMax - profHasta) * carga.vec[i].superficie;
			}
		
		if(volPotencial < carga.volumenPetroleo){
			for(Deposito d: carga.vec){
				if(d.profundidad == profMax){
					d.profundidad = profHasta;
					d.volPetAct += volPotencial;
				}
			}
		}
		else{
			double alt = carga.volumenPetroleo / sumaSup;
			for(Deposito d: carga.vec){
				if(d.profundidad == profMax){
					d.profundidad = profMax - alt;
					d.volPetAct += alt * d.superficie;
				}
			}
		}
		carga.volumenPetroleo -= volPotencial;
	}
	
}
