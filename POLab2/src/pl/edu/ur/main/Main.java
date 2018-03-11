package pl.edu.ur.main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        
     //Zad. 3   
 
    /*float[]tab = new float[10];
    System.out.println("Wprowadź 10 liczb rzeczywistych do tablicy");
    Scanner scanner = new Scanner(System.in);
    int i=1;
    do{
        System.out.format("Podaj %d liczbe: ", i);
        tab[i-1]=scanner.nextInt();
        i++;
    }while(i<=10);
    System.out.println("Wybierz zadanie: ");
    System.out.println("1. Wyświetlanie tablicy od pierwszego do ostatniego indeksu.");
    System.out.println("2. Wyświetlanie tablicy od ostatniego do pierwszego indeksu.");
    System.out.println("3. Wyświetlanie elementów o nieparzystych indeksach");
    System.out.println("4. Wyświetlanie elementów o parzystych indeksach.");
    int z = scanner.nextInt();
    if(z==1)
    {
        for(i=0; i<10; i++)
        {
        System.out.print(" " +tab[i]);
        }
    }
    else if(z==2)
    {
        for(i=9; i>=0; i--)
         {
        System.out.print(" " +tab[i]);
         }
    }
    else if(z==3)
    {
      for(i=1; i<10; i=i+2)
        {
        System.out.print(" " +tab[i]);
        }
    }
    else if(z==4)
    {
         for(i=0; i<10; i=i+2)
        {
        System.out.print(" " +tab[i]);
        }
    } */
        
    // Zad. 4
        
   /* float[]tab = new float[10];
    System.out.println("Wprowadź 10 liczb rzeczywistych do tablicy");
    Scanner scanner = new Scanner(System.in);
    int i;
    for(i=1; i<=10; i++)
    {
        System.out.format("Podaj %d liczbe: ", i);
        tab[i-1]=scanner.nextInt();
    }
    System.out.println("Wybierz zadanie: ");
    System.out.println("1. Suma elementów tablicy.");
    System.out.println("2. Iloczyn elementów tablicy.");
    System.out.println("3. Wartość średnia.");
    System.out.println("4. Wartość minimalna.");
    System.out.println("5. Wartość maksymalna");
    int z = scanner.nextInt();
    if(z==1)
    {
        float suma=0;
        for(i=0; i<10; i++)
        {
            suma=suma+tab[i];
        }
    System.out.println("Suma: " +suma);
    }
    if(z==2)
    {
        float iloczyn=1;
        for(i=0; i<10; i++)
        {
            iloczyn = iloczyn*tab[i];
        }
    System.out.println("Iloczyn: " +iloczyn);
    }
    if(z==3)
    {
        float sr, suma=1;
        for(i=0; i<10; i++)
        {
            suma=suma+tab[i];
        }
    sr=suma/10;
    System.out.println("Średnia: " +sr);
    }
    if(z==4)
    {
        float min=tab[0];
        for(i=0; i<10; i++)
        {
           if(tab[i]<min)
           min = tab[i];
        }
    System.out.println("Najmniejszy element: " +min);        
    }
    if(z==5)
    {
        float max=tab[0];
        for(i=0; i<10; i++)
        {
            if(tab[i]>max)
            max=tab[i];
        }
    System.out.println("Największy element: " +max);
    } */
        
    //Zad. 6
        
    /*int i, x;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe calkowita: ");
    x = scanner.nextInt();
    while(x>=0)
    {
      System.out.println("Podaj liczbe calkowita: ");
      x = scanner.nextInt();
      if(x<0)
          break;
    } */
   
    //Zad.7 
        
    /* int n, i, t, zamiana; 
     Scanner scanner = new Scanner(System.in);
     System.out.println("Podaj liczbe elementow tablicy: ");
     n = scanner.nextInt();
     int[] tab = new int[n];
     for(i=0; i<n; i++)
     {
         System.out.format("Podaj %d element tablicy: ", i);
         tab[i] = scanner.nextInt();
     }
     do {
         zamiana = 0;
         for(i=0; i<=n; i++)
         {
             if(tab[i]>tab[i+1])
             {
                 zamiana=zamiana+1;
                 t=tab[i];
                 tab[i]=tab[i+1];
                 tab[i+1]=t;
             }
         }
     }
     while(zamiana!=0);
         
     for(int j=1; j<=n; j++)
     {
         System.out.println(" " +tab[j]);
     } */
  
}
}

    