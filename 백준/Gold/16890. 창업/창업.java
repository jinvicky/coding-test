import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        ArrayList<Character> listA  = new ArrayList<>();
        ArrayList<Character> listB = new ArrayList<>();

        for(int i = 0; i < A.length(); i++) {
            listA.add(A.charAt(i));
            listB.add(B.charAt(i));
        }

        Collections.sort(listA);
        Collections.sort(listB, Collections.reverseOrder());

        char[] answer = new char[A.length()];
        answer = new char[A.length()];

        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < A.length(); i++) {
            boolean isOlsAppleTurn = i % 2 == 0;

            if(isOlsAppleTurn) {
                if(listA.get(indexA) >= listB.get(indexB)) {
                    int n = A.length() - i;

                    if(n % 2 == 1) {
                        for(int j = 0; j < n; j++) {
                            if (j % 2 == 0) {
                                answer[i+j] = listA.get(indexA++);
                            } else {
                                answer[i+j] = listB.get(indexB++);
                            }
                        }
                    } else { // 남은 갯수가 짝수일 때
                        for(int j = 0; j < n; j++) {
                            if (j % 2 == 1) {
                                answer[i+j] = listA.get(indexA++);
                            } else {
                                answer[i+j] = listB.get(indexB++);
                            }
                        }

                    }
                    break;
                } else {
                    answer[i] = listA.get(indexA++);
                }

            } else { // 큐브러버의 차례

                if(listA.get(indexA) >= listB.get(indexB)) {
                    int n = A.length() - i;
                    if (n % 2 == 1) {
                        for(int j = 0; j < n; j++) {
                            if (j % 2 == 1) {
                                answer[i+j] = listA.get(indexA++);
                            } else {
                                answer[i+j] = listB.get(indexB++);
                            }
                        }
                    } else {
                        for (int j = 0; j < n; j++) {
                            if (j % 2 == 0) {
                                answer[i+j] = listA.get(indexA++);
                            } else {
                                answer[i+j] = listB.get(indexB++);
                            }
                        }
                    }
                    break;
                } else
                {
                    answer[i] = listB.get(indexB++);
                }
            }
        }
        System.out.println(new String(answer));
    }
}