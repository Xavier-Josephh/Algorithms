class Palindrome {
    public static void main(String[] args) {
        String sent = "malayalam";
        for (int i=sent.length() -1 , j =0; i>=0; i--, j++) {
            if (sent.charAt(j) != sent.charAt(i)) {
                System.out.println("Not a Palindrome");
                return;
            } 
        }
        System.out.println("Palindrome");
    }
}
