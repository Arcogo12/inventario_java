public class Inventario {
    
    
    public static int calcularValorTotal(int precio, int cantidad) {
        return precio * cantidad;
    }   
    public static void main(String[] args) {
        int precio = 50;
        int cantidad = 4;
        int valorTotal = calcularValorTotal(precio, cantidad);
        System.out.println("Subtotal: " + valorTotal);
    }
}
