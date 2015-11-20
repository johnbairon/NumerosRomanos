package Romanos;

import static org.junit.Assert.*;

import org.junit.Test;


public class NumerosRomanosTest {
	String romano;
	NumerosRomanos nr;
	@Test
	public void convertirUno() {
		nr= new NumerosRomanos();
		romano=nr.convertir(1);
		assertEquals("I", romano);
	}

	@Test
	public void convertirDos() {
		nr= new NumerosRomanos();
		romano=nr.convertir(2);
		assertEquals("II", romano);
	}

	@Test
	public void convertirTres() {
		nr= new NumerosRomanos();
		romano=nr.convertir(3);
		assertEquals("III", romano);
	}
	
	@Test
	public void convertirCuatro() {
		nr= new NumerosRomanos();
		romano=nr.convertir(4);
		assertEquals("IV", romano);
	}

	@Test
	public void convertirCinco() {
		nr= new NumerosRomanos();
		romano=nr.convertir(5);
		assertEquals("V", romano);
	}
	
	@Test
	public void convertirSeis() {
		nr= new NumerosRomanos();
		romano=nr.convertir(6);
		assertEquals("VI", romano);
	}
	
	@Test
	public void convertirSiete() {
		nr= new NumerosRomanos();
		romano=nr.convertir(7);
		assertEquals("VII", romano);
	}
	
	@Test
	public void convertirOcho() {
		nr= new NumerosRomanos();
		romano=nr.convertir(8);
		assertEquals("VIII", romano);
	}
	
	@Test
	public void convertirNueve() {
		nr= new NumerosRomanos();
		romano=nr.convertir(9);
		assertEquals("IX", romano);
	}
	
	@Test
	public void convertirDiez() {
		nr= new NumerosRomanos();
		romano=nr.convertir(10);
		assertEquals("X", romano);
	}
	
	@Test
	public void convertirOnce() {
		nr= new NumerosRomanos();
		romano=nr.convertir(11);
		assertEquals("XI", romano);
	}
	
	@Test
	public void convertirDoce() {
		nr= new NumerosRomanos();
		romano=nr.convertir(12);
		assertEquals("XII", romano);
	}
	
	@Test
	public void convertirTrece() {
		nr= new NumerosRomanos();
		romano=nr.convertir(13);
		assertEquals("XIII", romano);
	}
	
	@Test
	public void convertirCatorce() {
		nr= new NumerosRomanos();
		romano=nr.convertir(14);
		assertEquals("XIV", romano);
	}
	
	@Test
	public void convertirQuince() {
		nr= new NumerosRomanos();
		romano=nr.convertir(15);
		assertEquals("XV", romano);
	}
	
	@Test
	public void convertirDieciseis() {
		nr= new NumerosRomanos();
		romano=nr.convertir(16);
		assertEquals("XVI", romano);
	}
	
	@Test
	public void convertirDiecisiete() {
		nr= new NumerosRomanos();
		romano=nr.convertir(17);
		assertEquals("XVII", romano);
	}

	@Test
	public void convertirDieciocho() {
		nr= new NumerosRomanos();
		romano=nr.convertir(18);
		assertEquals("XVIII", romano);
	}
	
	@Test
	public void convertirDiecinueve() {
		nr= new NumerosRomanos();
		romano=nr.convertir(19);
		assertEquals("XIX", romano);
	}
	
	@Test
	public void convertirVeinte() {
		nr= new NumerosRomanos();
		romano=nr.convertir(20);
		assertEquals("XX", romano);
	}
	
	@Test
	public void convertirTreinta() {
		nr= new NumerosRomanos();
		romano=nr.convertir(30);
		assertEquals("XXX", romano);
	}
	
	@Test
	public void convertirCuarenta() {
		nr= new NumerosRomanos();
		romano=nr.convertir(40);
		assertEquals("XL", romano);
	}
	
	@Test
	public void convertirCincuenta() {
		nr= new NumerosRomanos();
		romano=nr.convertir(50);
		assertEquals("L", romano);
	}
	
	@Test
	public void convertirSesenta() {
		nr= new NumerosRomanos();
		romano=nr.convertir(60);
		assertEquals("LX", romano);
	}
	
	@Test
	public void convertirSetenta() {
		nr= new NumerosRomanos();
		romano=nr.convertir(70);
		assertEquals("LXX", romano);
	}
	
	@Test
	public void convertirOchenta() {
		nr= new NumerosRomanos();
		romano=nr.convertir(80);
		assertEquals("LXXX", romano);
	}
	
	@Test
	public void convertirNoventa() {
		nr= new NumerosRomanos();
		romano=nr.convertir(90);
		assertEquals("XC", romano);
	}
	
	@Test
	public void convertirCien() {
		nr= new NumerosRomanos();
		romano=nr.convertir(100);
		assertEquals("C", romano);
	}
	
	@Test
	public void convertirDoscientos() {
		nr= new NumerosRomanos();
		romano=nr.convertir(200);
		assertEquals("CC", romano);
	}
	
	@Test
	public void convertirTrescientos() {
		nr= new NumerosRomanos();
		romano=nr.convertir(300);
		assertEquals("CCC", romano);
	}
	
	@Test
	public void convertirCuatrocientos() {
		nr= new NumerosRomanos();
		romano=nr.convertir(400);
		assertEquals("CD", romano);
	}
	
	@Test
	public void convertirQuinientos() {
		nr= new NumerosRomanos();
		romano=nr.convertir(500);
		assertEquals("D", romano);
	}
	
	@Test
	public void convertirSeiscientos() {
		nr= new NumerosRomanos();
		romano=nr.convertir(600);
		assertEquals("DC", romano);
	}
	
	@Test
	public void convertirSetecientos() {
		nr= new NumerosRomanos();
		romano=nr.convertir(700);
		assertEquals("DCC", romano);
	}
	
	@Test
	public void convertirOchocientos() {
		nr= new NumerosRomanos();
		romano=nr.convertir(800);
		assertEquals("DCCC", romano);
	}
	
	@Test
	public void convertirNovecientos() {
		nr= new NumerosRomanos();
		romano=nr.convertir(900);
		assertEquals("CM", romano);
	}
	
	@Test
	public void convertirMil() {
		nr= new NumerosRomanos();
		romano=nr.convertir(1000);
		assertEquals("M", romano);
	}
}
