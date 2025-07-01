public class Metodo1{

    //Chamada de mètodo simples
    //Void diz que não tem retorno
    static void meuMetodo(){
        System.out.println("Ola, voce chamou o metodo simples");
    }
    //Chamada de método com passagem de parametro
    public static void mostrarName(String nome){
        System.out.println("Ola"+nome+", voce esta de parabens!");

    }

    //Chamada de metodo para somar dois numeros
     public static void soma(double numero1, double numero2){
        double soma = numero1 + numero2;
        System.out.println("Soma"+soma);

    }

    //Chamada de metodo para multiplicar dois numeros com retorno
    public static double multiplicar(double  numero1, double numero2){
        double multiplica = numero1 * numero2;
        return multiplica;
    }

    public static void main(String[] args){
        System.out.println("Chamada de Metodo Simples: ");
        //Chamando o metodo(função)
        meuMetodo();

        mostrarName("Andreisse");

        soma(5, 8);

        double retorno = multiplicar(2 ,6);
        System.out.println("Retorno: "+retorno);
    }
}