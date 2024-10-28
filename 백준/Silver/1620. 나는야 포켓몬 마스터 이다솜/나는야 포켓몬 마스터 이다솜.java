
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]); // 26
        int k = Integer.parseInt(input[1]); // 5

        Map<String, Integer> mapByName = new HashMap<>();
        Map<Integer, String> mapByNumber = new HashMap<>();

        for(int i = 0; i < n; i++) {
            // 맵에다가 포켓몬을 저장한다.
            String pokemon = br.readLine();
            int idx = i+1;
            mapByName.put(pokemon, idx);
            mapByNumber.put(idx, pokemon);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < k; i++) {
            String line = br.readLine();
            if(Character.isDigit(line.charAt(0))) {
                String pokemonName = mapByNumber.get(Integer.parseInt(line));
                sb.append(pokemonName).append("\n");
            } else {
                int idx = mapByName.get(line);
                sb.append(idx).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
