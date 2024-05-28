public class Main {
    public static void main(String [] args){
        Employee[] employeesArr = new Employee[5];
        employeesArr[0] = new Employee("Сидоров Петр Васильевич", "Водитель",
                "Sidorov@icloud.com", "89921234567", 60000, 50);
        employeesArr[1] = new Employee("Иванов Иван Сергеевич", "Слесарь",
                "IvIvan@mail.ru","88121234567", 55000, 53);
        employeesArr[2] = new Employee("Петров Александр Викторович", "Инженер",
                "PetrovAlex@icloud.com", "89927654321", 65000,40);
        employeesArr[3] = new Employee("Петренко Максим Александрович", "Кондитер",
                "MaxPetr@mail.ru", "89111234567", 64000, 35);
        employeesArr[4] = new Employee("Бондаренко Михаил Эдуардович", "Разнорабочий",
                "Bond007@yandex.ru", "89117654321", 40000, 47);

    }
}

