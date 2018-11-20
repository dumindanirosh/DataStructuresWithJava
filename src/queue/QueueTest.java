/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author duminda
 */
public class QueueTest {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.studentId = 10;
        s1.studentName = "s1 name";

        Student s2 = new Student();
        s2.studentId = 20;
        s2.studentName = "s2 name";

        
        QueueImplementation<Student> q =new QueueImplementation<Student>(Student.class, 10);
        
        q.enqueue(s1);
        q.enqueue(s2);
        
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        
       Student s[] = q.getQueue(Student.class);
       
        System.out.println(s.length);
        
        for(Student ss : s){
            System.out.println(ss.studentId);
            System.out.println(ss.studentName + "------");
        }
    }
}
