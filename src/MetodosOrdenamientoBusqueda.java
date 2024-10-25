import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    // Selection sort by age
    public void sortByAgeWithSelection(Person[] people) {
        // Metodo seleccion
        for (int i = 0; i < people.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < people.length; j++) {
                if (people[j].getAge() < people[minIndex].getAge()) {
                    minIndex = j;
                }
            }
            Person temp = people[i];
            people[i] = people[minIndex];
            people[minIndex] = temp;
        }
    }

    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {
        // TODO: Implement selection sort by height
        for (int i = 0; i < people.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < people.length; j++) {
                if (people[j].getHeight() < people[minIndex].getHeight()) {
                    minIndex = j;
                }
            }
            Person temp = people[i];
            people[i] = people[minIndex];
            people[minIndex] = temp;
        }
    }

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] people) {
       // Metodo Inserccion con años
        for (int i = 1; i < people.length; i++) {
            Person key = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getAge() > key.getAge()) {
                people[j + 1] = people[j];
                j--;
            }
            people[j + 1] = key;
        }  
      
    }

    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] people) {

        //Metodo insercion con tamaño
        for (int i = 1; i < people.length; i++) {
            Person key = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getHeight() > key.getHeight()) {
                people[j + 1] = people[j];
                j--;
            }
            people[j + 1] = key;
        }

    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {
        // TODO: Implement binary search by age
        int min = 0;
        int max = people.length - 1;
        int mid;
        while (min <= max) {
            mid = (min + max) / 2;
            if (people[mid].getAge() == age) {
                return mid;

            } else if (people[mid].getAge() < age) {
                min = mid + 1;
            } else {
                max = mid - 1;
                }
                }
        return -1; // Placeholder return value
    }

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        // TODO: Implement binary search by height
        int min = 0;
        int max = people.length - 1;
        int mid;
        while (min <= max) {
            mid = (min + max) / 2;
            if (people[mid].getHeight() == height) {
                return mid;
            } else if (people[mid].getHeight() < height) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Person [] people) {
        System.out.println("El arreglo ordenado es :");
        for (Person persona : people) {
            System.out.println(persona);
        }
    }
}