public class Main {
    public static void main(String[] args) {
        Java java = new Java("Matmusa", 21, 'M', "abduvohobuulu@gmail");
        Java java2 = new Java("Manas", 28, 'M', "abduganiuulu@gmail");
        Java java3 = new Java("Momun", 17, 'M', "akunov@gmail");
        Go go = new Go("Marat", 21, 'M', "marat@gmail");
        Go go1 = new Go("Samat", 21, 'M', "samat@gmail");
        Android android = new Android("Robert", 34, 'm', "robert@gmail");
        Android android1 = new Android("Bob", 34, 'm', "bob@gmail");
        Java[] javas = {java, java2, java3};
        Android[] androids = {android, android1};
        Go[] gos = {go, go1};
        Company company = new Company("Wall Street", javas, gos, androids, "Stive Jobs");
        System.out.println("Company 1:" + company.toString());
        Java java4 = new Java("Artur", 21, 'M', "artur@gmail");
        Java java5 = new Java("Bill", 28, 'M', "bob@gmail");
        Android android4 = new Android("Archi", 30, 'm', "archi@gmail");
        Go go2 = new Go("Meerim", 20, 'W', "meerim@gmail");
        Go[] gos1 = {go2};
        Java[] javas1 = {java4, java5};
        Android[] androids1 = {android4};
        Company company2 = new Company("Wall Street", javas1, gos1, androids1, "Tim Cook");
        System.out.println("Company 2" + company2.toString());

      

    }
}