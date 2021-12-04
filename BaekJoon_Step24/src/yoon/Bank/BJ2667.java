package yoon.Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BJ2667 {
    static int node[][]; // 아파트 단지 배열
    static int check[][]; // 각 아파트 단지 방문여부 배열
    static int cnt =1;

    static ArrayList<Integer> al = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        node = new int[N][N];
        check = new int[N][N];
        for (int i = 0; i < node.length; i++) {
            String row = br.readLine();
            for (int j = 0; j < node[i].length; j++) {
                node[i][j] = row.charAt(j) - '0';

            }

        }
        for(int i=0;i<node.length;i++) {
            for(int j=0;j<node[i].length;j++) {
                if(node[i][j] == 1 && check[i][j]==0) { // 1의값이면서 방문하지 않은 곳의 정보만 전달
                    cnt =1; // cnt변수 초기화

                    dfs(i,j);// 지도의 (0,0)부터 전달
                    al.add(cnt); // 단지의 수를 어레이 리스트에 저장

                }
            }
        }
        System.out.println(al.size());
        Collections.sort(al);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));

        }






    }

    private static void dfs(int x, int y) {
        check[x][y] = 1;

        if(y<node.length-1 && node[x][y+1] ==1 && check[x][y+1]!=1) {
            cnt++;
            dfs(x, y + 1);
        }
        if(x<node.length-1 && node[x+1][y] ==1 && check[x+1][y]!=1) {
            cnt++;
            dfs(x+1, y);
        }
        if(y>0 && node[x][y-1] ==1 && check[x][y-1]!=1) {
            cnt++;
            dfs(x, y - 1);
        }
        if(x>0 && node[x-1][y] ==1 && check[x-1][y]!=1) {
            cnt++;
            dfs(x-1, y);
        }
    }
}
