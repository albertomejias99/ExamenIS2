package examenis2;

public interface Component{
    public void mark();
    public void sort(String flag);
    
    //Estos dos getters los declaro en la interfaz para poder invocarlos sin
    //la necesidad de instanciar un objeto de tipo Product o List
    public String getName();
    public String getCategory();
}
