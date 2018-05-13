object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var meal_cost = sc.nextDouble();
        var tip_percent = sc.nextInt();
        var tax_percent = sc.nextInt();
        println("The total meal cost is " + totalCost(meal_cost, tip_percent, tax_percent) + " dollars.")
    }

    def totalCost(mealCost: Double, tipPercent: Int, taxPercent: Int): Int = {
        val tip = mealCost * (tipPercent.toDouble / 100)
        val tax = mealCost * (taxPercent.toDouble / 100)
        Math.round(mealCost + tip + tax).toInt
    }
}
