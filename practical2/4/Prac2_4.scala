// 4. Imagine the owner of a movie theater who has complete freedom in setting
// ticket prices. The more he charges, the fewer the people who can afford tickets.
// In a recent experiment the owner determined a precise relationship between the
// price of a ticket and average attendance.
// At a price of Rs 15.00 per ticket, 120 people attend a performance. Decreasing
// the price by 5 Rupees increases attendance by 20 and increasing the price by 5
// Rupees decreases attendance by 20.
// Unfortunately, the increased attendance also comes at an increased cost. Every
// performance costs the owner Rs.500. Each attendee costs another 3 Rupees.
// The owner would like to know the exact relationship between profit and ticket
// price so that he can determine the price at which he can make the highest profit.
// Implement a functional program to find out the best ticket price.

object Prac2_a{
    def expenses(attendees:Int):Double = {
        val cost = 500 + 3 * attendees
        return cost
    }
    def peopleNo(price:Int) = {
        (120 + (15-price)*20/5) 
    }
    def profit(price:Int):Double = {
        peopleNo(price)*price - expenses(peopleNo(price))
    }
    def main(args: Array[String]) = {
        println("Profit :" + profit(5))
        println("Profit :" + profit(10))
        println("Profit :" + profit(15))
        println("Profit :" + profit(20))
        println("Profit :" + profit(24))//best price closely
        println("Profit :" + profit(25))
        println("Profit :" + profit(30))
        println("Profit :" + profit(35))
    }
}