
public class RGB{
  public static String[] reRank(String[] input){
    if(input.length==0 || input==null) {
            return new String[0];
        }
        else{
            int i=0;
            int left=0;
            int right=input.length-1;
            while(i<right) {
                if (input[i].equals("r")) {
                    String t1 = input[i];
                    input[i] = input[left];
                    input[left] = t1;
                    i++;
                    left++;
                } else if (input[i].equals("g")) {
                    i++;
                } else if (input[i].equals("b")) {
                    String t2 = input[i];
                    input[i] = input[right];
                    input[right] = t2;
                    right--;
                }
            }
     return input;
     }
  }
  
  public static void main(String[] args){

    String[] input = new String[]{"r","r","b","g","b","r","g"};
    reRank(input);
    for(int i=0;i<input.length;i++){
    	System.out.println(input[i]);
    }
  
 } 
}
