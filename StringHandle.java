class StringHandle {

    // Hide last 4 digits of a phone number
    public static String hidePhone(String number) {
        if (number.length() <= 4) return "****";
        return number.substring(0, number.length() - 4) + "****";
    }

    // Hide middle part of an email (keep first and last letter before @)
    public static String hideEmail(String email) {
        int at = email.indexOf('@');
        if (at <= 2) return "***" + email.substring(at);
        String first = email.charAt(0) + "";
        String last = email.charAt(at - 1) + "";
        return first + "****" + last + email.substring(at);
    }

    // Replace all characters except first and last
    public static String maskExceptFirstLast(String word) {
        if (word.length() <= 2) return word;
        StringBuilder sb = new StringBuilder();
        sb.append(word.charAt(0));
        for (int i = 1; i < word.length() - 1; i++) {
            sb.append('*');
        }
        sb.append(word.charAt(word.length() - 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Phone: " + hidePhone("9876543210"));
        System.out.println("Email: " + hideEmail("RaghavZone@gmail.com"));
        System.out.println("Masked: " + maskExceptFirstLast("Orange"));
    }
}
