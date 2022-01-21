package yoon.hw;


import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static class Point {
        public int x;
        public int y;

        public Point(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = br.readLine();
        Point[] points = {new Point(-2,-1),new Point(-1,-2),new Point(1,-2),new Point(2,-1),new Point(2,1),new Point(1,2),new Point(-1,-2),new Point(-2,1)};
        int next_row = 0;
        int next_col = 0;

        int row = input.charAt(1)-48;
        int col = input.charAt(0)-96;
        int result = 0;

        for (Point point : points) {
            next_row = row + point.x;
            next_col = col + point.y;

            if(next_row >= 1 && next_row <= 8 && next_col >=1 && next_col <= 8) {
                result +=1;
            }

        }
        System.out.println(result);


    }
}
