import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Map<String, Integer> map = new HashMap<>();

        int collectCount = 1;
        for(int j = 0; j < input.length(); j++) {
            for(int i = 0; i < input.length(); i++) {
                if(i + collectCount > input.length()) {
                    break;
                }
                String subStr = input.substring(i, i + collectCount);

                if(!map.containsKey(subStr)) {
                    map.put(subStr, 0);
                }
            }
            collectCount++;
        }
        System.out.println(map.size());
    }
}