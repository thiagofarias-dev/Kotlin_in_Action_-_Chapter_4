fun main() {
    //example_4_2()
    //example_4_3()
    //example_4_5()
    example_4_7()


}

fun example_4_2(){
    Button().click()
}

fun example_4_3(){
    Button().showOff()
}

fun example_4_5(){
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}

fun example_4_7(){
    val button = RichButton()
    button.showOff()
}