package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        // 테스트용 데이터를 만듭니다.
        ArrayList boardList = new ArrayList<Board>();

        boardList.add(new Board(1, "홍길동", "2016-01-02"));
        boardList.add(new Board(2, "아무개", "2017-03-05"));
        boardList.add(new Board(3, "김영희", "2015-12-15"));
        boardList.add(new Board(4, "김철수", "2016-10-05"));

        // 리스트를 정렬합니다.
        Collections.sort(boardList);

        // 정렬된 내용을 출력해 봅니다.
        for(Object board : boardList) {
            System.out.println(board);
        }
    }
}
class Board  implements Comparable{
    private int num;
    private String name = "";
    private String date = "";

    public Board(int num, String name, String date) {
        this.num = num;
        this.name = name;
        this.date = date;
    }

    /**
     * Comparable 인터페이스에 정의된 compareTo 메소드를 오버라이드 합니다.
     */

    //  getter, setter를 정의합니다.
    public void setNum(int num) { this.num = num; }
    public int getNum() { return this.num; }
    public void setname(String name) { this.name = name; }
    public String getName() { return this.name; }
    public void setDate(String date) { this.date = date; }
    public String getDate() { return this.date; }

    // 객체의 내용을 출력합니다.
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.num).append(" : ");
        sb.append(this.name).append(" : ");
        sb.append(this.date);
        return sb.toString();
    }

    @Override
    public int compareTo(Object board) {

        return this.name.compareTo(((Board) board).name);
    }
}



