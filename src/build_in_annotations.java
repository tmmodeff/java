import com.sun.jdi.InterfaceType;

import java.util.ArrayList;
public class Main {       //build-in-annotions
    public static void main(String[] args) {
        //1 --OVERRIDE
        class animal {

            public void voice (){
                System.out.println("ANIMALSS ");
            }
        }
        class dog extends animal {
            @Override
            public void voice(){
                System.out.println("Bark");
            }
        }
        dog dd=new dog();
        dd.voice();

//2 --deprecated
    class demo {
        @Deprecated
        void oldMethod(){
                    System.out.println("old method");
        }
    }
    demo aa= new demo();
    aa.oldMethod();

    //3 --SuppressWarnings
        class example3{
            @SuppressWarnings("unchecked")
            void demo1(){
                ArrayList list= new ArrayList();
                list.add("aditya");
                list.add(100);
                System.out.println(list);

            }
        }
        example3 ee=new example3();
        ee.demo1();
    //3 --    FunctionalInterface
        @FunctionalInterface
        interface Message{
            void msg();
        }
        Message ms = () -> System.out.println("hlww");
        ms.msg();
    }
}