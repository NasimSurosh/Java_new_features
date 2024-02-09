package explination;

import java.util.Optional;

public class New_Java_Features {

  public static void main(String[] args) {
    
    System.out.println(" ".isBlank());
    System.out.println("    Hello!        ".strip());
    System.out.println("    Hello!        ".stripLeading());
    System.out.println("    Hello!        ".stripTrailing());
    
    System.out.println("Hello World!".transform(s -> s.substring(6)));
    
    System.out.println("Name %s, age: %d".formatted("Lucy", 34));
    
    // Text blocks : feature of java 15
    
    System.out.println("""
        "First statement"
          "Secont statement"
            "Third statement"
        """);
    String textBlock = """
        Name 1: %s
        Name 2: %s
        Name %d: %s
        """.formatted("Bob","Mary", 3,"Ema");
    System.out.println(textBlock);
    

  }

}
