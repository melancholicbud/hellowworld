package inheritancedemo;

public class InheritanceDemo {
    public static void main(String[] args) {
        NormalMember mem1 = new NormalMember("James", 1, 2010);
        VIPMember mem2 = new VIPMember("Andy", 2, 2011);

        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();

        mem1.displayMemberInfo();
        mem2.displayMemberInfo();

        mem1.setDiscount();
        mem1.calculateAnnualFee();
        mem1.displayMemberInfo();
    }
}
