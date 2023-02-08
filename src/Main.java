public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicios de Retornos");
        double areaQuadrado = Retornos.area(9);
        System.out.println("A area do Quadrado e: " + areaQuadrado);
    
        Double areaTrapezio = Retornos.area(7,8,9);
        System.out.println("A area do Trapezio e: " + areaTrapezio);

        double areaRetangulo = Retornos.area(7,9);
        System.out.println("A area do Retangulo e: "+ areaRetangulo);

    }
}
