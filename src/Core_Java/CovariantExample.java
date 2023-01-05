package Core_Java;/*
1) Covariant return type assists to stay away from the confusing type casts in the class hierarchy and
makes the code more usable, readable, and maintainable.

2) In the method overriding, the covariant return type provides the liberty to have more to the point return types.

3) Covariant return type helps in preventing the run-time ClassCastExceptions on return
*/

class A1
{
    A1 foo()
    {
        return this;
    }

    void print()
    {
        System.out.println("Inside the class Core_Java.A1");
    }
}


// Core_Java.A2 is the child class of Core_Java.A1
class A2 extends A1
{
    @Override
    A1 foo()
    {
        return this;
    }

    void print()
    {
        System.out.println("Inside the class Core_Java.A2");
    }
}

// Core_Java.A3 is the child class of Core_Java.A2
class A3 extends A2
{
    @Override
    A1 foo()
    {
        return this;
    }

    @Override
    void print()
    {
        System.out.println("Inside the class Core_Java.A3");
    }
}

public class CovariantExample
{
    // main method  
    public static void main(String argvs[])
    {
        A1 a1 = new A1();

        // this is ok
        a1.foo().print();

        A2 a2 = new A2();

        // we need to do the type casting to make it
        // more clear to reader about the kind of object created
        ((A2)a2.foo()).print();

        A3 a3 = new A3();

        // doing the type casting
        ((A3)a3.foo()).print();

    }
}  