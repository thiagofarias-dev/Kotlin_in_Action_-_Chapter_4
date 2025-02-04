open class RichButton : Clickable{
    fun disable() {}
    open fun animate() {}
    final override fun click() {} // o modificador final indica que subclasses não poderão sobrescrever esta função

}