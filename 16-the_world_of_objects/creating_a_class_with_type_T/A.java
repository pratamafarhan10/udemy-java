public class A<T> {
    private T attr;

    public void add(T attr){
        this.attr = attr;
    }

    public T getAttr(){
        return this.attr;
    }
}
