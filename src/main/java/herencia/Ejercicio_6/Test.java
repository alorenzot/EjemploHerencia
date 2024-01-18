package herencia.Ejercicio_6;

public class Test {
    public static void main(String[] args) {
        String color = "Azul";
        Forma[] formas = new Forma[5];
        for (int i = 0; i < formas.length; i++) {
            int randomShape = (int) (Math.random() * 4 + 1);
            switch (randomShape) {
                case 1:
                    float randomRadius = (float) (Math.random() * 10);
                    formas[i] = new Circulo('○', Punto.getPuntoAleatorio(), color, randomRadius, randomRadius);
                    break;
                case 2:
                    float randomLowerRadius = (float) (Math.random() * 10);
                    float randomHigherRadius = (float) (Math.random() * 10);
                    formas[i] = new Elipse('⬭', Punto.getPuntoAleatorio(), color, randomLowerRadius, randomHigherRadius);
                    break;
                case 3:
                    float randomSide = (float) (Math.random() * 10);
                    formas[i] = new Cuadrado('□', Punto.getPuntoAleatorio(), color, randomSide, randomSide);
                    break;
                default:
                    float randomLowerSide = (float) (Math.random() * 10);
                    float randomHigherSide = (float) (Math.random() * 10);
                    formas[i] = new Rectangulo('▭', Punto.getPuntoAleatorio(), color, randomLowerSide, randomHigherSide);
                    break;
            }
        }
        for (Forma f : formas) {
            System.out.println(f);
        }


    }


}
