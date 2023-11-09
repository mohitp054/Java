import java.util.Arrays;

public class StringExample {

    public static void main(String[] args) {
        String s = "“We realize that while our workers were thriving, the\r\n" +
                "surrounding villages were still suffering. It became our goal to uplift their\r\n" +
                "quality of life as well. I remember seeing a family of 4 on a motorbike in the\r\n" +
                "heavy Bombay rain — I knew I wanted to do more for these families who were\r\n" +
                "risking their lives for lack of an alternative” The alternative mentioned here\r\n" +
                "is the Tata Nano, which soon after came as the world’s cheapest car on retail\r\n" +
                "at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a\r\n" +
                "recent post by Humans of Bombay which formed the basis of his decision to come\r\n" +
                "up with a car like Tata Nano";
        String l = "George";

        // Corrected charAt() usage
        char s2 = s.charAt(2);

        System.out.println(s.compareTo(l)); // Corrected method call
        System.out.println(s.concat(l)); // Corrected method call
        System.out.println(s.contains(l)); // Corrected method call
        System.out.println(s.endsWith("n")); // Corrected method call
        System.out.println(s.equals(l)); // Corrected method call
        System.out.println(s.equalsIgnoreCase(l)); // Corrected method call

        System.out.println(String.format("%s", l));

        byte[] bytes = s.getBytes();
        System.out.println(bytes);

        char[] dst = new char[20];
        s.getChars(1, 5, dst, 0);
        System.out.println(new String(dst));

        System.out.println(s.indexOf("e"));

        System.out.println(s.intern());

        System.out.println(s.isEmpty());

        String obj = String.join("+", "one", "two", "three");
        System.out.println(obj);

        System.out.println(s.lastIndexOf("nano"));

        int m = s.length();
        System.out.println("Length of string: " + m);

        String s3 = s.replaceAll("workers were", "employees were");
        System.out.println(s3);

        String s4 = s.replaceFirst("lakh", "crore");
        System.out.println(s4);

        String[] s5 = s.split("\\W+");
        System.out.println(Arrays.toString(s5));

        System.out.println(s.startsWith("n"));

        String s1 = s.substring(1, 6);
        System.out.println("Substring: " + s1);

        System.out.println(s.toCharArray());

        System.out.println(l.toLowerCase());
        System.out.println(l.toUpperCase());

        System.out.println(s.trim());

        String s6 = String.valueOf(30);
        System.out.println(s1 + s6);
    }
}
