public class ContainsExample {
    public static void main(String args[]) {
        String name = "what do you know about me";
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));
        System.out.println(name.contains("hello"));

        String str = "Hello Javatpoint readers";
        boolean isContains = str.contains("Javatpoint");
        System.out.println(isContains);
        // Case Sensitive
        System.out.println(str.contains("javatpoint")); // false


        String str1 = "To learn Java visit Javatpoint.com";
        if(str1.contains("Javatpoint.com")) {
            System.out.println("This string contains javatpoint.com");
        }else
            System.out.println("Result not found");
    }
}
