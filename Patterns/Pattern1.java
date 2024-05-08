package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j%2 == 0){
                    System.out.print('#');
                }else{
                    System.out.print('$');
                }
            }
            System.out.println();
        }

//        for(char x='E';x>='A';x--){
//            for(char y='E';y>='A';y--){
//                System.out.print(y);
//            }
//            System.out.println();
//        }
    }
}
