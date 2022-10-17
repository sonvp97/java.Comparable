import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

//        System.out.println(new Student(3, "n4m", 23, "12 to van").compareTo(new Student(4, "nam", 23, "12 to van")));
//        System.out.println(new Student("b").compareTo(new Student("a")));
//        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        Student[] students = {new Student(3, "will", 24, "12 to van"),new Student(4, "nam", 23, "12 to van")};
        StudentNameComparator studenTNAMEComparator = new StudentNameComparator();
        java.util.Arrays.sort(students, studenTNAMEComparator);
        for (Student s : students)
            System.out.print(s + "\n");
//        System.out.println();
//        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"),
//
//                new BigInteger("432232323239292"),
//
//                new BigInteger("54623239292")};
//
//        java.util.Arrays.sort(hugeNumbers);
//
//        for (BigInteger number : hugeNumbers)
//            System.out.print(number + " ");


    }
}