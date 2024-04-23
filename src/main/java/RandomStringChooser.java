import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList<String> a;
  public RandomStringChooser(String[]b){
    a = new ArrayList<String>();
    for (int i =0; i<b.length; i++){
      a.add(b[i]);
    }
  }
  public String getNext(){
    if (a.size()==0){
      return "NONE";
    }
    int rand = (int)(Math.random()*a.size());
    String e = a.get(rand);
    a.remove(rand);
    return e;
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
