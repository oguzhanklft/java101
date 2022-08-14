public class Teacher {
    String name;
    String telno;
    String branch;

    Teacher(String name,String branch,String telno){
        this.name=name;
        this.telno=telno;
        this.branch=branch;
    }

    void print(){
        System.out.println("Name:"+this.name);
        System.out.println("Telephone number:"+this.telno);
        System.out.println("Branch:"+this.branch);
    }

}