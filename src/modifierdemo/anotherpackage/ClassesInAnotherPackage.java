//package modifierdemo.anotherpackage;
//import modifierdemo.ModifierDemo;
//
//public class ClassesInAnotherPackage {
//    // another empty class
//}
//
//class ClassC extends ModifierDemo {
//    public void printMessages() {
//        // allowed
//        System.out.println(publicNum);
//
//        // allowed
//        System.out.println(protectedNum);
//
//        // NOT allowed
//        System.out.println(packagePrivateNum);
//
//        // NOT allowed
//        System.out.println(privateNum);
//    }
//}
//
//class ClassD {
//    public void printMessages() {
//        ModifierDemo p = new ModifierDemo();
//        // allowed
//        System.out.println(p.publicNum);
//
//        // NOT allowed
//        System.out.println(p.protectedNum);
//
//        // NOT allowed
//        System.out.println(p.packagePrivateNum);
//
//        // NOT allowed
//        System.out.println(p.privateNum);
//    }
//}
