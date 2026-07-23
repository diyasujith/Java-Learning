public class Main {
    public static void main(String[] args) {

        String string1 = new String("abc");
        String string2 = new String ("abc");

        //equality comparison operator compares the objects
        System.out.println(string1 == string2);

        //equals method compares the values
        System.out.println(string1.equals(string2));

        //ignore case-sensitivity
        System.out.println(string1.equalsIgnoreCase(string2));
    }
}