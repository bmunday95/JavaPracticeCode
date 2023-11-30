package studying;

public class Hashing {

  // simple Hash Function algorithm

  public static int hash_function (String input_string) {
    int hash_value = 0;

    for (int i = 0; i < input_string.length(); i++) {
      hash_value += input_string.charAt(i);
    }

    return hash_value % 101;

  }

  public static void main(String[] args) {
    String input_string = "Hello, World!";
    int hash_value = hash_function(input_string);
    System.out.println(hash_value);
  }

}
