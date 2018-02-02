import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {
    @Test
    public void addTest() {

        Calculator c = new Calculator();
        int x = 2;
        int y = 2;
        int expected = 4;



        int actual = c.add(x, y);



        Assert.assertEquals(expected, actual);
    }

    @Test

    public void subtractTest() {
        //given

        Calculator c1 = new Calculator();

        int m = 6;
        int l = 10;

        //when

        int expected = 4;
        int actual = c1.subtract(l, m);

        //then

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void multiplyTest() {

        //given
        Calculator c2 = new Calculator();
        int variable = 2;
        int variable2 = 4;

        //when
        int expected = 8;
        int actual = c2.multiply(variable, variable2);

        //then

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void divideTest() {
        //given

        Calculator c3 = new Calculator();
        int var1 = 6;
        int var2 = 3;

        //when

        int expected = 2;

        int actual = c3.divide(var1, var2);

        //then

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void squareTest() {

        //given
        Calculator c4 = new Calculator();
        int var3 = 4;

        //when

        int expected = 16;

        int actual = c4.square(var3);

        //then

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void squareRootTest() {
        //given
        Calculator c5 = new Calculator();
        int var4 = 16;

        //when
        int expected = 4;
        double actual = c5.squareRoot(var4);

        //then

        Assert.assertEquals(expected, actual,0.0001);

    }

    @Test

    public void exponentsTest(){
        //given
        Calculator c6 = new Calculator();
        double var5 = 2;
        double vari = 3;

        //when

        double expected = 8;
        double actual = c6.exponents(var5, vari);

        //then

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test

    public void sineTest(){
        //given
        Calculator c7 = new Calculator();
        double expected = 0.7071;
        //when


        double actual  = c7.sine(45);

        //then

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test

            public void cosineTest() {


        Calculator c8 = new Calculator();

        double expected = 0.7071;

        double actual = c8.sine(45);


        Assert.assertEquals(expected, actual, .001);
    }

    @Test

    public void tanTest(){

        Calculator c9 = new Calculator();

        double expected = 1.0;

        double actual = c9.tan(45);

        Assert.assertEquals(expected, actual, 0.1);
    }
}
