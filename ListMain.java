package Day7.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMain {
    public static void main(String[] args) {
        // List는 인터페이스다.

        // ArrayList: 배열을 관리해주는 Collection - List
        List<String> names = new ArrayList<>();

        // 리스트에 넣기
        names.add("Alex");  // 비어있고
        names.add("Brad");  // 1칸 차있고
        names.add("Dave");  // 2칸 차있고
        names.add("Eric");

        // 데이터 회수
        System.out.println(names.get(0));
        System.out.println(names.get(2));

        // 중간에 넣기
        names.add(2, "Chad");
        System.out.println(names);
        names.add("Fred");

        // 데이터 위치 찾기
        System.out.println("Chad is at: " + names.indexOf("Chad"));

        // 데이터 위치 찾기 없을 경우
        System.out.println("Greg is at: " + names.indexOf("Greg"));

        System.out.println("--------------------------");
        // 데이터 제거하기
        System.out.println(names.remove(3));    // 순서를 기준으로
        System.out.println(names.remove("Eric"));  // 값을 기준으로 boolean으로 반환
        System.out.println(names.remove("Eric"));  // 값을 기준으로 찾는데 실패

        // List<??> 원시타입은 못쓴다. ex) int, double
        // List<int> intList = new ArrayList<>();
        // 대신 Wrapper 사용 가능 ex) Integer, String, Double
        List<Integer> intList = new ArrayList<>();
        intList.add(123);
        intList.add(10);
        intList.add(20);
        intList.add(439);
        System.out.println(intList);

        // 순서로 제거할 때
        System.out.println(intList.remove(1));
        System.out.println("- - - - - - - - - -");
        // 값으로 제거할 때
        System.out.println(intList.remove(Integer.valueOf(20))); // boolean으로 반환

        ArrayList<Integer> intArrayList = new ArrayList<>();
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        sum(intArrayList);
        sum(intLinkedList);
        System.out.println("=============================");

        // Scanner와 List
        // 엔터로 구분된 입력이 임의의 횟수만큼 이뤄진다.
        // Q 가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
        // 여태까지 입력했던 데이터를 순서대로 출력하시오
        // List.size()

        Scanner sc = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();

        while (true) {
            String input = sc.nextLine();
            // "q"가 입력시 반복(입력) 종료
            if ("q".equals(input)) break;
            inputList.add(input);
        }
        // 출력 방법 1
        for (int i = 0; i < inputList.size(); i++) {
            System.out.println(inputList.get(i));
        }

        // 출력 방법 2
        for (String input : inputList) {
            System.out.println(input);
        }


        }




    // 매개변수로 전달할 때는 기능을 중요시하는 interpace 기준으로 매개변수 선언
    public static int sum(List<Integer> intList) {
        int sum = 0;
        return sum;
    }

    // 구현을 중시하는 형식으로 요규를 하면 기능적 측면의 차이가 없는
    // 클래스는 하나도 못 쓴다.
//    public static int sum(ArrayList<Integer> intList) {
//        return 0;
//    }
}