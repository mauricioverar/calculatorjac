
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running cl.mauriciovera.CalculadoraTest
[ERROR] Tests run: 4, Failures: 0, Errors: 4, Skipped: 0, Time elapsed: 0.040 s <<< FAILURE! -- in cl.mauriciovera.CalculadoraTest
[ERROR] cl.mauriciovera.CalculadoraTest.testSumar -- Time elapsed: 0.020 s <<< ERROR!
java.lang.Error:
Unresolved compilation problem:
        The method sumar(int, int) is undefined for the type Calculadora

        at cl.mauriciovera.CalculadoraTest.testSumar(CalculadoraTest.java:10)
        at java.base/java.lang.reflect.Method.invoke(Method.java:569)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)

[ERROR] cl.mauriciovera.CalculadoraTest.testMultiplicar -- Time elapsed: 0 s <<< ERROR!
java.lang.Error:
Unresolved compilation problem:
        The method multiplicar(int, int) is undefined for the type Calculadora

        at cl.mauriciovera.CalculadoraTest.testMultiplicar(CalculadoraTest.java:22)
        at java.base/java.lang.reflect.Method.invoke(Method.java:569)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)

[ERROR] cl.mauriciovera.CalculadoraTest.testDividir -- Time elapsed: 0.002 s <<< ERROR!
java.lang.Error:
Unresolved compilation problem:
        The method dividir(int, int) is undefined for the type Calculadora

        at cl.mauriciovera.CalculadoraTest.testDividir(CalculadoraTest.java:28)
        at java.base/java.lang.reflect.Method.invoke(Method.java:569)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)

[ERROR] cl.mauriciovera.CalculadoraTest.testRestar -- Time elapsed: 0.002 s <<< ERROR!
java.lang.Error:
Unresolved compilation problem:
        The method restar(int, int) is undefined for the type Calculadora

        at cl.mauriciovera.CalculadoraTest.testRestar(CalculadoraTest.java:16)
        at java.base/java.lang.reflect.Method.invoke(Method.java:569)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)

[INFO]
[INFO] Results:
[INFO]
[ERROR] Errors:
[ERROR]   CalculadoraTest.testDividir:28  Unresolved compilation problem:
        The method dividir(int, int) is undefined for the type Calculadora

[ERROR]   CalculadoraTest.testMultiplicar:22  Unresolved compilation problem:
        The method multiplicar(int, int) is undefined for the type Calculadora

[ERROR]   CalculadoraTest.testRestar:16  Unresolved compilation problem:
        The method restar(int, int) is undefined for the type Calculadora

[ERROR]   CalculadoraTest.testSumar:10  Unresolved compilation problem:
        The method sumar(int, int) is undefined for the type Calculadora

[INFO]
[ERROR] Tests run: 4, Failures: 0, Errors: 4, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.330 s
[INFO] Finished at: 2025-07-10T17:49:40-04:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.1.2:test (default-test) on project calculatorjac:
[ERROR]
[ERROR] Please refer to C:\Users\mvera\Documents\Java\mis_ejercicios\calculatorjac\target\surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
