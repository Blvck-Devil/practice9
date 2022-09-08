public class student{
  private int id;
  private String name;
  private double marks;

  public student(){
    id=1;
    name="Inthi";
    marks=53.1;
  }
    public student(int id,String name,double marks){
    this.id=id;
    this.name=name;
    this.marks=marks;
  }
  public void show(){
    System.out.println("Id:"+this.id);
     System.out.println("name:"+this.name);
     System.out.println("Marks:"+this.marks);
  }
}