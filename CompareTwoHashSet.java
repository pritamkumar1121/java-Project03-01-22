import java.util.HashSet;
 
public class CompareTwoHashSet {
 
    public static void main(String[] args) {
        
     
        HashSet<Integer> hSet1 = new HashSet<Integer>();
        
        hSet1.add(1);
        hSet1.add(2);
        hSet1.add(3);
        
     
        HashSet<Integer> hSet2 = new HashSet<Integer>();
        
        hSet2.add(3);
        hSet2.add(2);
        hSet2.add(1);
        
        System.out.println( "Equal? " + hSet1.equals(hSet2) );
        
  
        hSet1.remove(2);
        
        System.out.println( "Equal? " + hSet1.equals(hSet2) );
    }
}