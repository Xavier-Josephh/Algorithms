import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EncodeDecode {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("");
        String encodedString = encode(input);
        List<String> decodedString = decode(encodedString);
    }

    public static String encode(List<String> strs) {
        return strs.stream()
                .map(str -> str.replace(";","/;"))
                .collect(Collectors.joining(";"));
    }

    public static List<String> decode(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < str.length(); i++) {
            if (i != 0 && ';' == str.charAt(i) && '/' == str.charAt(i-1)) {
                sb.append(";");
            } else if (';' == str.charAt(i)) {
                sb.append(" ");
            } else  if (i < str.length() - 1 && '/' == str.charAt(i) && ';' == str.charAt(i+1)) {
                sb.append("");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return Arrays.asList(sb.toString().split(" "));
    }
}
