package com.syntax.class17;

class SyntaxEmployee  {

    String empId;
    double salary;
    static String CEO="Sumair";





    public static void main(String[] args) {

        SyntaxEmployee aselsObject=new SyntaxEmployee();
        aselsObject.empId="123";
        aselsObject.salary=200000;
        System.out.println(aselsObject.empId);
        System.out.println(aselsObject.salary);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee mozzamObject=new SyntaxEmployee();
        mozzamObject.empId="456";
        mozzamObject.salary=198000;
        System.out.println(mozzamObject.empId);
        System.out.println(mozzamObject.salary);
        System.out.println(SyntaxEmployee.CEO);


    }
}
