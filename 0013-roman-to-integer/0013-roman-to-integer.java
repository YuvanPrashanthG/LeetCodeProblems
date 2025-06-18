class Solution {
    public int romanToInt(String s) {
        char in[]=s.toCharArray();
        int sum =0;
        switch (in[in.length-1])
            {
                case 'I':
                {

                    sum=sum+1;
                    break;

                }
                 case 'V':
                {
                   sum +=5;
                   break;   
                }
                 case 'X':
                {
                    
                    sum=sum+10;
                    break;
                }
                 case 'L':
                {
                    sum += 50;
                    break;
                }
                 case 'C':
                {
                    
                    sum=sum+100;
                   break;
                    
                }
                 case 'D':
                {
                    sum=sum+500;
                    break;
                }
                 case 'M':
                {
                    sum=sum+1000;
                    break;
                }
            }

        for (int i=in.length-2;i>=0;i--)
        {
            switch (in[i])
            {
                case 'I':
                {
                   if(in[i+1]=='V'||in[i+1]=='X') 
                   {
                    sum -=1;
                   }
                   else{
                    sum=sum+1;
                   }
                   break;

                }
                 case 'V':
                {
                   sum +=5;
                   break;   
                }
                 case 'X':
                {
                    if(in[i+1]=='L'||in[i+1]=='C') 
                   {
                    sum -=10;
                   }
                   else{
                    sum=sum+10;
                   }
                    break;
                }
                 case 'L':
                {
                    sum += 50;
                    break;
                }
                 case 'C':
                {
                    if(in[i+1]=='D'||in[i+1]=='M') 
                   {
                    sum -=100;
                   }
                   else{
                    sum=sum+100;
                   }
                   break;
                    
                }
                 case 'D':
                {
                    sum=sum+500;
                    break;
                }
                 case 'M':
                {
                    sum=sum+1000;
                    break;
                }
            }
        }
    return sum;
        
    }
}