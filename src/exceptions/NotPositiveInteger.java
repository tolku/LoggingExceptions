package exceptions;

public class NotPositiveInteger extends Exception{
    String def;
    public NotPositiveInteger(String xc){
        def = xc;
    }
    public String toString(){
        return def;
    }
}
