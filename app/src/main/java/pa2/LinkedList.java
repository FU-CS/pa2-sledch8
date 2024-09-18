package pa2;

/**
 * A sorted singly linked list of integers
 */
public class LinkedList {

    /**
     * A node in the linked list
     */
    public Node head;


    /**
     * Constructor
     * Initialize the linked list with a null head
     */
    public LinkedList() {
        this.head = null;
     
            
        
    }

    /** 
     * Add a new node to the linked list 
     * so that the list remains sorted
     * @param value The value to add
     * @return void
     */
    public void add(int value) {
        Node newnode = new Node (value);
        if (this.head == null){
            this.head = newnode;
            return;
        }
        if (newnode.value < this.head.value){
            newnode.next = this.head;
            this.head = newnode;
        }
        else {
            Node curr = this.head;
            while (curr.next != null && curr.next.value < value){
                    //newnode.next = curr.next;
                    curr = curr.next;
                }
            newnode.next = curr.next;
            curr.next = newnode;
            }
        }

    /**
     * Remove the first node with the given value
     * If the value is not found, do nothing
     * @param value The value to remove
     * @return void
     */
    public void remove(int value) {
        Node curr = this.head;
        if (curr.value == value){
            this.head = this.head.next;
        }
        else {
            while (curr.next != null && curr.next.value != value ){
                    curr = curr.next;
                
            }
            if (curr.next != null){
                curr.next = curr.next.next;
            }

        }
        if (curr.next == null){
            return;
        }

    }

    /**
     * Traverse the linked list RECURSIVELY and returns a string representation of the list
     * @param current
     * @return String
     */
    private String traverse(Node current){
        if (current == null){
            return "";
        }
        else {
            return current.value + " " + traverse(current.next);
        }
    }

    /**
     * Traverse the linked list and returns a string representation of the list
     * @return String
     */
    public String traverse(){
        return traverse(this.head);

    }

    public String reverse_recursion(){
        return reverse(this.head);
    
    }

	

    /**
     * Traverse the linked list RECURSIVELY and 
     * returns a string representation of the list
     * @return String
     */
    private String reverse(Node current){
        String reverse_list = "";

        if (current==null){
            return "";
        }
        else if (current.next == null){
            return "" + current.value;
        }

        reverse_list = reverse(current.next);

        Node first = current;
        Node rest = current.next;
        rest.next = first;
        first.next = null;
        
    
        rest.next = first;
        first.next = null;
    
        return reverse_list + " " + first.value;
        
    }
    // /**
    //  * Merges two sorted linked list and returns the 
    //  * merged linked list that is also sorted
    //  * @param list1 The first sorted linked list
    //  * @param list2 The second sorted linked list 
    //  * @return LinkedLists
    //  */
     public static LinkedList merge(LinkedList list1, LinkedList list2){
        Node newnode = null;
        LinkedList newlist = new LinkedList();
        Node curr1 = list1.head;
        Node curr2 = list2.head;
        if (curr1.value < curr2.value){
            newlist.head = curr1;
            curr1 = curr1.next;
        }
            
        else{
            newlist.head = curr2;
            curr2 = curr2.next;
        }
        newnode = newlist.head;
        while (curr1 != null && curr2 != null){
            if (curr1.value < curr2.value){
                newnode.next = curr1;
                curr1 = curr1.next;
            
            }
            else{
                newnode.next = curr2;
                curr2 = curr2.next;
            }
            newnode = newnode.next;
        }
        while (curr1 != null){
            newnode.next = curr1;
            curr1 = curr1.next;
            newnode = newnode.next;
        }

        while (curr2 != null){
            newnode.next = curr2;
            curr2 = curr2.next;
            newnode = newnode.next;
        }
       return newlist; 
     }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);

        LinkedList list2 = new LinkedList();
        list2.add(3);
        list2.add(5);
        list2.add(5);
        list2.add(9);


        LinkedList merge = LinkedList.merge(list, list2);



        System.out.println(merge.traverse());
        list.remove(3);
        System.out.println(list.reverse_recursion());
    }
}