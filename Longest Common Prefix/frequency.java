public class frequency {
    public static void main(String[] args) {
        String input = "Hello, World!";
        countCharacterFrequency(input);
    }

    public static void countCharacterFrequency(String input) {
        int[] frequency = new int[256]; // Assuming ASCII characters
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            frequency[c]++;
        }
        
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
    }
}
