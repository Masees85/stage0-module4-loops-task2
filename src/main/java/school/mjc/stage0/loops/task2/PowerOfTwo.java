package school.mjc.stage0.loops.task2;

public class PowerOfTwo 

{
    public void printPower(int power) 
    
    {
        
         int base = 2;
        int result = 1;
        
        while (power != 0) {
            result = result * base;
           
            power--;
            System.out.println(result);
        }

    }
}
