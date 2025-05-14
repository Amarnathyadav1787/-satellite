class Getbit{

    public static void main(String args[])
    {
         int n=5;       
         int pos = 1;        // binary 0101   we want to set it as 0111 by Set bit 
         int bitMask = 1<<pos;
int newNumber = bitMask | n;    // out put is seven mean in binary 7= 0111

System.out.println("New Number is  "+newNumber);
         
        
    }
}