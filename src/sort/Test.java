package sort;

import java.util.*;

class Tset{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        list.add(new Student("a", 5));
        list.add(new Student("b", 10));
        list.add(new Student("c", 1));
        list.add(new Student("d", 30));
        list.add(new Student("e", 40));

//        System.out.println(list);
        Collections.sort(list);
        for (Student s: list) System.out.println(s.getScore());
    }
}

class Student implements Comparable<Student> {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return score;
    }

    public int compareTo(Student s) {
//        System.out.println("s.getScore => " + s.getScore());
        if (this.score < s.getScore()) {
            return -1;
        } else if (this.score > s.getScore()) {
            return 1;
        }
        return 0;
    }
}