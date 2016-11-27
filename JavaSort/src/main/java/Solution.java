import java.util.*;

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        Comparator<Student> comparator = new StudentCgpaComparator().
                thenComparing(new StudentNameComparator()).
                thenComparing(new StudentIdComparator());
        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(comparator);
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}