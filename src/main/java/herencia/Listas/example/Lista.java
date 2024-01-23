package herencia.Listas.example;

public class Lista<E> {
    private int size;
    private Nodo<E> head;
    private Nodo<E> tail;

    public Lista() {
        size = 0;
        head = null;
        tail = null;
    }
    public Lista(E[] elements){
        this();
        addAll(elements);
    }

    public E removeHead() {
        if (head != null) {
            E num = head.info;
            head = head.getNext();
            size--;
            return num;
        }
        if (head == null) tail = null;
        return null;
    }

    public E removeTail() {
        if (tail == null) return null;
        if (size == 1 || head == tail) return removeHead();

        Nodo<E> j = head, i = head.next;
        while (i != tail || i.next != null) {
            j = i;
            i = i.next;
        }
        j.next = null;
        tail = j;
        size--;
        return i.info;
    }

    public void addHead(E num) {
        Nodo<E> nodo = new Nodo<E>(num);
        if (size == 0) {
            tail = nodo;
        } else {
            nodo.setNext(head);
        }
        head = nodo;
        size++;
    }

    public void addTail(E num) {
        Nodo<E> nodo = new Nodo<E>(num);
        if (size == 0) {
            head = nodo;
        } else {
            tail.setNext(nodo);
        }
        tail = nodo;
        size++;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

//    public E[] getAsArray() {
//        E[] array = new E[size];
//        Nodo<E> aux = head;
//        int i = 0;
//        while (aux != null) {
//            array[i] = aux.info;
//            aux = aux.next;
//            i++;
//        }
//        return array;
//    }
    public void addAll(E[] elements){
        for (E num:elements) addTail(num);
    }

    public boolean contains(E element) {
        if (size == 0) return false;
        if (head.getInfo() == element || tail.getInfo() == element) return true;
        Nodo<E> aux = head;
        boolean encontrado = false;
        while (aux != null && !encontrado) {
            if (aux.info.equals(element))
                encontrado = true;
            aux = aux.next;
        }
        return encontrado;
    }

    public E get(int index) {
        if (index<0 || index>=size) return null;

        Nodo<E> j = head;
        int i=0;
        while (i<index) {
            j=j.next;
            i++;
        }
        return j.info;
    }

    public E remove(int index) {
        if(index<0) return null;
        if(index>=size) return null;
        if(index==0) return removeHead();
        if(index==size-1) return removeTail();

        Nodo<E> j=head, i=head.next;
        int k=1;

        while (k++<index){
            j=i;
            i=i.next;
        }

        j.next=i.next;
        size--;

        return i.info;


    }


    @Override
    public String toString() {
        Nodo<E> n = head;
        String aux = "Size: " + size + "\n" +
                "Values: ";
        while (n != null) {
            aux += n.getInfo() + " ";
            n = n.getNext();

        }
        return aux;
    }

    private class Nodo<E> {
        private E info;
        private Nodo<E> next;

        public Nodo(E info) {
            this.info = info;
            this.next = null;
        }

        public E getInfo() {
            return info;
        }

        public Nodo<E> getNext() {
            return next;
        }

        public void setNext(Nodo<E> next) {
            this.next = next;
        }
    }
}