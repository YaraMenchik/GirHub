//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    sayName( "Ярослав")
    sayAge(  13)
}

fun sayName(name : String){
    println("Привет,$name")
}

fun sayAge(age : Int){
    println("Тебе, $age лет")
}