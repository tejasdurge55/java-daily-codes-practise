
package arrays_easy;
class parent{
    public static void display(){
        System.out.println("display");
    }
}

public class child {
    
    
    public static void main(String[] args){
        
        //parent.display();
        String[][] board = {{"A","B","C","E"},
        {"S","F","C","S"},
        {"A","D","E","E"}};
        
        String word = "ABCCED";
        String country="india";
        int len1=country.length();
        char[] arr2=new char[len1];
        int[] arr3=new int[len1];
        for(int i=0;i<len1;i++){
            arr2[i]=country.charAt(i);
        }
        
        for(int i=0;i<len1;i++){
            int count=1;
            for(int j=i+1;j<len1;j++){
                if(country.charAt(i)==(country.charAt(j))){
                    count=count+1;
                    arr2[j]='-';
                }
            }
            arr3[i]=count;
        }
        for(int i=0;i<len1;i++){
            if(arr2[i]!='-'){
            System.out.println(arr2[i]+"->"+arr3[i]);

            }
        }
        
        
//        String str1="";
//        //str1=str1+board[0][0]+board[0][1]+board[0][2]+board[1][2]+board[][];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<4;j++){
//                if(word.contains(board[i][j])){
//                    str1=str1+board[i][j];
//                }
//                    
//            }
//        }
//        System.out.println(str1);
    }
}
