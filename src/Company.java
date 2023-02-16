import java.util.Arrays;

public class Company {
    private String adress;

    private Java[] java;
    private Go[] go;
    private Android[] android;
    private String ownerName;

    public Company(String adress, Java[] java, Go[] go, Android[] android, String ownerName) {
        this.adress = adress;
        this.java = java;
        this.go = go;
        this.android = android;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "" +
                "\nadress :" + adress +
                "\n java :" + Arrays.toString(java) +
                "\n go  :" + Arrays.toString(go) +
                "\nandroid :" + Arrays.toString(android) +
                "\n ownerName  :" + ownerName
                ;
    }
}

