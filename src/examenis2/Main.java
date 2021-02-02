package examenis2;

public class Main {
    private static final String alfabetico = "alfabetico";
    private static final String categoria = "categoria";

    public static void main(String[] args) {
        Component lechuga = new Product("lechuga","comida");        //Polimorfismo
        Product tomate = new Product("tomate", "comida");
        Product pan = new Product("pan","comida");
        Product libro1 = new Product("Harry Potter", "libros");
        Product libro2 = new Product("El Señor de los Anillos","libros");
        Product libro3 = new Product("Las Cronincas de Narnia","libros");
        Product botas = new Product("botas","ropa");
        Product pantalon = new Product("pantalon","ropa");
        Product camiseta = new Product("camiseta","ropa");
        
        List supermercado = new List("supermercado");          
        List libros = new List("libros");
        List ropa = new List("ropa");
        List miLista = new List("Lista general");
        
        supermercado.add(lechuga);
        supermercado.add(tomate);
        supermercado.add(pan);
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        ropa.add(camiseta);
        ropa.add(pantalon);
        ropa.add(botas);
        
        supermercado.add(ropa);
        miLista.add(supermercado);
        miLista.add(libros);
        
        lechuga.mark();
        supermercado.mark();
        System.out.println("----------------------------------------------");
        
        supermercado.sort(alfabetico);      //Aquí situa ropa antes que tomate
        supermercado.sort(categoria);       //Aquí sin embargo no
        System.out.println("----------------------------------------------");
        
        miLista.sort(alfabetico);
        miLista.sort(categoria);
    }
    
}
