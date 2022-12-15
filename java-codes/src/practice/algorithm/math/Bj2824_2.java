package practice.algorithm.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj2824_2 {

    static final int MAX = 1000000000;
    static int[] a, b;
    static boolean isGcdBig = false;

    public static void main(String[] args) throws IOException {

        input();
        Map<Integer, Integer> aMap = factorization(a);
        Map<Integer, Integer> bMap = factorization(b);

        long gcd = gcd(aMap, bMap);
        if (isGcdBig) {
            System.out.printf("%09d", gcd);
            return;
        }

        System.out.println(gcd);
    }

    private static long gcd(Map<Integer, Integer> aMap, Map<Integer, Integer> bMap) {
        long gcd = 1;
        for (Integer primeA : aMap.keySet()) {
            int overA = aMap.get(primeA);
            int overB = bMap.getOrDefault(primeA, 0);

            gcd *= pow(primeA, Math.min(overA, overB));
            if (gcd >= MAX) {
                isGcdBig = true;
                gcd %= MAX;
            }
        }

        return gcd;
    }

    private static long pow(Integer primeA, int over) {
        long result = 1;
        while (over --> 0) {
            result *= primeA;
            if (result > MAX) {
                isGcdBig = true;
                result %= MAX;
            }
        }

        return result;
    }

    private static Map<Integer, Integer> factorization(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map = factorization(n, map);
        }

        return map;
    }

    private static Map<Integer, Integer> factorization(int n, Map<Integer, Integer> map) {
        if (n == 1) return map;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                return factorization(n / i, map);
            }
        }
        map.put(n, map.getOrDefault(n, 0) + 1);
        return map;
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        n = Integer.parseInt(br.readLine());
        b = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
    }

}
