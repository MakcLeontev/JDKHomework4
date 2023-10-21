import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        List<String> names = new ArrayList<>();
//        names.add("Яков");
//        names.add("Алексей");
//        names.add("Алексей");
//        names.add("Вова");
//        names.add("Дима");
//        names.add("Дима");
//        names.add("Гена");
//        System.out.println(names);
//        names.sort(String::compareTo);
//        System.out.println(names);
//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()){
//                    return 1;
//                } else if (o2.length() > o1.length()) {
//                    return -1;
//                }
//                return 0;
//            }
//        });
//        names.sort(Comparator.reverseOrder());
//        System.out.println(names);
//        String nameSort = names.get(0);
//        System.out.println(nameSort);
//
//        Set<String> setStr = new HashSet<>(names);
//        System.out.println(setStr);
//
//
//
//        List<String> namesList = new ArrayList<>();
//        for (String name:names) {
//            if (!name.contains("а") && !name.contains("А")){
//                namesList.add(name);
//            }
//        }
//        System.out.println(namesList);

        Map<String,String> phoneBook = new HashMap<>();
        phoneBook.put("1235","user4");
        phoneBook.put("1211","user1");
        phoneBook.put("1233","user2");
        phoneBook.put("1234","user3");

        int numMax = 0;

        for (String s : phoneBook.keySet()) {
            if (Integer.parseInt(s) > numMax){
                numMax = Integer.parseInt(s);
            }
        }
        System.out.println(numMax);

        List<Map.Entry<String,String>>value = new ArrayList<>(phoneBook.entrySet());
        value.sort(Map.Entry.comparingByValue());
        System.out.println(value);
        NoteEmployee note = new NoteEmployee();
        Employee emp1 = new Employee("353451234", "user1", LocalDateTime.of(2018, Month.APRIL, 5, 5, 5));
        Employee emp2 = new Employee("3436435634", "user2", LocalDateTime.of(2020, Month.APRIL, 5, 5, 5));
        Employee emp3 = new Employee("3534214", "user3", LocalDateTime.of(2020, Month.APRIL, 5, 5, 5));
        Employee emp4 = new Employee("35324216234", "user3", LocalDateTime.of(2021, Month.APRIL, 5, 5, 5));
        Employee emp5 = new Employee("351234", "user5", LocalDateTime.of(2022, Month.APRIL, 5, 5, 5));
        note.add(emp1);
        note.add(emp2);
        note.add(emp3);
        note.add(emp4);
        note.add(emp5);

        System.out.println(note.getEmployees(2));
        System.out.println(note.getPhone("user3"));
        System.out.println(note.getEmployee(2));
    }
}
//    Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
//        Получите уникальный список Set на основании List
//        Определите наименьший элемент (алфавитный порядок)
//        Определите наибольший элемент (по количеству букв в слове но в обратном порядке)
//        Удалите все элементы содержащие букву ‘A’

//
//    Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
//        Найдите человека с самым маленьким номером телефона
//        Найдите номер телефона человека чье имя самое большое в алфавитном порядке


//Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник сотрудников
//public class Main {
//    public static void main(String[] args) {
//        NoteEmployee note = new NoteEmployee();
//        Employee emp1 = new Employee("353451234", "user1", LocalDateTime.of(2018, Month.APRIL, 5, 5, 5));
//        Employee emp2 = new Employee("3436435634", "user2", LocalDateTime.of(2020, Month.APRIL, 5, 5, 5));
//        Employee emp3 = new Employee("3534214", "user3", LocalDateTime.of(2020, Month.APRIL, 5, 5, 5));
//        Employee emp4 = new Employee("35324216234", "user3", LocalDateTime.of(2021, Month.APRIL, 5, 5, 5));
//        Employee emp5 = new Employee("351234", "user5", LocalDateTime.of(2022, Month.APRIL, 5, 5, 5));
//        note.add(emp1);
//        note.add(emp2);
//        note.add(emp3);
//        note.add(emp4);
//        note.add(emp5);
//
//        System.out.println(note.getEmployees(2));
//        System.out.println(note.getPhone("user3"));
//        System.out.println(note.getEmployee(2));
//
//    }
//
//}