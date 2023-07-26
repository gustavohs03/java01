
public class programa {
    public static void main(String[] args) {
        String original = "AbCd EfJhIj MnOpQbc";
        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2,9);
        String s5 = original.replace('A','x');
        int s6 = original.indexOf("bc");
        int s7 = original.lastIndexOf("bc");

        System.out.println("original:-"  + original +  "-");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);

    }    
    
}
