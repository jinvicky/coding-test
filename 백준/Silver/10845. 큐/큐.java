import java.io.*;
import java.util.LinkedList;

public class Main {

    private LinkedList<Integer> list = new LinkedList<>();

    public void push(int item) {
        list.add(item);
    }

    public int pop() {
        if (list.isEmpty()) {
            return -1;
        } else {
            return list.pop();
        }
    }

    public int size() {
        return list.size();
    }

    public int empty() {
        return list.isEmpty() ? 1 : 0;
    }

    public int front() {
        return list.isEmpty() ? -1 : list.getFirst();
    }

    public int back() {
        return list.isEmpty() ? -1 : list.getLast();
    }

    public static void main(String[] args) throws IOException {

        Main customQ = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (N-- > 0) {
            String order = br.readLine();
            String[] params = order.split(" ");

            switch (params[0]) {
                case "push":
                    customQ.push(Integer.parseInt(params[1])); //명령어 파람
                    break;
                case "front":
                    bw.append(customQ.front() + "\n");
                    break;
                case "back":
                    bw.append(customQ.back() + "\n");
                    break;
                case "size":
                    bw.append(customQ.size() + "\n");
                    break;
                case "pop":
                    bw.append(customQ.pop() + "\n");
                    break;
                case "empty":
                    bw.append(customQ.empty() + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();


    }
}
