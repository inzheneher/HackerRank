import java.util.Comparator;

class StudentCgpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getCgpa() > o2.getCgpa()) {
            return -1;
        } else if (o1.getCgpa() < o2.getCgpa()) {
            return 1;
        } else return 0;
    }
}
