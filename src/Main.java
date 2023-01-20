public class Main {
    public static void main(String[] args) {
        Programmer programmer=new Programmer();
        Dancer dancer= new Dancer();
        Singer singer=new Singer();
       Person[]person=new Person[]{programmer,dancer,singer};
        for (Person p:person){
            if(p instanceof Programmer){
                ((Programmer)p).walk();
            }else if(p instanceof Dancer){
                ((Dancer)p).walk();
            }else if(p instanceof Singer){
                ((Singer)p).walk();
            }
        }
    }
}