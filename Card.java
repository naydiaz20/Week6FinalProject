public class Card {

    public int value;
    public String name;

    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public void describeCard() {
        System.out.println("Card name: " + name + " , Card Value " + value);

    }
    public int getValue() {
        return value;

    }
    public void setValue(int value) {
        this.value = value;
    }
    public String  getName() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void describe() {
        System.out.println(name + " has value of: " + value );
    }

    public static String MakeCardName (int i, int j) {
        return (" ");
    }
    public static Object remove(int i) {

        return (" ");

    }

}

