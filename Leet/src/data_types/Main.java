package data_types;

class Main {
    int a = 123;
    public static void main(String[] args) {
        Main m = new Main();
        m.print();
        m.print1(234);
        m.print();
    }

    public void print(){
        System.out.println(a);
    }

    public void print1(int a){
        System.out.println(a);
        a = 345;
        System.out.println(a);
    }
}