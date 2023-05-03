package lab;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is StringBuffer");

        // Add string to existing string
        sb.append(" - This is a sample program");
        System.out.println(sb);

        // Insert "Object" at position 21
        sb.insert(21, "Object");
        System.out.println(sb);

        // Reverse the string
        sb.reverse();
        System.out.println(sb);

        // Replace "Buffer" with "Builder"
        String searchStr = "Buffer";
        String replaceStr = "Builder";
        int index = sb.indexOf(searchStr);
        if (index != -1) {
            sb.replace(index, index + searchStr.length(), replaceStr);
            System.out.println(sb);
        } else {
            System.out.println(searchStr + " not found in string");
        }
    }
}