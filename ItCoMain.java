package Day7.collections;

import java.util.*;

public class ItCoMain {
    public static void main(String[] args) {
        // Iterable 또는 Collection 또는 List 또는 Set
        // 전부 순회 가능 하다.
        // List 와 Set 둘 다 Iterable이다 서로 바꾸기 가능
        List<String> skillList = new ArrayList<>();
        skillList.add("Java");
        skillList.add("git");
        skillList.add("md");
        skillList.add("python");
        skillList.add("aws");
        skillList.add("Linux");
        for (String skill : skillList) {
            System.out.println(skill);
            // 순회 중 제거하면 예외가 발생할 수 있다.
//            skillList.remove("python");
        }
        System.out.println("==============");
        //Iterator
        Iterator<String> iter = skillList.iterator();
        while (iter.hasNext()) {
            String skill = iter.next();
            System.out.println(skill);
            // iter.remove를 쓰면 순회 중 제거 가능
            if ("python".equals(skill)){
                iter.remove();
            }
        }
        System.out.println(skillList);


        List<String> listCollection = new ArrayList<>();
        Set<String> setCollection = new HashSet<>();
        // list의 컬렉션 메서드들
        System.out.println(listCollection.size());
        System.out.println(listCollection.isEmpty());
        System.out.println(listCollection.contains(""));
        System.out.println(listCollection.containsAll(setCollection));
        // Set의 Collection 메서드들
        System.out.println(setCollection.size());
        System.out.println(setCollection.isEmpty());
        System.out.println(setCollection.contains(""));
        System.out.println(setCollection.containsAll(listCollection));

        System.out.println("=========================");
        // Collection의 문서를 보면
        // Collection 인터페이스를 구현하는 클래스는
        // 1. 아무것도 없는 기본 생성자와
        // 2. 다른 Collection을 받아 그 모든 원소를 가지는 생성자를 만들어 마땅하다.
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        Set<String> setNoDups = new HashSet<>(listWithDuplicates);
        System.out.println(setNoDups);
    }
}
