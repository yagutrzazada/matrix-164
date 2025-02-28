public class studentService {
    public void findNameById(int id){
        StudentInformation studentInformation=new StudentInformation();
        if (id==studentInformation.getId()){
            System.out.println(studentInformation.getName());
        }
    }
}
