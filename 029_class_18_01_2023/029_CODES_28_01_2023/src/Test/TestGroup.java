package Test;

import java.util.*;

class Test {

private static int count = 0;

private String id = "0";

private String interest;

public Test(String interest){ this.interest = interest; this.id = ""

+ ++count;}

public String getInterest(){return interest;}

public void setInterest(String interest){this.interest = interest;}

public String toString(){return id;}

}

public class TestGroup {

String name = "ANU";

TreeSet<Test> set = new TreeSet<Test>();

public void add(Test t) {

if(name.equals(t.getInterest()))set.add(t); }

public static void main(String s[]) {

TestGroup mygroup = new TestGroup();

mygroup.add(new Test("ANU"));

System.out.println("A");

mygroup.add(new Test("ANU"));

System.out.println("B");

System.out.println(mygroup.set);

}

}