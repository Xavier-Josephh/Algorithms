import java.util.List;
import java.util.ArrayList;

class PrintMulitpleLargeWordOfAString {
    public static void main(String[] args) {
        String sent = "Hello Worlddddd malyalama in Java physioterapyist";
        int max = 0;
        List list = new ArrayList<>();
        for (String s: sent.split(" ")) {
            if (s.length() > max) {
                list.clear();
                max = s.length();
                list.add(s);
            } else if (s.length() == max) {
                list.add(s);
            }
        }
        System.out.println(max);
        System.out.println(list);
    }
