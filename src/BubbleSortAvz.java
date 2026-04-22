public class BubbleSortAvz {
    //VARIABLE GLOBAL
    int[]  array ; //no tiene valor, se le asigna en el contructor 

    public BubbleSortAvz (int[] arrreglo){
        // primera forma de darle valor en el arreglo
        //array = new int[]{10,5,0};
        //2da forma de darle valor en base parametro 
        this.array = arrreglo ;
        //this
    }
     public void sort(boolean asc){
        int tam = array.length;
        boolean huboIntercambio;
        int contComparacion = 0 ;

        for(int i = 0; i< tam -1;i++){
            huboIntercambio= false;
            for(int j = 0; j<tam-1 -i; j++){
               contComparacion++;
               if( array[j] > array[j+1]){
                huboIntercambio =true;
                int aux = array[j];
                array[j]=array[j+1];
                array[j+1] = aux;
        
               }
            
            }
             if (!huboIntercambio){
                break;
            }
        }
        System.out.println("Comparaciones totales:" +contComparacion);
            
        
     }
     public void printArray(int[] numeros) {
        
        for( int i : numeros){
            System.out.print(i+ ",");


        }
        System.out.println();
     }
     
}
