
public class Dog implements Comparable<Dog>{
    String color;
    int size;
    Dog(String c){
        color = c;
    }
    Dog(String c,int s){
        color = c;
        size = s;
    }
    public boolean equals(Object o){
        return ((Dog)o).color.equals(this.color);
    }
    public int hashCode(){
       return color.length();
    }
    public String toString(){
        return color + " dog";
    }

    public int compareTo(Dog o) {
        return o.size -this.size;
    }
}

