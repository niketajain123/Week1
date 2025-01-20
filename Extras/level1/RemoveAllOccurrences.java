public class RemoveAllOccurrences{
    public static void main(String[] args) {
        String string = "Hello World";
        char remove = 'l';
        String result = string.replace(String.valueOf(remove), "");
        System.out.println("Modified String is " + result);
    }
}