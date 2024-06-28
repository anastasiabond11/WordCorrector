package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String str : strs) {
            count++;
            if (str.contains("b")) {
                str = str.replace("b", "o");
            }
            if (str.contains("nibn")) {
                str = str.replace("nibn", "nion");
            }
            stringBuilder.append(count).append(") ").append(str).append("\n");
        }
        return stringBuilder.toString();
    }
}
