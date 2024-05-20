/*package wiproNew;

import org.json.JSONObject;

//Interface for text to JSON conversion
interface TextToJSONConverter {
 JSONObject convert(String text);
}

//Adapter for converting plain text to JSON format
class TextToJSONAdapter implements TextToJSONConverter {
 @Override
 public JSONObject convert(String text) {
     // Assume the text is in a specific format and convert it to JSON
     // Here's a basic example assuming text is key-value pairs separated by commas
     String[] keyValuePairs = text.split(",");
     JSONObject jsonObject = new JSONObject();
     for (String pair : keyValuePairs) {
         String[] keyValue = pair.split(":");
         jsonObject.put(keyValue[0].trim(), keyValue[1].trim());
     }
     return jsonObject;
 }
}

//Example usage
public class Main {
 public static void main(String[] args) {
     String textData = "name: John Doe, age: 30, city: New York";
    
     // Using the adapter to convert text to JSON
     TextToJSONConverter converter = new TextToJSONAdapter();
     JSONObject jsonData = converter.convert(textData);
    
     // Printing the JSON data
     System.out.println("JSON Data:");
     System.out.println(jsonData.toString());
 }
}
//Interface for text to JSON conversion
interface TextToJSONConverter {
 JSONObject convert(String text);
}

//Adapter for converting plain text to JSON format
class TextToJSONAdapter implements TextToJSONConverter {
 @Override
 public JSONObject convert(String text) {
     // Assume the text is in a specific format and convert it to JSON
     // Here's a basic example assuming text is key-value pairs separated by commas
     String[] keyValuePairs = text.split(",");
     JSONObject jsonObject = new JSONObject();
     for (String pair : keyValuePairs) {
         String[] keyValue = pair.split(":");
         jsonObject.put(keyValue[0].trim(), keyValue[1].trim());
     }
     return jsonObject;
 }
}

//Example usage
public class AsiAdoptor {
 public static void main(String[] args) {
     String textData = "name: John Doe, age: 30, city: New York";
    
     // Using the adapter to convert text to JSON
     TextToJSONConverter converter = new TextToJSONAdapter();
     JSONObject jsonData = converter.convert(textData);
    
     // Printing the JSON data
     System.out.println("JSON Data:");
     System.out.println(jsonData.toString());
 }
}
*/