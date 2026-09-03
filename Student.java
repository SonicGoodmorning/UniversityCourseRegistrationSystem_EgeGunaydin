public class Student {
    String name;
    Course[] courses;
    int courseCount;

    public Student(String n){
        this.name = n;
        courses = new Course[5];
        courseCount = 0;
    }



    public void addCourse(Course c){
        if(courseCount >= courses.length){System.out.println("Can't have more than 5 Courses");}
        else{
            courses[courseCount] = c;
            courseCount++;
        }
    }
}
