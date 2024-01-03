public class ShapeFactory {

    public static Forma getForma(String nome){
        Forma forma = null;
        if(nome.equals("Triangolo")){
            forma = new Triangolo(nome);
        }else if(nome.equals("Quadrato")){
            forma = new Quadrato(nome);
        } else if(nome.equals("Rettangolo")){
            forma = new Rettangolo(nome);
        }
        return forma;
    }
}