package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;
import ru.stqa.pft.sendbox.Square;

public class SquareTests {

    @Test
    public void testArea(){
        Square s = new Square(5);
        assert s.area() == 25;
    }
}
