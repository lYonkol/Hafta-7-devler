
import java.util.Scanner;
public class odev13{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    System.out.println("lütfen n sayısını giriniz");
    int n = input.nextInt();
    double t =1;
    
    
        for (int i = 1; i < n-1; i++) {
           t=1+1/(2+1/t);
        
        }
        t=1+(1/t);
        System.out.println("kök 2 değerininin bölüm sayısına göre değeri "+t);
   
}}