package com.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersonaTest {
	
	private static Persona persona1;
	private static Persona persona2;
	private static Persona persona3;
	private static Persona persona4;
	private static Persona persona5;
	
	@BeforeAll
	public static void setup() {
		persona1=new Persona();
		persona2=new Persona("Ignacio", 20, 'H');
		persona3=new Persona("Jesús", 18, 'H', 80, 1.9);
		persona4=new Persona("Hola", 2, 'M');
		persona5=new Persona("Adiós", 4, 'J');
	}

	@Test
	void testPersona() {
		assertEquals("",persona1.getNombre());
		assertEquals(0,persona1.getEdad());
		assertEquals('H',persona1.getSexo());
		assertEquals(0,persona1.getPeso());
		assertEquals(0,persona1.getAltura());
	}

	@Test
	void testPersonaStringIntChar() {
		assertEquals("Ignacio",persona2.getNombre());
		assertEquals(20,persona2.getEdad());
		assertEquals('H',persona2.getSexo());
		
		assertEquals('M',persona4.getSexo());
		assertEquals('H',persona5.getSexo());
	}

	@Test
	void testPersonaStringIntCharDoubleDouble() {
		assertEquals("Jesús",persona3.getNombre());
		assertEquals(18,persona3.getEdad());
		assertEquals('H',persona3.getSexo());
		assertEquals(80,persona3.getPeso());
		assertEquals(1.9,persona3.getAltura());
	}

	@Test
	void testSetNombre() {
		persona1.setNombre("a");
		assertEquals("a",persona1.getNombre());
	}

	@Test
	void testSetEdad() {
		persona1.setEdad(1);
		assertEquals(1,persona1.getEdad());
	}

	@Test
	void testSetSexo() {
		persona1.setSexo('M');
		assertEquals('M',persona1.getSexo());
	}

	@Test
	void testSetPeso() {
		persona1.setPeso(40);
		assertEquals(40,persona1.getPeso());
	}

	@Test
	void testSetAltura() {
		persona1.setAltura(1.2);
		assertEquals(1.2,persona1.getAltura());
	}

	@Test
	void testCalcularIMC() {
		fail("Not yet implemented");
	}

	@Test
	void testEsMayorDeEdad() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
