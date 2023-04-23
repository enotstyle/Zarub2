package Lesson4.nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21, 4);
    }
}


class Math {
    private int a = 228;


    public void getResult(int delimoe, int delitel) {
//        int delimoe = 21;
        class Delenie {
//            private int delimoe;
//            private int delitel;

//            public int getDelimoe() {
//                return delimoe;
//            }

//            public int getDelitel() {
//                return delitel;
//            }

//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

//            public void setDelitel(int delitel) {
//                this.delitel = delitel;
//            }

            public int getChastmoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                System.out.println(a);
                return delimoe % delitel;
            }
        }

        Delenie d = new Delenie();
//        d.setDelimoe(21);
//        d.setDelitel(4);
        System.out.println(delimoe);
        System.out.println(delitel);
        System.out.println(d.getChastmoe());
        System.out.println(d.getOstatok());
    }
}