public class Test {
    public static void main(String[] args) {
        Pan kastrulya=new Pan("kastr1",10.0,13.2);
        Plate tarelka=new Plate("trlk1",3440);
        System.out.println(kastrulya.getName()+"  "+ kastrulya.getDiameter()+" "+kastrulya.height);
        System.out.println(tarelka.getName()+ "  " +tarelka.getcosts());
    }
}