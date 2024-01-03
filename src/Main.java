public class Main {

    public static void main(String[] args){
        String nome = "Triangolo";
        String nome1 = "Quadrato";
        String nome2 = "Rettangolo";

        Forma triangolo = ShapeFactory.getForma(nome);
        Forma quadrato = ShapeFactory.getForma(nome1);
        Forma rettangolo = ShapeFactory.getForma(nome2);

        System.out.println("Forma: " + triangolo);
        System.out.println("Forma: " + quadrato);
        System.out.println("Forma: " + rettangolo);
    }
}