import java.util.Comparator;

class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFname().compareTo(o2.getFname());
    }
}
