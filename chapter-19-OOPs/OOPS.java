public class OOPS{
    public static void main(String[] args){
        Pen p1 = new Pen(); //create a new Object
        p1.setColor("red");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

//create a new Class
class Pen {
    String color;
    int tip;

    void setColor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newtip) {
       tip = newtip;
    }
}
