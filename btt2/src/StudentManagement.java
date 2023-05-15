public class StudentManagement {
    // thuoc tinh mang students co toi da 100 phan tu
    public Student[] students=new Student[100];
    // bien luu size cua mang sutuden
    public int size =0;
    // phuong thuc kiem tra 2 sv co cung 1 group khong
    public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }
    // phuong thuc them 1 sv vao mang students
    public void addStudent(Student newStudent){
        this.students[size]=newStudent;
        this.size++;
    }
    // phuong thuc in ra danh sach sinh vien theo group
    public String studentsByGroup() {
        String list = "";
        list+=this.students[0].getGroup()+"\n";
        list+=this.students[0].getinfo()+"\n";
        for (int i = 1; i < size; i++) {
            if ( this.students[i].getGroup() != this.students[i - 1].getGroup()) {
                list += this.students[i].getGroup() + "\n";
            }
            list += this.students[i].getinfo() + "\n";
        }
        return list;
    }
    // xoa sinh vien ra khoi danh sach theo id
    public void removeStudent(String id){
        for(int i=0;i<size;i++){
            if(this.students[i].getId().equals(id)){
                for(int j=i;j<size-1;j++){
                    this.students[j]=this.students[j+1];
                }
                this.size--;
            }
        }
    }

}
