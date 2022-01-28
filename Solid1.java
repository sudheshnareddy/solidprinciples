//interface segregation
interface CollegeMembers{
    public void setname(String name);
    public void setid(int id);
}
interface FeeDetails{
    public void gettuitionfee();
    public void getbusfee();
}
class Teacher implements CollegeMembers{
    String name;
    int id;
    public void setname(String name){
        this.name=name;
        System.out.println(name);
    }
    public void setid(int id){
        this.id=id;
    }
}
class Student implements CollegeMembers,FeeDetails{
    String name;
    int id;
    public  void setname(String name){
        this.name=name;
        System.out.println(name);
    }
    public void setid(int id){
        this.id=id;
    }
    public void gettuitionfee(){
        System.out.println("tuition fee 80k");
    }
    public  void getbusfee(){
        System.out.println("bus fee 20k");
    }
}
//liskov subsn
class ExamFeeInfo{
    public void regfeedate(){
        System.out.println("pay fee by Jan");
    }
    public void regfeeprice(){
        System.out.println("pay Rs.1800");
    }
}
class SuppleeFeeInfo extends ExamFeeInfo{
    public void supleefeedate(){
        System.out.println("pay fee by Feb");
    }
    public void supleeprice(){
        System.out.println("pay Rs.1000/subj");
    }
}
class RegStudent extends ExamFeeInfo{
    public RegStudent(){
        super.regfeedate();
        super.regfeeprice();
    }}

class FailedStudent extends SuppleeFeeInfo{
    public FailedStudent(){
        super.regfeedate();
        super.regfeeprice();
        super.supleefeedate();
        super.supleeprice();
    }}
//liskov subsn end
abstract class Calculator{
    public abstract int calc();
}
class Cgpa extends Calculator{
    public int sem1;
    public int sem2;
    public int calc(){
        return (sem1+sem2)/2;
    } }
class Sgpa extends Calculator{
    public int python;
    public int java;
    public int totcredits=10;
    public int calc(){
        return (python+java)/totcredits;
    } }
class SumOfCgpa_Sgpa{
    public int sumofallgpa(Calculator[] array){
        int sum=0;
        for(Calculator arr : array){
            sum+=arr.calc();
        }
        return sum;
    }}
public class Solid1{
    public static void main(String[] args){
        Cgpa c1=new Cgpa();
        c1.sem1=8;
        c1.sem2=6;
        Cgpa c2=new Cgpa();
        c2.sem1=9;
        c2.sem2=7;
        Sgpa s1=new Sgpa();
        s1.python=30;
        s1.java=40;
        Sgpa s2=new Sgpa();
        s2.python=50;
        s2.java=40;
        Calculator[] arr=new Calculator[4];
        arr[0]=c1;
        arr[1]=c2;
        arr[2]=s1;
        arr[3]=s2;
        SumOfCgpa_Sgpa s= new SumOfCgpa_Sgpa();
        System.out.println("sum is"+s.sumofallgpa(arr));
        RegStudent r= new RegStudent();
        FailedStudent f= new FailedStudent();
        Student stu=new Student();
        stu.setname("sudheshna");
        stu.setid(1);
        stu.gettuitionfee();
        Teacher tea=new Teacher();
        tea.setname("faculty");
        tea.setid(66);
    }
}