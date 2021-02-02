package examenis2;

public class Product implements Component{
    private final String name;
    private final String category;
    private boolean marked;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void mark() {
        if(marked){
            System.out.println("El producto " + this.getName() + " ha sido desmarcado.");
            marked=false;
        }else{
            System.out.println("El producto " + this.getName() + " ha sido marcado.");
            marked=true;
        }
    }

    @Override
    public void sort(String flag) {
        if (flag == "alfabetico"){
            System.out.println("Producto: " + this.getName());
        } else {
            System.out.println("Producto: " + this.getName() + "| Categoría: " + this.getCategory());
        }
    }




    
}
