package _16_dieznumseguidos;

import java.util.Scanner;

public class _16_diezNumSeguidos {

    
    public static void main(String[] args) {
        int num, cont=0;
        Scanner entrada = new  Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num = entrada.nextInt();
        System.out.println("\nDiez numeros siguientes con for");
        for (int i = num; i < num+10; i++) {
            System.out.println(i+1);
        }
        System.out.println("\nDiez numeros siguientes con do-while");
        
        cont=num;
        do{
            cont++;
           System.out.println(cont); 
        
        }while(cont < num+10);
        
         System.out.println("\nDiez numeros siguientes con while");

         cont=num;
         
         while(cont<num+10){
             cont++;
             System.out.println(cont);
         }
             
    }
    

    }