//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //1. Escribe una función que tome una cadena
    //como parámetro e imprima su longitud./*
    imprimeLongitudCadena("hola")
    //2. Comparación de Cadenas: Crea dos cadenas y
    //utiliza el método equals para determinar si
    //son iguales.
    println(comparaCadenas("hola","hOla"))
    //3. Utiliza el método compareTo para comparar
    //dos cadenas y muestra el resultado.
    println(comparaCadenasv2("hola","hola"))
    //4. Toma una cadena y conviértela
    //completamente a mayúsculas.
    println(convierteMayusculas("hola"))
    //5. Haz lo mismo, pero esta vez conviértela
    //completamente a minúsculas.
    println(convierteMinusculas("HOLA"))
    //6. Toma una cadena con espacios al principio y al
    //final. Utiliza trim para eliminar esos espacios.
    println(eliminaEspacios("                hola             "))
    //7. Dada una cadena larga, extrae una subcadena
    //de la posición 5 a la 10.
    println(extraeSubCadenas("holaholaholaholahola"))
    //8. Reemplaza todas las ocurrencias de un cierto
    //carácter en una cadena con otro carácter.
    println(remplazaCadenas("hola hola hola", "a", "f"))
    //9. Divide una cadena en un array de subcadenas
    //utilizando un carácter específico como separador.
    val lista= divideCadenas("Hola, que tal, buenas", ",")
    for (i in lista) {
        println(i.trim())
    }
    //10. Crea dos cadenas y únelas usando el operador
    //+.
    val str1="hola"
    val str2="holita"
    println(str1 + str2)
    //11. Crea una cadena de formato que incluya
    //marcadores de posición y luego rellenarlos con
    //valores.
    val strFormatear="Hola me llamo %s y tengo %d años"
    println(strFormatear.format("Manolo", 65))
    //12. Utiliza substring para extraer una parte de una
    //cadena, especificando los índices de inicio y final.

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