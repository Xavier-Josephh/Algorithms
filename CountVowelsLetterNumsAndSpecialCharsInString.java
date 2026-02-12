import java.util.ArrayList;
import java.util.List;
class Main {
    public static void main(String[] args) {
        String s = "Hello World 4 in Java %#%";
        List<String> vowels = new ArrayList<>();
        vowels.add("i");
        vowels.add("e");
        vowels.add("a");
        vowels.add("o");
        vowels.add("u");
        List<Integer> numbersList = List.of(1,2,3,4,5,6,7,8,9,0);
        int count = 0;
        int numbsCount = 0;
        int lettersCount = 0;
        int specialChars = 0;
        for (int i=0; i< s.length(); i++) {
            if (vowels.contains(s.charAt(i) + "")) {
                count++;
            }
            else if (Character.isDigit(s.charAt(i))) {
                numbsCount++;
            }
            else if (Character.isLetter(s.charAt(i))) {
                lettersCount++;
            } else if (!(s.charAt(i) + "").equals(" ")) {
                specialChars++;
            }
        }
        System.out.println(count);
        System.out.println(numbsCount);
        System.out.println(lettersCount);
        System.out.println(specialChars);
    }
}
