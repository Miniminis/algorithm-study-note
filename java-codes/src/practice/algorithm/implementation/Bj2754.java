package practice.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/2754
 * 학점계산
 * 15m
 * */
public class Bj2754 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String grade = br.readLine();

        double gradeNumber = getGrade(grade.charAt(0));
        double result = gradeNumber <= 0 ? gradeNumber : getNumberDetail(grade.charAt(1), gradeNumber);
        System.out.println(result);
    }

    private static double getNumberDetail(double gradeDetail, double gradeNumber) {
        if (gradeDetail == '+') {
            return gradeNumber + 0.3;
        } else if (gradeDetail == '0') {
            return gradeNumber;
        } else {
            return gradeNumber - 0.3;
        }
    }

    private static double getGrade(char gradeRange) {
        if (gradeRange == 'A') {
            return 4;
        } else if (gradeRange == 'B') {
            return 3;
        } else if (gradeRange == 'C') {
            return 2;
        } else if (gradeRange == 'D') {
            return 1;
        }
        return 0;
    }
}
