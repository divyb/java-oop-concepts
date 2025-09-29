interface AddListener{
  String addition (String p, String q);
} 
class AddTest implements AddListener{

 public String addition(String a,String b){
  return (Long.parseLong(a)+Long.parseLong(b)+""); //type promoted to Long
//return c+"";  //not required
 }
public static void main(String...args){
System.out.println("----------Divya Kheraj Bhanushali B204----------");
AddTest t =new AddTest();
//String a;   -----not required-----
System.out.println("Add is "+t.addition("21474836470","21474836410"));
}           
};
