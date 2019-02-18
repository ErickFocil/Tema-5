package tema5;

public class computadora {
    private int valor;
    public static int contador;

    public computadora() {
        contador++;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public static void ImprimeValor(){
        System.out.println(contador);
    }
}
