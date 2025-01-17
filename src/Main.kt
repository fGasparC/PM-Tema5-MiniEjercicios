import kotlin.math.sqrt


class Point(val x: Double, val y: Double) {

    infix fun distancia(otro: Point): Double {
        val dx = this.x - otro.x
        val dy = this.y - otro.y
        return sqrt(dx * dx + dy * dy)
    }
}
class Person (var name: String = "",
              var age: Int = 0,
              var address: String = ""){
    override fun toString(): String {
        return "Person(nombre='$name', edad=$age, direccion='$address')"
    }
}
fun main() {
    //1. Escribe una función que tome una cadena
    //como parámetro e imprima su longitud./*
    println("Ejercicio 1")
    imprimeLongitudCadena("hola")
    //2. Comparación de Cadenas: Crea dos cadenas y
    //utiliza el método equals para determinar si
    //son iguales.
    println("Ejercicio 2")
    println(comparaCadenas("hola","hOla"))
    //3. Utiliza el método compareTo para comparar
    //dos cadenas y muestra el resultado.
    println("Ejercicio 3")
    println(comparaCadenasv2("hola","hola"))
    //4. Toma una cadena y conviértela
    //completamente a mayúsculas.
    println("Ejercicio 4")
    println(convierteMayusculas("hola"))
    //5. Haz lo mismo, pero esta vez conviértela
    //completamente a minúsculas.
    println("Ejercicio 5")
    println(convierteMinusculas("HOLA"))
    //6. Toma una cadena con espacios al principio y al
    //final. Utiliza trim para eliminar esos espacios.
    println("Ejercicio 6")
    println(eliminaEspacios("                hola             "))
    //7. Dada una cadena larga, extrae una subcadena
    //de la posición 5 a la 10.
    println("Ejercicio 7")
    println(extraeSubCadenas("holaholaholaholahola"))
    //8. Reemplaza todas las ocurrencias de un cierto
    //carácter en una cadena con otro carácter.
    println("Ejercicio 8")
    println(remplazaCadenas("hola hola hola", "a", "f"))
    //9. Divide una cadena en un array de subcadenas
    //utilizando un carácter específico como separador.
    println("Ejercicio 9")
    val lista= divideCadenas("Hola, que tal, buenas", ",")
    for (i in lista) {
        println(i.trim())
    }
    //10. Crea dos cadenas y únelas usando el operador
    //+.
    println("Ejercicio 10")
    val str1="hola"
    val str2="holita"
    println(str1 + str2)
    //11. Crea una cadena de formato que incluya
    //marcadores de posición y luego rellenarlos con
    //valores.
    println("Ejercicio 11")
    val strFormatear="Hola me llamo %s y tengo %d años"
    println(strFormatear.format("Manolo", 65))
    //12. Utiliza substring para extraer una parte de una
    //cadena, especificando los índices de inicio y final.
    println("Ejercicio 12")
    val texto="FFFFFFFFFFFSDFSDF"
    println(texto.substring(3,5))
    //Operaciones con Nullable:
    //13. Define dos variables a y b con valores nulos e intenta
    //realizar operaciones matemáticas (suma, resta,
    //multiplicación) con ellas. Maneja adecuadamente los casos
    //de valores nulos.
    println("Ejercicio 13")
    val a: Int? = null
    val b: Int? = null
    
    val suma = (a ?: 0) + (b ?: 0)
    val resta = (a ?: 0) - (b ?: 0)
    val multi = (a ?: 0) * (b ?: 0)
    val div = if (b != null && b != 0) (a ?: 0) / b else "No se puede dividir entre cero"
    
    println("Suma: $suma")
    println("Resta: $resta")
    println("Multiplicacion: $multi")
    println("Division: $div")
    //Operador Elvis:
    //14. Utiliza el operador elvis (?:) para asignar un valor
    //predeterminado a una variable si esta es nula.
    println("Ejercicio 14")
    val variable = suma ?: 0
    println(suma)
    //Seguridad con Smart Cast:
    //Manejo de Excepciones:
    //15. Crea una función que tome un parámetro de tipo Any y
    //comprueba si es de tipo String. Si es así, imprime su longitud.
    //Utiliza smart cast para trabajar de manera segura con el tipo.
    println("Ejercicio 15")
    compruebaTamIfString("manolo escobar")
    // Manejo de Excepciones
    //16. Escribe una función que divida dos números ingresados
    //por el usuario. Implementa el manejo de excepciones para el
    //caso en que el divisor sea cero o si se ingresa un valor no
    //numérico.
    println("Ejercicio 16")
    println(operaOperadores(5,0))
    //Operador de Lectura Segura (readLine):
    //17. Utiliza readLine() para leer una entrada del usuario. Asegúrate
    //de manejar el caso en que el usuario ingrese algo que no pueda
    //convertirse a un tipo específico.
    println("Ejercicio 17")
    println("Por favor, ingresa un número")
    val input = readLine()
    try {
        val numero = input?.toInt()
        println("Has ingresado el número: $numero")
    } catch (e: NumberFormatException) {
        e.printStackTrace()
    }
    //Operadores Matemáticos:
    //18. Crea una función que acepte dos números y realice operaciones
    //matemáticas básicas (suma, resta, multiplicación, división). Maneja
    //casos especiales, como la división por cero.
    println("Ejercicio 18")
    insertaCalculaNumeros()
    //Casting Seguro e Inseguro:
    // 19. Declara una variable de tipo Any y realiza un casting seguro e
    //inseguro a otros tipos. Maneja los casos donde el casting inseguro
    //podría generar una excepción.
    println("Ejercicio 19")
    var c: Any= "Bartolo"
    println(c)
    val cSeguro: Char?=c as? Char
    println(cSeguro)
    try{
    val cInseguro:Char=c as Char
        println(cInseguro)
    }catch (e: Exception){
        e.printStackTrace()
    }
    //Uso de try, catch y finally:
    //20. Escribe un bloque try que contenga código propenso a errores.
    //En el bloque catch, maneja las excepciones y, en el bloque finally,
    //imprime un mensaje independientemente de si se lanzó una
    //excepción o no.
    println("Ejercicio 20")
    try{
        println("Introduce un numero o excepcionara")
        val a=readLine()!!.toInt()
    }catch (e: Exception){
        e.printStackTrace()
    }finally {
        println("Si no has introducido un numero deberia haber saltado una excepcion")
    }
    //21. Infix Functions:
    //Crea una clase Point con propiedades x e y. Implementa una función infix
    //que calcule la distancia entre dos puntos.
    println("Ejercicio 21")
    val punto1 = Point(3.0, 4.0)
    val punto2 = Point(0.0, 0.0)

    val distancia = punto1 distancia punto2
    println("La distancia entre los puntos es: $distancia")
    // 22. Lazy y Lateinit:
    // Define una variable lazy que almacene la suma de dos números. La suma
    //debe calcularse solo cuando se accede a la variable. Luego, usa lateinit para
    //inicializar una variable de tipo String antes de asignarle un valor.
    println("Ejercicio 22")
    val sumita by lazy {
        println("Calculando la suma")
        val num1 = 5
        val num2 = 10
        num1 + num2
    }
    println("La sumita es $sumita")
    lateinit var mensajito:String
    mensajito="Hola soy un mensajito lateinit"
    println(mensajito)
    // 23. With:
    // Utiliza la función with para configurar un objeto StringBuilder. Agrega tres
    //líneas de texto al objeto y luego imprime el resultado.
    println("Ejercicio 23")
    val resultado = with(StringBuilder()) {
        append("1 Macarrones\n")
        append("2 Coches\n")
        append("3 Perros\n")
        toString()
    }
    println(resultado)
    //24. Apply:
    //Crea una clase Person con propiedades como name, age, y address. Utiliza
    //la función apply para construir una instancia de Person con valores
    //específicos.
    println("Ejercicio 24")
    val persona = Person().apply {
        name = "Bartola"
        age = 53
        address = "Yoquese 1, Madrid"
    }
    println(persona.toString())
    // 25. Run:
    // Define una función calculateArea que toma la longitud y el
    //ancho de un rectángulo y devuelve su área. Luego, utiliza run
    //para imprimir el área de un rectángulo específico.
    println("Ejercicio 25")
    val area=run{
        val a=10.0
        val b=300.30
        calculaArea(a,b)
    }
    println("El área del rectángulo es: $area")

    //26. Let:
    // Declara una cadena nullable y utiliza la función let para
    //imprimir su longitud solo si no es nula.
    println("Ejercicio 26")
    val cadena: String? = "aaaaaaaaaaaaaaaaaaaaaa"
    cadena?.let {
        println("La longitud de la cadena es: ${cadena.length}")
    }

    //27. Also:
    //Crea una lista de números y utiliza la función also para
    //imprimir un mensaje antes y después de aplicar una
    //operación a cada elemento de la lista
    println("Ejercicio 27")
    val numeros = listOf(1, 2, 3, 4, 5)

    numeros.map { it * 2 }
        .also {
            println("Antes de la operación, la lista es: $numeros")
        }
        .also {
            println("Después de la operación, la nueva lista es: $it")
        }
        }
//Ejercicio 1
fun imprimeLongitudCadena(str: String) {
    println(str.length)
}
//Ejercicio 2
fun comparaCadenas(str1: String, str2: String): Boolean {
    return str1.equals(str2)
}
//Ejercicio 3
fun comparaCadenasv2(str1: String, str2: String): Int {
    return str1.compareTo(str2)
}
//Ejercicio 4
fun convierteMayusculas(str: String): String {
    return str.uppercase()
}
//Ejercicio 5
fun convierteMinusculas(str: String): String {
    return str.lowercase()
}
//Ejercicio 6
fun eliminaEspacios(str: String): String {
    return str.trim()
}
//Ejercicio 7
fun extraeSubCadenas(str: String): String {
    return str.substring(5,10)
}
//Ejercicio 8
fun remplazaCadenas(str: String, strRemplazar: String, strRemplazado: String): String {
    return str.replace(strRemplazar,strRemplazado)
}
//Ejercicio 9
fun divideCadenas(str:String, delimitador: String): List<String> {
    return str.split(delimitador)
}
//Ejercicio 15
fun compruebaTamIfString(any: Any){
    if (any is String){
        println(any.length)
    }
}
//Ejercicio 16
fun operaOperadores(a: Int, b: Int): Int? {
    try{
        return (a/b)
    }catch (e: ArithmeticException){
        e.printStackTrace()
    }
    return null
}
//Ejercicio 18
fun insertaCalculaNumeros(){

    try{
        println("Introduce un numero")
        val a=readLine()!!.toInt()
        println("Introduce otro numero")
        val b=readLine()!!.toInt()
        println("Suma = ${a+b}")
        println("Resta= ${a-b}")
        println("Multiplicacion= ${a*b}")
        println("Division= ${a/b}")
    }
    catch(e: Exception){
        e.printStackTrace()
    }
}
//Ejercicio 25
fun calculaArea(a: Double, b: Double): Double {
    return a * b
}