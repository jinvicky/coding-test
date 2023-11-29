import java.io.*;
import java.util.ArrayList;

public class Main {
    private ArrayList<Integer> arrayList;

    public Main() {
        this.arrayList = new ArrayList<>();
    }

    public void push(int item) {
        arrayList.add(item);

    }

    public int pop() {
        return arrayList.size() < 1 ? -1 :arrayList.remove(arrayList.size()-1);
    }

    public int size() {
        return arrayList.size();
    }

    public int empty() {
        return arrayList.size() < 1 ? 1 : 0;
    }

    public int top() {
        return arrayList.size() < 1 ? -1 : arrayList.get(arrayList.size()-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Main stack = new Main();

        while (N-- > 0) {
            String[] arr = br.readLine().split(" ");
            switch (arr[0]) {
                case "push":
                    int num = Integer.parseInt(arr[1]);
                    stack.push(num);
                    break;
                case "top":
                    bw.append(stack.top() + "\n");
                    break;
                case "size":
                    bw.append(stack.size() + "\n");
                    break;
                case "empty":
                    bw.append(stack.empty() + "\n");
                    break;
                case "pop":
                    bw.append(stack.pop() + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
