/**
 * 641. 设计循环双端队列
 */

class MyCircularDeque {

    int arr[];
    int front=0;
    int last=0;
    int capacity;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        capacity = k+1;
        arr = new int[capacity];

    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        front = (front-1+capacity)%capacity;
        arr[front] = value;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        arr[last] = value;
        last = (last+1)%capacity;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        front = (front+1+capacity)%capacity;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(isEmpty())
            return false;
        last = (last - 1 + capacity)%capacity;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(isEmpty())
            return -1;
        return arr[front];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(isEmpty())
            return -1;
        return arr[(last-1+capacity)%capacity];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(front == last)
            return true;
        return false;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if((front -1 + capacity)%capacity == last)
            return true;
        return false;
    }
}