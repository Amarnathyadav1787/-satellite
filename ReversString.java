class ReversString{


    public static void main(String args[]){

StringBuilder sb = new StringBuilder("Hello");

for(int i=0;i<=sb.length()/2;i++){


int front = i;           //in front variable front index number is stor 
int back = sb.length()-1-i; //5-1-0//in back variable back index no of string is stor acctuly string are devided into two part

      char charfront = sb.charAt(front); //fron variable pass into charAt() function then front charter is stor on charfront variable
      char charback = sb.charAt(back);  //back variable pass into charAt() fun than back charecter of stringbuilder is stor on charback

 sb.setCharAt(front,charback);
 sb.setCharAt(back,charfront);


}

System.out.println(sb);


    }
}