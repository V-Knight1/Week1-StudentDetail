public class StudentDetailsPrint {
    public static void main(String[] args) {
        //print the student list using this class

        Student[] list = new Student[3]; //array of objects delcaration
        Student s1 = new Student();
        s1.setName("sivag");
        s1.setSid(2345);
        Student s2 = new Student();
        s1.setName("siva");
        s1.setSid(234);
        Student s3 = new Student();
        s1.setName("sivagami");
        s1.setSid(25);

        list[0]=s1; //storing objects in an array
        list[1]=s2;
        list[3]=s3;

        for(int i=0; i<list.length; i++){
            System.out.println(list[i].getName() + " " + list[i].getSid());
        }

        System.out.println(s1.Name + " " + s1.sid);
    }
}

