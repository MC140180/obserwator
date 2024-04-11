package cwiczenie1;

public class Main {
    public static void main(String[] args) {
        KeyboardDataEmiter keyboardDataEmiter = new KeyboardDataEmiter();
        ListeningConfig listeningConfig = new ListeningConfig(keyboardDataEmiter);
        keyboardDataEmiter.readKey();
    }
}
