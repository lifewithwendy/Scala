object Prac2_1 {
    val m,n:Int = 1;
    var k,i,j:Int = 2;
    val f:Float = 12.0f;
    val g:Float = 4.0f;
    val c:Char = 'X';
    def main(args: Array[String])={
        println(k + 12 * m)
        println(m / j)
        println(n % j)
        println(m / j * j)
        println(f + 10 * 5 + g)
        // ++i //not used
        i += 1  // used 
        println(i * n) 
        // println(++(i * n)) compliation error
    }
}