
package numerorepetidos;


public class NumeroRepetidos {

    
    public static void main(String[] args) {
        Integer Listas[] = new Integer[]{14,15,16,17,14,15,16};
        for(int i = 0; i < Listas.length;i++) {
            boolean repetidos = false;
        for(int j = 0; j < Listas.length;j++) {
            if(Listas[i] == Listas[j] && i != j ) {
                repetidos = true;
                break;
            }
        }
        if(!repetidos) {
            System.out.println("El numero no repetido es "+ Listas[i] + " en la posicion " + i);
        }
        
        }
    }
    
}
