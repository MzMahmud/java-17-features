public class TextBlock {
    public String getJsonStringOldStyle() {
        return "{\n" +
               "    \"id\": 1,\n" +
               "    \"firstName\": \"John\",\n" +
               "    \"lastName\": \"Doe\",\n" +
               "    \"email\": \"john.doe@gmail.com\"\n" +
               "}";
    }

    public String getJsonStringTextBlock() {
        return """
                {
                    "id": 1,
                    "firstName": "John",
                    "lastName": "Doe",
                    "email": "john.doe@gmail.com"
                }""";
    }
}
