/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_unidad01_villa.sarmiento.saquicela;

/**
 *
 * @author PC-2
 */
public class Poo_unidad01_villaSarmientoSaquicela {

    public static void main(String[] args) {
        //Perros
        var perro1 = new Perro();
        var perro2 = new Perro();
        var perro3 = new Perro();
        
        perro1.edad = 2;
        perro1.nombre = "Cesar";
        perro1.raza = "Chiguagua";
        perro1.pedigri = true;
        
        perro2.edad = 12;
        perro2.nombre = "Pipo";
        perro2.raza = "snow";
        perro2.pedigri = true;
        
        perro3.edad = 7;
        perro3.nombre = "Kuchau";
        perro3.raza = "grandanes";
        perro3.pedigri = false;
        
        //Carros
        var carro1 = new Auto();
        var carro2 = new Auto();
        var carro3 = new Auto();

        carro1.an = 2019;
        carro1.marca = "datsun";
        carro1.placa = "ABC-1234";
        carro1.color = "Negro";
                
                
                
        carro2.an = 2022;
        carro2.marca = "Chevrolet";
        carro2.placa = "GBO-4321";
        carro2.color = "Azul"; 
        
        
        carro3.an = 2011;
        carro3.marca = "Toyota";
        carro3.placa = "PJG-6787";
        carro3.color = "Blanco";
        

        //Personas    
        var persona1 = new Persona();
        var persona2 = new Persona();
        var persona3 = new Persona();

        persona1.nombre = "Erika";
        persona1.edad = 21;
        persona1.cedula = "0106519937";
        persona1.estudiante = true;

        persona2.nombre = "Jonnathan";
        persona2.edad = 20;
        persona2.cedula = "0107864278";
        persona2.estudiante = false;
        
        persona3.nombre = "Cesar";
        persona3.edad = 22;
        persona3.cedula = "0129780975";
        persona3.estudiante = true;
        
        var compu1 = new Computador();
        var compu2 = new Computador();
        var compu3 = new Computador();

        compu1.marca = "ASUS";
        compu1.modelo = "Core i7 ";
        compu1.capacidad = 64;
        compu1.generacion = 7;
        
        compu2.marca = "DELL";
        compu2.modelo = "Core i5 ";
        compu2.capacidad = 36;
        compu2.generacion = 9;
        

        compu3.marca = "SONY";
        compu3.modelo = "Core i7 ";
        compu3.capacidad = 84;
        compu3.generacion = 11;
        
        //Asignatura
        var programacion = new Asignatura();
        var calculo = new Asignatura();
        var algebra = new Asignatura();

        programacion.codigo = 1;
        programacion.materia = "Programacion ";
        programacion.nombreDocente = "Jaime Ortiz";
        programacion.horas = 160;
        programacion.precioHora = 3.5;

        calculo.codigo = 2;
        calculo.materia = "Calculo ";
        calculo.nombreDocente = "Patricio Morquecho";
        calculo.horas = 200;
        calculo.precioHora = 3.0;

        algebra.codigo = 3;
        algebra.materia = "Estadistica";
        algebra.nombreDocente = "Juan Perez";
        algebra.horas = 250;
        algebra.precioHora = 2.7;
        
        //Peliculas
        var pelicula1 = new Peliculas();
        var pelicula2 = new Peliculas();
        var pelicula3 = new Peliculas();

        pelicula1.codigo = "05-75";
        pelicula1.duracion = 138.75;
        pelicula1.genero = "Acción";
        pelicula1.nombre = "Transformer";
        
                
        pelicula2.codigo = "02-44";
        pelicula2.duracion = 150.69;
        pelicula2.genero = "Terror";
        pelicula2.nombre = "Saw 8";
        
        
        pelicula3.codigo = "42-69";
        pelicula3.duracion = 120.60;
        pelicula3.genero = "Comedia";
        pelicula3.nombre = "Son como niños";

//----Seccion impresa ------        
        //Perros
        System.out.println("El perro uno se llama: " + perro1.nombre +
                "y tiene una edad de: " + perro1.edad + "años " +
                " y su raza es:"+ perro1.raza);
        
        System.out.println("El perro dos se llama: " + perro2.nombre +
                "y tiene una edad de: " + perro2.edad + "años " +
                " y su raza es:"+ perro2.raza);
        
        System.out.println("El perro tres se llama: " + perro3.nombre +
                "y tiene una edad de: " + perro3.edad + "años " +
                " y su raza es: " + perro3.raza);
    
        //Carros \
        System.out.println("\nCarros:");
        System.out.println("El carro 1 es del año: " + carro1.an +
                "; su marca es:  " + carro1.marca + "; placa: " + carro1.placa
                + " y su color es: "+ carro1.color);        
        System.out.println("El carro 2 es del año: " + carro2.an +
                "; su marca es:  " + carro2.marca + "; placa: " + carro2.placa
                + " y su color es: "+ carro2.color);        
        System.out.println("El carro 3 es del año: " + carro3.an +
                "; su marca es:  " + carro3.marca + "; placa: " + carro3.placa
                + " y su color es: "+ carro3.color);
        
        //Computadora \ 
        System.out.println("\nComputadoras:");
        System.out.println("Marca del computado 1:  " + compu1.marca +
                "; modelo es:  " + compu1.modelo + "; tiene una capacidad: "
                + compu1.capacidad + " y su generación es: "+ compu1.generacion);        
        System.out.println("Marca del computado 1:  " + compu2.marca +
                "; modelo es:  " + compu2.modelo + "; tiene una capacidad: "
                + compu2.capacidad + " y su generación es: "+ compu2.generacion); 
        System.out.println("Marca del computado 1:  " + compu3.marca +
                "; modelo es:  " + compu3.modelo + "; tiene una capacidad: "
                + compu3.capacidad + " y su generación es: "+ compu3.generacion); 
        
        //Pelicula \ 
        System.out.println("\nPelículas: ");
        System.out.println("Código de la película 1:  " + pelicula1.codigo +
                "; género:  " + pelicula1.genero + "; nombre "
                + pelicula1.nombre + " y su duración es: "+ pelicula1.duracion);
        System.out.println("Código de la película 2:  " + pelicula2.codigo +
                "; género:  " + pelicula2.genero + "; nombre "
                + pelicula2.nombre + " y su duración es: "+ pelicula2.duracion);
        System.out.println("Código de la película 3:  " + pelicula3.codigo +
                "; género:  " + pelicula3.genero + "; nombre "
                + pelicula3.nombre + " y su duración es: "+ pelicula3.duracion);
        
        // Persona \
        System.out.println("\nPersonas: ");
        System.out.println("nombre de la persona 1:  " + persona1.nombre +
                "; edad:  " + persona1.edad + "; cédula: " + persona1.cedula
                + " estudiante: "+ persona1.estudiante);
        System.out.println("nombre de la persona 2:  " + persona2.nombre +
                "; edad:  " + persona2.edad + "; cédula: " + persona2.cedula
                + " estudiante: "+ persona2.estudiante);
        System.out.println("nombre de la persona 3:  " + persona3.nombre +
                "; edad:  " + persona3.edad + "; cédula: " + persona3.cedula
                + " estudiante: "+ persona3.estudiante);
        
        // Asignatura \
        System.out.println("\nAsignaturas: ");
        System.out.println("el código de cálculo:  " + calculo.codigo +
                " materia: " + calculo.materia + "tiene " + calculo.horas + 
                " horas" + " su docente: "+ calculo.nombreDocente + " Precio por "
                        + "hora: "+ calculo.precioHora);
        System.out.println("el código de programació:  " + programacion.codigo +
                " materia: " + programacion.materia + "tiene " + programacion.horas + 
                " horas" + " su docente: "+ programacion.nombreDocente + " Precio por"
                        + "hora: "+ programacion.precioHora);
        System.out.println("el código de algebra:  " + algebra.codigo +
                " materia: " + algebra.materia + "tiene " + algebra.horas + 
                " horas" + " su docente: "+ algebra.nombreDocente + " Precio por "
                        + "hora: "+ algebra.precioHora);
    }
}
