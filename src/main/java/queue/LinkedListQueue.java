package queue;

// YOUR CODE GOES HERE
public class LinkedListQueue <T>{
    class DLLnode{
        public T value;
        public DLLnode next;
    }
    
    private DLLnode head;
    private DLLnode tail; 
    private int size = 0;
    public LinkedListQueue(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(T value){
        DLLnode temp = new DLLnode();
        temp.value = value;
        if (isEmpty()){
            head = temp;
            tail = temp;
            size++;
        }else{
            tail.next = temp;
            tail = temp;
            size++;
        }
    }
    public T dequeue(){
        T tempValue;
        tempValue = head.value;
        head = head.next;
        return tempValue;
    }
    public int size(){
        
        return size;
    }
    
    
}
