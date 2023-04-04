public class HashMultiMap<K, V> {             // Создаем обобщенный класс, который принимает ключ и значение
    V[][] mtx = (V[][]) new Object[10][10];   // Создаем матрицу для значений

    /**
     * Метод для хеширования ключа
     * @param key ключ
     * @return хеш ключа
     */
    private int hash(K key){
        return key.hashCode()%mtx[0].length;
    }

    /**
     * Метод для добавления элемента в таблицу
     * @param key ключ
     * @param value значение
     */
    public void insert(K key, V value){
        int pos = hash(key);                           // Хешируем ключ
        for (int i = 0; i < mtx[pos].length; i++) {    // По хешу получаем строку матрицы, в которую будем записывать
          if(mtx[pos][i] == null){                     // Находим свободную позицию в строке
              mtx[pos][i] = value;                     // Если нашли, добавляем значение
              return;                                  // и выходим из метода
          }
        }
        System.out.println("Невозможно вставить - нет места");
    }

    /**
     * Метод для поиска элемента по ключу
     * @param key ключ
     * @return сам элемент
     */
    public V[] find(K key){
        int pos = hash(key);     // Получаем хеш строки
        V[] arr =  mtx[pos];     // Копируем строку
        return arr;              // Возвращаем ее
    }

    /**
     * Выводим всю матрицу
     */
    public void display(){
        System.out.println("Вся матрица:");
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Метод для удаления строки из матрицы
     * @param key
     */
    public void delete(K key){
        int pos = hash(key);                            // Получаем хеш строки
        for (int i = 0; i < mtx[pos].length; i++) {     // Перебираем всю строку матрицы и приравниваем элементы к null
            mtx[pos][i] = null;
        }
    }
}
