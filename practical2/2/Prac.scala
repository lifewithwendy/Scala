// 2. Use the following declaration and initialization to convert them to
// acceptable Scala statements.
// int a = 2, b = 3, c = 4, d = 5;
// float k = 4.3f;
// and evaluate the following expressions
// a) println( - -b * a + c *d - -);
// b) println(a++);
// c) println (–2 * ( g – k ) +c);
// d) println (c=c++);
// e) println (c=++c*a++);

object Pract {
    var a:Int = 2;
    var b:Int = 3;
    var c = 4;
    var d = 5;
    var k:Float = 4.3f;
    def main(args: Array[String]): Unit = {
        b -= 1
        d -= 1
        println(b * a + c * d);
        println( a += 1 );
        // println (-2 * ( g - k ) +c);// error no g declared
        println (-2 * ( c - k ) +c);
        c += 1
        println(c)
        c += 1
        a += 1
        c=c*a
        print(c)
    }
}