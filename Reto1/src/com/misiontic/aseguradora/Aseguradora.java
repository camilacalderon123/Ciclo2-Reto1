package com.misiontic.aseguradora;

public class Aseguradora {
	
	
	public static double liquidarPrestaciones (int salario, int diasTrabajados) {
		double primaServicios = (salario*diasTrabajados/360);
		double cesantias = (salario*diasTrabajados/360);
		double intereses = (cesantias*0.12);
		double vacaciones = (salario*diasTrabajados/720);
		double liquidacion =primaServicios+cesantias+intereses+vacaciones;
		
		double redondeo = Math.ceil(liquidacion);
		System.out.println("Prestaciones: " + redondeo);
		return redondeo;
		
	}
}
