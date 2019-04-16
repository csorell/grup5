package entorns;

import java.util.ArrayList;
 
public class Pila<T> extends ArrayList<T> {
    
    //Possa la darrera posició
    public void push(T o) {
        super.add(o);
    }
   
    //Lleva la primera posició
    public void shift() {
        try {
            super.remove(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }
   
    //Lleva la darrera posició
    public void pop() {
        try {
            super.remove(super.size() - 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }
   
    //Retorna la primera posició
    public T peek() {
        try {
            return super.get(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }
   
    //Retorna la darrera posició
    public T top() {
        try {
            return super.get(super.size() - 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }
   
    //Retorna true si no hi ha dades
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }
   
    //Ordena l'array.
    public void sort() {
        if (this.isEmpty()) return;
        if (this.get(0) instanceof Integer) {
            do {
                for (int i = this.size() - 1; i > 0; i--) {
                    if (((Integer) this.get(i)) < ((Integer) this.get(i-1))) {
                        Integer swap = (Integer) this.get(i);
                        this.set(i, this.get(i-1));
                        this.set(i-1, (T) swap);
                    }
                }
            } while (!isOrdened());
        }
    }
   
    //Comprova si esta ordenada l'array
    public boolean isOrdened() {
        for (int i = this.size() -1; i > 0; i--) {
            if (((Integer) this.get(i)) < ((Integer) this.get(i-1))) return false;
        }
        return true;
    }
   
    //Junta dues arrays
    public void concat(Pila<T> pila) {
        pila.forEach((element) -> {
            this.add(element);
        });
    }
}