import java.util.Arrays;

public class HashMap<K, V> {                           // Создаем обобщенный класс, в скобках указывает обобщение для ключа и значения
    private V [] arr = (V[])new Object[10];            // Создаем массив для хранения значений

    /**
     * Метод для хеширования объекта
     * @param key хешируемые объект - ключ записи
     * @return значение хеша объекта
     */
    private int hash(K key){
       return key.hashCode()%arr.length;
    }

    /**
     * Метод для записи элемента в таблицу по ключу
     * @param key сам ключ элемента
     * @param value значение записи
     */
    public void insert(K key, V value){
        int pos = hash(key);
        arr[pos] = value;
    }

    /**
     * Метод для поиска элемента по ключу
     * @param key ключ элемента
     * @return сам элемент
     */
    public V find(K key){
        int pos = hash(key);
        return arr[pos];
    }

    /**
     * Метод для отображения всей таблицы
     */
    public void display(){
        System.out.println("Таблица");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * Метод для удаления элемента
     * @param key ключ удаляемого элемента
     */
    public void delete(K key){
        int pos = hash(key);
        arr[pos] = null;
    }

}
