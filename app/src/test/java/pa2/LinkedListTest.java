package pa2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LinkedListTest {

    @Test
    public void testAdd() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals("1 2 3 ", list.traverse());
    }

    @Test
    public void testAdd2(){
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(2);
        list.add(1);
        assertEquals("1 2 3 ", list.traverse());
    }
    @Test
    public void testAdd3(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(0);
        assertEquals("0 1 2 ", list.traverse());
    }
    @Test
    public void testAdd4(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(10);
        list.add(10);
        list.add(2);
        assertEquals("1 2 10 10 ", list.traverse());
    }




    @Test
    public void testRemove() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        assertEquals("1 3 ", list.traverse());
    }

    @Test
    public void testRemove2() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(4);
        assertEquals("1 2 3 ", list.traverse());
    }

    @Test
    public void testRemove3() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        assertEquals("2 3 ", list.traverse());
    }
    
    @Test
    public void testRemove4() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(3);
        assertEquals("1 2 ", list.traverse());
    }

    @Test
    public void testTraverse(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals("1 1 2 2 3 3 ", list.traverse());

    }

    @Test
    public void testReverseRecursion(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals("3 3 2 2 1 1", list.reverse_recursion());

    }

    @Test
    public void testReverseRecursion2(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        assertEquals("6 5 4 3 2 1", list.reverse_recursion());

    }

    @Test
    public void testMerge(){
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);

        LinkedList list2 = new LinkedList();
        list2.add(3);
        list2.add(5);
        list2.add(7);
        list2.add(9);

        LinkedList merge = LinkedList.merge(list1, list2);

        assertEquals("1 2 3 4 5 6 7 8 9 ", merge.traverse());
    }

    @Test
    public void testMerge2(){
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(100);

        LinkedList list2 = new LinkedList();
        list2.add(3);
        list2.add(5);
        list2.add(7);
        list2.add(9);

        LinkedList merge = LinkedList.merge(list1, list2);

        assertEquals("1 1 1 1 3 5 7 9 100 ", merge.traverse());

    }

    @Test
    public void testMerge3(){
        LinkedList list1 = new LinkedList();
        list1.add(1);
        

        LinkedList list2 = new LinkedList();
        list2.add(3);
        list2.add(5);
        list2.add(7);
        list2.add(9);

        LinkedList merge = LinkedList.merge(list1, list2);

        assertEquals("1 3 5 7 9 ", merge.traverse());
    }

    @Test
    public void testMerge4(){
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);

        LinkedList list2 = new LinkedList();
        list2.add(3);
        list2.add(100);

        LinkedList merge = LinkedList.merge(list1, list2);

        assertEquals("1 2 3 4 6 8 100 ", merge.traverse());
    }


}
