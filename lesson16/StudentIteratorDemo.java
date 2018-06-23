package lesson16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentIteratorDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Petrov","Ivan",
                "45", 5,2));
        studentList.add(new Student("Ivanov","Petr",
                "45",3,3));
        studentList.add(new Student("Shilov","Anton",
                "45",2,1));

        System.out.println(studentList);

        List<Student> transferStudent = createTransferList(studentList);
        System.out.println("Отчислен " + studentList);
        System.out.println("Переведены на следующий курс: " + transferStudent );
    }

    private static  List<Student> createTransferList(List<Student>studentList){
        List<Student> transfer = new ArrayList<>();
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getAverageMark()>=3){
                iterator.remove();
                transfer.add(student);
            }
        }
        return transfer;
    }

}
