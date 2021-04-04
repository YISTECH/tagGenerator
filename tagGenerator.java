import java.util.Scanner; //code written by YISTECH 
public  class tagGenerator {
     
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of keywords");
    int n = sc.nextInt();
  String[]array = new String[n+1];
    for (int i = 0; i < array.length; i++){
        System.out.println("enter your keyword");
    array[i] = sc.nextLine();
    
    //System.out.println(array[i]); had this for test purposes
    
}
    
 
        for (int j = 0; j < n; j++){
        System.out.println("#" + array[j] + array[j+1]);
        System.out.println("#" + array[j]);
        System.out.println("#" + array[j] + array[j]);
        System.out.println("#" + array[j+1] + array[j+1]);
        System.out.println("#" + array[j+1] + array[j]);
        
        }
        
    }
        
        
    }


