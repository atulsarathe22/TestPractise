package Resource;

public class payLoad {
    public static String addBook(String isbn,String aisle){
        String body="{\r\n\"name\":\"Learn Appium Automation with Java\",\r\n\"isbn\":\""+isbn+"\",\r\n\"aisle\":\""+aisle+"\",\r\n\"author\":\"John foe\"\r\n}";
        return body;
    }
}
