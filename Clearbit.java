class Clearbit{

public static void main(String args[]){

int n=5;
int pos = 2;
int bitMask = 1<<pos ; //bitmask is 0100

int notBitMask = ~(bitMask);

int newNumber = notBitMask & n;
 System.out.println(newNumber);    //output volue is 1 that is in decinal we convert it into binary number then it is equal to 0001
                                  // it mean 5 that is 0101 we clear at 3 rd position and output = 0001 by clear bit .

}

}