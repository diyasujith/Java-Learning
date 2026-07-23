public class Main {
    public static void main(String[] args) {
        //Formatted Strings are used to insert values into placeholders
        String name = "Diya Sujith";
        int age = 19;
        double cgpa = 9.3;
        System.out.println(String.format(
            "My name is %s. I am %d years old. My cgpa is %f",name, age, cgpa));
        }
}