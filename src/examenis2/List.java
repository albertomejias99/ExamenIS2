package examenis2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List implements Component{
    private final String name;
    private java.util.List<Component> list = new ArrayList<>();

    public List(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getCategory() {
        return name;
    }
    
    @Override
    public void mark() {
        for (Component c : list) {
            c.mark();
        }
    }
    
    public void add(Component component){
        list.add(component);
    }
    
    public void remove(Component component){
        list.remove(component);
    }
    
    public void sort(String flag){
        if(flag == "alfabetico"){
            System.out.println("Ordenando " + this.getName() + " alfabéticamente.");
            Collections.sort(list, new Comparator<Component>() {
                @Override
                public int compare(Component o1, Component o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            imprime(flag);
            System.out.println(this.getName()+ " ordenado.");
        }else if (flag == "categoria"){
            System.out.println("Ordenando " + this.getName() + " por categorías.");
            Collections.sort(list, new Comparator<Component>() {
                @Override
                public int compare(Component o1, Component o2) {
                    return o1.getCategory().compareTo(o2.getCategory());
                }
            });
            imprime(flag);
            System.out.println(this.getName()+ " ordenado.");
        }
    }

    private void imprime(String flag) {
        for (Component c : list) {
            c.sort(flag);
        }
    }



}
