import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class prueba1 {

    public static void main(String[] args) {
        
        System.out.println("hola");
        int x=2;
        System.out.println("Tenemos que x vale: "+x);
        int y=333;
        System.out.println("Tenemos que y vale: "+y);
        int z=x+y;
        System.out.println("La suma de ambos es de: "+z);
    }
    //System.out.println("hola");

    public static int suma(int x, int y){

        int sum=x+y;
        return sum;
    }

    @Test
    public void testprueba1(){

        assertEquals(336, suma(3,333));
        assertEquals(4, suma(2,2));
    }
}
