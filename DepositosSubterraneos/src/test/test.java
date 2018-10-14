package test;

import static org.junit.Assert.*;

import org.junit.Test;

import io.Cargar;
import io.Deposito;


public class test{

	@Test
	public void testEjemplo() {
		Cargar c = new Cargar(new Deposito[] {new Deposito(12,3,0), new Deposito(8,2,0), new Deposito(6,1,0)},30);
		assertArrayEquals(new int[]{2,1},c.cargarPetroleo());
	}
	
	@Test
	public void testSoloUnTanqueRevalsa(){
		Cargar c = new Cargar(new Deposito[] {new Deposito(12,3,0)},60);
		assertArrayEquals(new int[]{24},c.cargarPetroleo());
	}
	
	@Test
	public void testSoloUnTanqueNoRevalsa(){
		Cargar c = new Cargar(new Deposito[] {new Deposito(12,3,0)},20);
		assertArrayEquals(new int[]{1,1},c.cargarPetroleo());
	}
	
	@Test
	public void testVariosTanquesRevalsa(){
		Cargar c = new Cargar(new Deposito[] {new Deposito(12,3,0), new Deposito(8,2,0), new Deposito(6,1,0)},120);
		assertArrayEquals(new int[]{62},c.cargarPetroleo());
	}
	
	@Test
	public void testTodosMismaProf(){
		Cargar c = new Cargar(new Deposito[] {new Deposito(12,3,0), new Deposito(12,3,0), new Deposito(12,3,0)},30);
		assertArrayEquals(new int[]{3,2},c.cargarPetroleo());
	}
	
	@Test
	public void tesDosMismaProf(){
		Cargar c = new Cargar(new Deposito[] {new Deposito(12,3,0), new Deposito(8,2,0), new Deposito(8,2,0)},30);
		assertArrayEquals(new int[]{3,1},c.cargarPetroleo());
	}
}
