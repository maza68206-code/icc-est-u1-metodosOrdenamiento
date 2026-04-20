public class BubbleSort {
   //Constructor
    public BubbleSort (){
    System.out.println("Se creo la clase en el constructor");
    }
    public void sortAscendente(int numeros[]){
        
         for (int i = 0 ;i< numeros.length; i++){
            for(int j = i+1; j<numeros.length; j++){
                //Comparacion 
                if(numeros[i]>numeros[j]){
                    //si se cumple se realiza el intercambio 
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j]= aux;

                }

            }
        }
    }
     public void sortDescendente( int numeros[]) {
        for (int i = 0 ;i< numeros.length; i++){
            for(int j = i+1; j<numeros.length; j++){
                //Comparacion 
                if(numeros[i]<numeros[j]){
                    //si se cumple se realiza el intercambio 
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j]= aux;

                }

            }
        }

         
    }
    public void printArreglo(int[] numeros) {
        
        for( int i : numeros){
            System.out.print(i+ ",");


        }
        System.out.println();
    }
    public void sort  (int[] numeros, boolean asc){
        if (asc) {
            System.out.println("orden ascendente");
            sortAscendente(numeros);
        }else {
             System.out.println("Orden descendente");
             sortDescendente(numeros);
            }
      
        }

     
    }

