package loopshape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        
        if (width < 1 || height < 1){
            System.out.println("Cannot draw shape with negative length!");
        }
        for (int i=0; i<height; i++){      
            for (int j=0; j<width; j++){
                
                if (i > 0 && i < height - 1 && j != 0 && j != width-1){
                    System.out.print(" ");
                }else {
                    System.out.print("#");
                }
                
            } 
            System.out.print("\n");
        }
        
        
    }
    
    static void createTriangle(int leg){
        System.out.println("");
        
        if(leg<1){
             System.out.println("Cannot draw shape with negative length!");
        }
        //Draw an Isosceles Right Triangle
        for(int i = 0; i<leg; i++){
            System.out.print("#");
            for(int j = 1; j<leg; j++){
                if(j != i && i < leg-1){
                    System.out.print(" ");
                }else {
                    System.out.print("#");
                }
            }
            System.out.print("\n");
        }
    }
}
