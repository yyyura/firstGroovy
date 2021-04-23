println("Hello, Groovy!")

int x1 = 104;
System.out.println(x1);
//x = "Guru99"; - Cannot cast object

def x2 = 104
println x2.getClass()
x2 = "Guru99"
println x2.getClass()
/*Groovy supports Dynamic Typing.
Variables are defined using the keyword "def,"
and the type of a variable does not need to be declared in advance.
The compiler figures out the variable type at runtime
and you can even change the variable type*/
