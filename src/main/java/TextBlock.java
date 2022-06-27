public class TextBlock {
    public static void main(String[] args) {
        String oldStyle = "{\n" +
                      "    \"id\": 1,\n" +
                      "    \"firstName\": \"John\",\n" +
                      "    \"lastName\": \"Doe\",\n" +
                      "    \"email\": \"john.doe@gmail.com\"\n" +
                      "}";
        System.out.println(oldStyle);

        String newStyle = """
                {
                    "id": 1,
                    "firstName": "John",
                    "lastName": "Doe",
                    "email": "john.doe@gmail.com"
                }""";
        System.out.println(newStyle);
    }
}
