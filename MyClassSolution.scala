```scala
class MyClass(val value: Int) {
  def this() = {
    this(0) // Correctly calls the main constructor
  }
}
```