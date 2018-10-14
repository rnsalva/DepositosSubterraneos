package io;

public class Deposito {

	double profundidad;
	double superficie;
	double volPetAct;
	
	public Deposito(double superficie, double profundidad, double volPetAct) {
		this.superficie = superficie;
		this.profundidad = profundidad;
		this.volPetAct = volPetAct;
	}
	
	public Deposito() {
		this.profundidad = 0;
		this.superficie = 0;
		this.volPetAct = 0;
	}
	
}
