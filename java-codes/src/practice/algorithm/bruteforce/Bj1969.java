package practice.algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * https://www.acmicpc.net/problem/1969
 * DNA
 * - Hamming Distance : 길이가 같은 두 DNA 사이에 다른 문자의 개수
 * 회고
 * 1. 문제를 아예 다르게 이해했다.
 * - 주어진 문자열 중에서 다른 문자열과 비교했을 때, 가장 작은 값을 구하는 줄 알았는데,
 * - 알고보니 주어진 문자열과 비교했을 때, 가장 작은 값이 나올 수 있는 새로운 문자열을 만드는 문제였다.
 * 2. map 을 이용하여 풀었는데, stream() 을 이용하여 sorting 하는 과정에서 문제가 있는 것 같다.
 * - 예제 3개는 모두 충족하는데, 결과는 자꾸 2%에서 실패로 뜬다. 반례를 못찾겠다.
 * */
public class Bj1969 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] dnas = new String[n];

        for (int i = 0; i < n; i++) {
            dnas[i] = br.readLine();
        }

        StringBuilder dna = new StringBuilder();
        int count = 0;

        for (int i = 0; i < m; i++) {
            Map.Entry<Character, Integer> entry = findMaxLetter(n, i, dnas);
            dna.append(entry.getKey());
            count += (n-entry.getValue());
        }

        System.out.println(dna + "\n" + count);
    }

    private static Map.Entry<Character, Integer> findMaxLetter(int n, int i, String[] dnas) {
        Map<Character, Integer> count = new HashMap<>();

        for (int j = 0; j < n; j++) {
            char c = dnas[j].charAt(i);
            count.put(c, count.getOrDefault(c, 0)+1);
        }

        return count.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toList())
                .get(0);
    }
}


/*
TAAGATAC
7
---
TATGATAC - 1
TAAGCTAC - 1
AAAGATCC - 2
TGAGATAC - 1
TAAGATGT - 1

---
ACGTACGTAA
6

ACGTACGTAC ACGTACGTAA - 1
CCGTACGTAG = 2
GCGTACGTAT = 2
TCGTACGTAA = 1

TAAGTAC
* */
