class Recurtion19{

    public static int callGest(int n){
        
        if(n<=1){

            return 1;
}
        //gest in single ways
        int ways1=callGest(n-1);
        //gest in pair ways
        int ways2=(n-1)*callGest(n-2);
        return ways1+ways2;
    }

    public static void main(String args[]){
     int n=4;//ager patri me 1,2,3,4, gest hai to akele akele charo ya pair ke rup me kitni ways se aa sakte hai ka combinatio output me hai
     int totalways =callGest(n);
     System.out.println(totalways);


    }
}