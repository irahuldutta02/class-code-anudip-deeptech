package Test;


import java.util.*;

public class TestQuestion {

public static void main(String args[]) {

List mylist = new ArrayList();

int [] val = {1,2,3,4,5};

for(int i = 0;i<val.length;i++) {

mylist.add(new Integer (val[i]));

}

System.out.println ("Before traversal through an iterator:"+mylist);

Iterator iterator = mylist.iterator( );

while(iterator.hasNext()) {

Integer element = (Integer)iterator.next();

int value = element.intValue();

if((value>4))

iterator.remove();

}

System.out.println ("After traversal through an iterator:"+mylist);

}



}