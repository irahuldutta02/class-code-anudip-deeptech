package Test;


import java.util.*;

public class qq {

int addAll(List list) {

Iterator it = list.iterator();

int total = 0;

while(it.hasNext()) {

int i = ((Integer)it.next()).intValue();

total =+ i;

}

return total;

}

public static void main(String[] args) {

// TODO Auto-generated method stub

List <Integer> mylist = new ArrayList<Integer>();

mylist.add(2);

mylist.add(3);

qq adder = new qq();

int total = adder.addAll(mylist);

System.out.println(total);

}

}
