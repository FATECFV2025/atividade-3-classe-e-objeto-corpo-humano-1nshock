package Main.Java;

public class corpohumano {
    private double massa;
    private double altura;
    private double densidade;
    private double volume;

    // Construtor
    public corpohumano(double massa, double altura) {
        this.massa = massa;
        this.altura = altura;
        this.densidade = calcularDensidade();  
        this.volume = calcularVolume(); 
    }
    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
        this.densidade = calcularDensidade(); 
        this.volume = calcularVolume(); 
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        this.densidade = calcularDensidade();
        this.volume = calcularVolume(); 
    }

    
    private double calcularDensidade() {
        if (altura != 0) {
            return massa / (altura * altura);  // D = massa / pela altura elavado a 2
        } else {
            return 0; 
        }
    }

    private double calcularVolume() {
        if (densidade != 0) {
            return massa / densidade;  // volume = massa / Densidade
        } else {
            return 0;  
        }
    }

    public double getDensidade() {
        return densidade;
    }

    public double getVolume() {
        return volume;
    }

 
    public double calcularIMC() {
        if (altura != 0) {
            return massa / (altura * altura); 
        } else {
            return 0;  
        }
    }
}
