package Practice;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class Reverse3rdString {
 public static void main(String[] args) {
     
     String str = "Vishal Manohar Wani";
     
     String [] arr = str.split(" ");
     int revIndex = 2;
     String rev= "", str2="";
     for (int i=0;i<arr.length;i++){
         if(i==2){
             
             char ch;
            for(int j=0;j<arr[2].length();j++){
               ch = arr[2].charAt(j);
               rev = ch+rev;
            } 
         }
         
     }
     System.out.println(arr[0]+" "+arr[1]+" "+rev);
     
     
 }
}
