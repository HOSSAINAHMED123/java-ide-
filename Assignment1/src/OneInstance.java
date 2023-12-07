public class OneInstance {
     String name;
     static  OneInstance instance;

    private OneInstance(String name){
        this.name=name;
    }
    public static OneInstance getInstance(String name)
    {
        if(instance==null){
            instance=new OneInstance(name);
        }
        return instance;
    }
}
