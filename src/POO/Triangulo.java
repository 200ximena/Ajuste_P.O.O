package POO;

public class Triangulo extends Figura{

    //ATRIBUTOS
    private float base;
    private float altura;

     //metodo constructor
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;

    }

    //metodos asesores 
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //metodo de la subclase
    public void calcularArea() {
        float area2=0;
        area2=(base*altura)/2;
        System.out.println("La base de su triangulo  es "+base+" su altura es "+altura+" y el área es "+area2);
    }

   
    

    
}
