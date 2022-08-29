package school.mjc.stage0.loops.task2;

public class PrimeNumbers 

{
    public void printPrimeNumbers(int num) 
    
    
    {
        int start =2, num=50,count, flag;
               double inum;

        while(start<=num)
        {
            inum=(Math.sqrt(start));
            count=2;
            flag=1;
            while(count<=inum)
            {
                if(start%count == 0)
                {
                    flag=0;
                    break;
                }
                count++;
            }

            if(flag!=0)
                System.out.println(start);
            start++;


        
        
       
    }
}
