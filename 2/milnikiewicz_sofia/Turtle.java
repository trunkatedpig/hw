import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age,speed;

    public void A(String n) {
        setName(n);
        age = 1;
        speed = 5;
    }

    public void B(String n, int s, int a) {
        setName(n);
        setAge(a);
        setSpeed(s);
    }

    public void C() {
        B("Charles",10, 2);

    }
}

