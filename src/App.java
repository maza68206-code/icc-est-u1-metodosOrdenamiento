public class App {
    public static void main(String[] args) throws Exception {
        //int [] numeros = {10, 0,-5,5,15,2 };
        runBubbleSortAvz();
    }

    // public static void runBubbleSort(){
    

    // }
    //     System.out.println("Metodo burbuja");
    //     int [] numeros = {-5, 10,  2,  0 , 7 };
    //     //Instancia de la clase 
    //     BubbleSort bubbleSort = new BubbleSort();
    //     bubbleSort.printArreglo(numeros);
    //     // bubblesort.sortAscendente(numeros);
    //     // bubblesort.printArreglo(numeros);
    //     // bubblesort.sortDescendet(numeros);
        
    //     bubbleSort.sort(numeros ,true);
    //     bubbleSort.printArreglo(numeros);
    //     bubbleSort.sort (numeros,false);
    //     bubbleSort.printArreglo(numeros);




    // }
   
        private static void runBubbleSortAvz(){
        //instanciar clase
          int[] array = new int[]{9,2,3,0,8,5,10,50,100};
          BubbleSortAvz bSortAvz = new BubbleSortAvz(array);
          bSortAvz.printArray(array);
          bSortAvz.sort(true);
          bSortAvz.printArray(array);
           
        }
}