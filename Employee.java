public class Employee {
    private String fio;
    private String post;
    private String email;
    private String number;
    private int money;
    private int age;

    public Employee(String fio, String post,
                    String email, String number, double money,int age){
        this.fio= fio;
        this.post= post;
        this.email= email;
        this.number= number;
        this.money= (int) money;
        this.age = age;
    }
    public void info(){
        System.out.println("ФИО" + fio + "\n" + "Должность" + post + "\n"
                + "email" + email + "\n" + "Телефон" + number+"\n"
                + "Зарплата" + money+ "\n" + "Возраст" + age+ "\n");
    }
}