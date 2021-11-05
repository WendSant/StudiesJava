
class Testes { 
    public static void main(String args[]){
        int x, z, y; 
        
        x = 4;
        z = 5;
        y = 7;

        if((x < z + y) && (z < x + y) && (y < x + z)){
           if(x == z && z == y){
               System.out.println("Forma um triângulo equilátero");
           }else{
               if(x == z || z == y || y == x){
                System.out.println("Forma um triângulo isósceles");

               }else{
                System.out.println("Forma um triângulo escaleno");
               }
           }
        }else{
            System.out.println("Não forma triangulo");
        }
        
        
    }
    
 
}