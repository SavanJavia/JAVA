package JAVA8;

import Core_Java.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMethod {

    public static void main(String[] args) {

        List<Person> lst = Arrays.asList(new Person("A",1000000),
                new Person("C",1100000),
                new Person("A",1200000),
                new Person("D",1300000));


        List<String> str1 = lst.stream().map(abc->abc.name).filter(a->a.startsWith("A")).distinct().collect(Collectors.toList());
        System.out.println("<1>"+str1);//[A]

        List<String> str2 = lst.stream().map(abc->abc.name).sorted().collect(Collectors.toList());
        System.out.println("<2>"+str2);//[A, A, C, D]

        String str3 = lst.stream().map(abc->abc.name).findFirst().get();
        System.out.println("<3>"+str3);//A

        String str4 = lst.stream().map(abc->abc.name).collect(Collectors.joining("Z,"));
        System.out.println("<4>"+str4);//AZ,CZ,AZ,D


       List<String> str5 =  Stream.concat(lst.stream().map(abc->abc.name), Stream.of("E")).collect(Collectors.toList());
       System.out.println("<5>"+str5);//[A, C, A, D, E]

    }
}
