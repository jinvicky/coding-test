import java.io.*;
import java.util.LinkedList;

public class Main {

    private LinkedList<Integer> deck = new LinkedList<>();

    public void pushBack(int item) {
        deck.addLast(item);
    }

    public void pushFront(int item) {
        deck.addFirst(item);
    }

    public int front() {
        return deck.size() < 1 ? -1 : deck.getFirst();
    }

    public int back() {
        return deck.size() < 1 ? -1 : deck.getLast();
    }

    public int size() {
        return deck.size();
    }

    public int empty() {
        return deck.size() < 1 ? 1 : 0;
    }

    public int popFront() {
        return deck.size() < 1 ? -1 : deck.removeFirst();
    }

    public int popBack() {
        return deck.size() < 1 ? -1 : deck.removeLast();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Main deck = new Main();

        while (N-- > 0) {
            String[] arr = br.readLine().split(" ");
            switch (arr[0]) {
                case "push_back":
                    deck.pushBack(Integer.parseInt(arr[1]));
                    break;
                case "push_front":
                    deck.pushFront(Integer.parseInt(arr[1]));
                    break;
                case "pop_front":
                    bw.append(deck.popFront() + "\n");
                    break;
                case "pop_back":
                    bw.append(deck.popBack() + "\n");
                    break;
                case "size":
                    bw.append(deck.size() + "\n");
                    break;
                case "empty":
                    bw.append(deck.empty() + "\n");
                    break;
                case "front":
                    bw.append(deck.front() + "\n");
                    break;
                case "back":
                    bw.append(deck.back() + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}
