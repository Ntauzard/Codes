

public class TestMyLinkedList
{
    public static void main(String[] args){
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        //Test with an empty list
        System.out.println("Test with an empty list");
        System.out.println(list.isGreater(4));
        
        list.append(6);
        list.append(3);
        list.append(7);
        list.append(4);
        list.append(5);
        list.append(8);
        list.append(9);

        // Test with the first value
        System.out.println("\nTest with the lowest value in the list");
        System.out.println(list.isGreater(6));
        
        //Test with a mid value in the list
        System.out.println("\nTest with a mid value in the list");
        System.out.println(list.isGreater(4));
        
        //Test with the last value in the list
        System.out.println("\nTest with the last value in the list");
        System.out.println(list.isGreater(9));
    }
}
