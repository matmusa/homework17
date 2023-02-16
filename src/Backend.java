public abstract class Backend {
    private String name;
    private int age;
    private char gender;
    private String emaill;

    public Backend(String name, int age, char gender, String emaill) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.emaill = emaill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    @Override
    public String toString() {
        return " \nBackend " +
                "\nname :" + name + '\'' +
                "\n age :" + age +
                "\ngender :" + gender +
                "\nemaill :" + emaill + '\''
                ;
    }
}
