package Tema_5;

public class Persoona {
	
	private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    
    private int generarDNI() {
    	return 0;
    }
    
    public Persoona() {
    	this.nombre = "";
    	this.edad = 0;
    	this.dni = generarDNI();
    	this.sexo ='H';
    	this.peso = 0.0;
    	this.altura = 0.0;
    }
  
    public Persoona (String nombre, int edad, char sexo) {
    	this.nombre = nombre;
    	this.edad = 0;
    	this.sexo = sexo;
    	this.dni = generarDNI;
    	this.peso = 0.0;
    	this.altura = 0.0;
}
    public Persoona (String nombre, int edad, int dni, char sexo, double peso, double altura) {
    	this.nombre = nombre;
    	this.edad = 0;
    	this.sexo = sexo;
    	this.dni = dni;
    	this.peso = peso;
    	this.altura = altura;
}
    public String getNombre () {
    	return nombre;
    }
    public void setNombre (String nombre) {
    	this.nombre = nombre;
    }
    public int getEdad () {
    	return edad;
    }
    public void setEdad (int edad) {
    	this.edad = edad;
    	
    }
    public char getSexo () {
    	return sexo;
    }    
    public char setSexo (char sexo) {
    	this.sexo = sexo;
    }  
    public double getPeso () {
    	return peso;
    }
    public void setPeso (double peso) {	
    	this.peso = peso;
    }
    public double getAltura () {
    	return altura;
    }
    public void setEdad (double altura) {
    	this.altura = altura;
    	
    }
    public int calcularIMC () {
    	double imc = this.peso/(Math.pow(this.altura, 2));
    int resultado = -1;
    if (imc < 20) {
    	resultado = -1;
    	//return -1;
    }else if(imc >= 20 && imc <= 25){
    	//resultado = 0;
    	return 0;
    }else {
    	//resultado = +1;
    	return +1;
    }
    //return resultad;
    }
    public boolean esMayorDeEdad() {
    	if (this.edad>=18) {
    		return true;
    	}else {
    		return false;
    	}
    }
    private boolean comprobarSexo (char sexo) {
    	String sexo2 = sexo+"";
    	if (sexo2.compareTo('H') == 0) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    
}


