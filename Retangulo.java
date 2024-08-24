public class Retangulo{

    //aqui eu coloco os atributos
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double CalculoArea(){
        return largura * altura;
    }

    public double CalculoPerimetro(){
        return (2*(largura+altura));
    }

    public void MostrarInformacao(){
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + CalculoArea());
        System.out.println("Perimetro: " + (CalculoPerimetro()));
    }



}