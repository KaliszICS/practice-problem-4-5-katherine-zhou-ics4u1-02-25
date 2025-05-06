public class Student{
    private String name;
    private int age;
    private String studentNumber;

    public Student(String name, int age, String studentNumber){
        this.name= name;
        this.age= age;
        this.studentNumber= studentNumber;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getStudentNumber(){
        return studentNumber;
    }

    public String toString(){
        return thisname+","+this.age+"-"+this.studentNumber;
    }

    public boolean equals(Object obj){
        Student student = (Student)obj;
        if (student.getStudentNumber().equals(this.studentNumber)){
            return true;
        }
        return false;

    }
}