package com.java.Assignment7.inheritance.ifInheritace;

public class InterfaceInheritance extends Concrete {
    public void method1(If1 temp){
        System.out.println("takes if1 object");
    }

    public void method2(If2 temp){
        System.out.println("takes if2 object");
    }

    public void method3(If3 temp){
        System.out.println("takes if3 object");
    }

    public void method4(BaseIf temp){
        System.out.println("takes BaseIf object");
    }
}
