public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Serkan Teacher","HTR","345");
        Teacher t2=new Teacher("Nihal Teacher","PHS","678");
        Teacher t3=new Teacher("Ozan Teacher","BIO","910");

        Course history=new Course("History","101","HTR");
        history.addTeacher(t1);

        Course physics=new Course("Physics","101","PHS");
        physics.addTeacher(t2);

        Course biology=new Course("Biology","101","BIO");
        biology.addTeacher(t3);

        Student s1=new Student("Ayda","123","4",history,physics,biology);
        s1.addBulkExamNote(80,70,60);
        s1.addBulkAddVerbalGrade(90,100,80);
        s1.isPass();

        Student s2=new Student("Zeynep","456","4",history,physics,biology);
        s2.addBulkExamNote(30,40,50);
        s2.addBulkAddVerbalGrade(90,100,100);
        s2.isPass();
    }
}