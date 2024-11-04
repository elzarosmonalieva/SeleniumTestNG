package testNG;

public class TestNGclass {
    public static void main(String[] args) {
      reverse("null");

    }

    public static void reverse(String text){
        if(text == null){
            System.out.println("Text is null");
        }

        for (int i = text.length()-1;  i >=0 ; i--) {
            System.out.println(text.charAt(i));
        }
    }
}
