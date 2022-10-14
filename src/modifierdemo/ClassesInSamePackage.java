//package modifierdemo;
//
//public class ClassesInSamePackage {
//    // empty class
//}
//
//class ClassA extends ModifierDemo {
//    public void printMessages() {
//        // allowed
//        System.out.println(publicNum);
//
//        // allowed
//        System.out.println(protectedNum);
//
//        // allowed
//        System.out.println(packagePrivateNum);
//
//        // NOT allowed
//        System.out.println(privateNum);
//    }
//}
//
//class ClassB {
//    public void printMessages() {
//        ModifierDemo p = new ModifierDemo();
//        // allowed
//        System.out.println(p.publicNum);
//
//        // allowed
//        System.out.println(p.protectedNum);
//
//        // allowed
//        System.out.println(p.packagePrivateNum);
//
//        // NOT allowed
//        System.out.println(p.privateNum);
//    }
//}
