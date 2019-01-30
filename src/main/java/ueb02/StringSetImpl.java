package ueb02;

import java.util.NoSuchElementException;

public class StringSetImpl implements StringSet {

    class Element{
        String value;
        Element next;
        Element(String s, Element n){
            value = s;
            next = n;
        }
    }
    private Element head;

    public boolean add(String s){
        if(contains(s) == true) return false;

        if (head == null) {
            head = new Element(s, null);
            return true;
        }

        Element it = head;
        while (it.next != null)
            it = it.next;
        it.next = new Element(s, null);
        return true;
    }

    public boolean contains(String s) {
        if(head == null) return false;

        Element it = head;
        while(it != null){
            if(it.value.equals(s)) return true;
            it = it.next;
        }

        return false;
    }

    public String remove(String s){
        if(size() == 0)
            throw new NoSuchElementException("No Elements");

        if(contains(s) == false)
            throw new NoSuchElementException("Element not found");

        Element it = head, sub, act;
        while(it != null){
            if(it.next.value.equals(s)){
                act = it;
                sub = it.next.next;
                it.next = sub;
                break;
            }
            it = it.next;
        }
        return s;
    }

    public int size(){
        int r = 0;

        if(head == null) return r;

        Element it = head;
        r++;
        while(it.next != null){
            r++;
            it = it.next;
        }
        return r;
    }
}
