


import java.util.Scanner;

public class anderson {
    public static void main(String[] args) {
        anderson obj = new anderson();
        Scanner tcl = new Scanner(System.in);
        System.out.println("DIGITE UM VALOR ");
        int num1 = tcl.nextInt();
        int aux = num1 % num1;
        int aux1 = 1 / num1;
    }
    public int funcao(int aux,int aux1){
        if (aux == 0 && aux1 == 1){
            System.out.println("ESSE NUMERO E PRIMO");
        }else{
            System.out.println("ESSE NUMERO NÃO E PRIMO"); 
        }
        return 0;
    }
}
