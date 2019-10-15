import java.util.*;

/**
 * You run an e-commerce website and want to record the last N order ids in a log. 
 * Implement a data structure to accomplish this, with the following API:
  record(order_id): adds the order_id to the log
  get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.
 */
public class Ecommerce{

    ArrayList<Integer> inventory;
    public Ecommerce(){
        inventory = new ArrayList<Integer>();
    }
    /**
     * Adds element to the in
     * @param order_id
     */
    public void record(int order_id){
        inventory.add(order_id);
    }
    /**
     * Gets the ith element from the list
     * @param i element at ith position to get
     * @return the ith item to retrieve
     */
    public int get_last(int i){
        return inventory.get(i);
    }
    public static void main(String [] args){
        Ecommerce store = new Ecommerce();
        store.record(1);
        store.record(2);
        store.record(3);
        System.out.println(store.get_last(2));

    }
}