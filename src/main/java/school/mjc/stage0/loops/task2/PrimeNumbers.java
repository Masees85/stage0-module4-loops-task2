package school.mjc.stage0.loops.task2;

public class PrimeNumbers 

{
    public void printPrimeNumbers(int n) 
    
    
    {
        
        int i=2;
        

        while(i<n)
        {
            if(i%i==0 && i%1==0 && i%2!=0 || i==2)
            System.out.println(i);
            i++;
        }
    }
}
