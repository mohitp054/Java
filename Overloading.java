public class Overloading{
public String message;
public int value;

public Overloading(String message){
this.message=message;
}

public Overloading(int value, int age){
this.value=value;
this.age=age;
}

public void Overloading1(){
System.out.println("Hey "+this.message);
System.out.println("JearseyNo "+this.value);
System.out.println("Age "+this.age);
}
}