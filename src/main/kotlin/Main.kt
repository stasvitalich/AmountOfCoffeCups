fun main() {
    println("Write how many ml of water the coffee machine has:")
    val mlWater = readln().toInt()
    println("Write how many ml of milk the coffee machine has:")
    val mlMilk = readln().toInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    val gramsCoffee = readln().toInt()
    println("Write how many cups of coffee you will need:")
    val cupsCoffee = readln().toInt()


    var cupsByWater = mlWater / 200
    var cupsByMilk = mlMilk / 50
    var cupsByCoffee = gramsCoffee / 15

    //println("I have $mlWater of water and I can make $cupsByWater cups from using water")
    //println("I have $mlMilk of milk and I can make $cupsByMilk cups from using milk")
    //println("I have $gramsCoffee of coffee and I can make $cupsByCoffee cups from using coffee")

    // println("You need: $cupsCoffee cups of coffee")

    if (cupsByWater <= cupsByMilk && cupsByWater <= cupsByCoffee) {
        //println("In total I can make $cupsByWater cups of coffee")
        if (cupsByWater == cupsCoffee) {
            println("Yes, I can make that amount of coffee")
        } else if (cupsCoffee > cupsByWater) {
            println("No, I can make only $cupsByWater cups of coffee")
        } else if (cupsCoffee < cupsByWater) {
            println("Yes, I can make that amount of coffee (and even ${cupsByWater - cupsCoffee} more than that)")
        }
    } else if (cupsByMilk <= cupsByWater && cupsByMilk <= cupsByCoffee) {
        //println("In total I can make $cupsByMilk cups of coffee")
        if (cupsByMilk == cupsCoffee) {
            println("Yes, I can make that amount of coffee")
        } else if (cupsCoffee > cupsByMilk) {
            println("No, I can make only $cupsByMilk cups of coffee")
        } else if (cupsCoffee < cupsByMilk) {
            println("Yes, I can make that amount of coffee (and even ${cupsByMilk - cupsCoffee} more than that)")
        }
    } else if (cupsByCoffee <= cupsByWater && cupsByCoffee <= cupsByMilk) {
        //println("In total I can make $cupsByCoffee cups of coffee")
        if (cupsByCoffee == cupsCoffee) {
            println("Yes, I can make that amount of coffee")
        } else if (cupsCoffee > cupsByCoffee) {
            println("No, I can make only $cupsByCoffee cups of coffee")
        } else if (cupsCoffee < cupsByCoffee) {
            println("Yes, I can make that amount of coffee (and even ${cupsByCoffee - cupsCoffee} more than that)")
        }
    }


    //if (cupsByWater == 0 || cupsByMilk == 0 || cupsByCoffee == 0) {
    //    println("No, I can make only 0 cups of coffee")
    //}


    // else if (cupsByMilk <= cupsByCoffee && cupsByMilk <= cupsByWater)
    //    println("In total I can make $cupsByMilk cups of coffee")
    // else if (cupsByCoffee <= cupsByMilk &&)

    //var possibleCupsAmounts
    // 400 воды, 100 молока, 40 кофе
    // По воде: 2 ст. (600 / 200 = 3)
    // По молоку: 2 ст. (500 / 50 = 10)
    // По кофе: 2 ст. (40 / 15 = 2)


    // На одну чашку нам надо: 200 воды, 50 молока, 15 кофе
}