import models.Carro;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusquedaGrupoB {

    // Selection sort by year Asendentemente
    public void sortBYearWithBubbleAvnAsendente(Carro[] people) {
        for( int i=0;i<people.length-1;i++){
            for (int j = 0; j < people.length-1; j++) {
                if (people[j].getYear() < people[j + 1].getYear()) {
                    Carro aux = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = aux;
                    }
            }
            }
        }

    // Selection sort by year Desendentemente
    public void sortBYearWithBubbleAvnDesendente(Carro[] people) {
        for( int i=0;i<people.length-1;i++){
            for (int j = 0; j < people.length-1; j++) {
                if (people[j].getYear() > people[j + 1].getYear()) {
                    Carro aux = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = aux;
                    }
            }
            }
        }
    

    // Binary search by year
    public int searchBinaryByYear(Carro[] people, int height) {
        int min=0;
        int max=people.length;
        int mid;
        int valorbusqueda = 1920;
        while(min<max){
            mid=(min+max)/2;
            if (people[mid].getYear() == valorbusqueda) {
                return mid;
            } else if (people[mid].getYear() < valorbusqueda) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1; 
    
    }

    // Metodo que imprime el listado de personas
    public void showCars(Carro[] people) {
        System.out.println("El arreglo ordenado es :");
        for (Carro person : people) {
            System.out.println(person);
        }
    }
}
