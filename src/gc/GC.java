package gc;
public class GC
{

    public static void main(String[] args)
    {
        GC t = new GC();
        t=null;
        System.gc();
      
        
        //System.out.println("tets");
    }
    public void finalize()
    {
        System.out.println("Garbage Collected");
    }
}