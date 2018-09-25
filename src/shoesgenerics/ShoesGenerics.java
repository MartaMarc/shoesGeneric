
package shoesgenerics;

public class ShoesGenerics {

    
    public static void main(String[] args) {
          
Shoes<FlipFlops> flip = new Shoes<>(new FlipFlops());
   Shoes<HighHeels> high = new Shoes<>(new HighHeels()); 
    Shoes<Sneakers> sneak= new Shoes<>(new Sneakers());
    
   // flip.sayMyName();
   // high.sayMyName();
   // sneak.sayMyName();
    
    
}
}

   

class FlipFlops{

    FlipFlops(){
    System.out.println("Im a flip flop. ");
    }
    
    }
    
class HighHeels{
    
    HighHeels(){
    System.out.println("Im a high heel. ");
    }
    
}
    
    
class Sneakers{
    
    Sneakers(){
    System.out.println("Im a sneaker. ");
    }
}


class Shoes<T>{
     public T shoe;
     
    Shoes(T shoe){
        this.shoe=shoe;
    }
    
    void sayMyName(){
        
        System.out.println( "Im a shoe. ");
    }
} 
    
    

