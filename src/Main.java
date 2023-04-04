
public class Main {

    Object object = new Object() ;

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap();

        hashMap.insert("Ученик", "Анна");

        hashMap.insert("Ученик", "Влад");
        System.out.println("Доступ к элементу: " + hashMap.find("Ученик"));

        hashMap.display();

        hashMap.delete("Студент");

        hashMap.display();

        HashMultiMap<Integer, String> multiMap = new HashMultiMap<>();
        multiMap.insert(1, "Анна");
        Object[] arr =  multiMap.find(1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        multiMap.insert(1, "Влад");
        arr =  multiMap.find(1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        multiMap.insert(2, "Влад");
        multiMap.delete(1);

        multiMap.display();

    }


}
