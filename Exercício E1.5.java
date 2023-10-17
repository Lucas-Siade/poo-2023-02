abstract class FormaGeometrica{
    abstract double calcularArea();
}
    
class Circulo extends FormaGeometrica{
    double raio;
    double area;
    
    Circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    double calcularArea(){
        area = Math.PI * raio * raio;
        return area;
    }
}

class Retangulo extends FormaGeometrica{
    double largura;
    double altura;
    double area;
    
    Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    double calcularArea(){
        area = largura * altura;
        return area;
    }
}

class Triangulo extends FormaGeometrica{
    double base;
    double altura;
    double area;
    
    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    double calcularArea(){
        area = (base * altura)/2;
        return area;
    }
}

public class CalculadorArea
{
    public static void main(String[] args) {
        int i;
        double areaTotal = 0;

        FormaGeometrica[] formasGeometricas = new FormaGeometrica[3];
        formasGeometricas[0] = new Circulo(2);
        formasGeometricas[1] = new Retangulo(2, 2);
        formasGeometricas[2] = new Triangulo(2, 2);
        
        for(i = 0; i < 3; i++){
            areaTotal = areaTotal + formasGeometricas[i].calcularArea();
        }

        System.out.println("Área total das formas: " + areaTotal);
    }
}
