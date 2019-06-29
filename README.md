# Java Sandbox

A simple Java applet to document the first steps of running a Java program on a Windows environment.

Based on Caleb Curry's YouTube course [Java Programming Tutorials](https://www.youtube.com/watch?v=2dZiMBwX_5Q&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF). Check out his Github repository [here](https://github.com/CalebCurry/YouTube/tree/master/SignalR).

## Tutorial

### Get Java running on your computer

1. Download and install the JDK exe on Oracle's [Java downloads](https://www.oracle.com/technetwork/java/javase/downloads/index.html) page. (Here is a link to their [docs](https://docs.oracle.com/en/java/javase/12/) page.)

The Java Development Kit (JDK) [includes](https://docs.oracle.com/goldengate/1212/gg-winux/GDRAD/java.htm#BGBFHBEA) the Java Runtime Environment (JRE). Do not download them separately. If you have the JRE already installed from Java's [downloads](https://www.java.com/en/download/manual.jsp) page, uninstall it.

### Add Java support to VS Code

1. In the extensions tab, install "Java Extension Pack" by Microsoft.
1. Run a test program with the following code:

``` java 
public class Test {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
```

(Note: Visual Studio Community does not have Java language support. Alternative IDEs include [Eclipse](https://www.eclipse.org/downloads/packages/) and [NetBeans](https://netbeans.org/).)

### Common Errors

You may have recieved this error:

``` bash
javac : The term 'javac' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the spelling of the name, or if a path was included, verify that the path is 
correct and try again.
```

You need to set the path to your JDK in the Windows Environment Variables to access javac commands in the terminal.

![](https://github.com/king-melchizedek/Java-Sandbox/raw/master/images/set_environment_variables.gif)

If you've received this error:

``` bash
Test has been compiled by a more recent version of the Java Runtime (class file version 56.0), this version of the Java Runtime only recognizes class file versions up to 52.0
```

This indicates a version mismatch. You have compiled your code using the JDK version 12 and your current JRE is version 8. Uninstall your JRE to overcome this error. (Review this [list](https://stackoverflow.com/questions/9170832/list-of-java-class-file-format-major-version-numbers) of Java class files for reference.)

You can always check your version with:

``` bash
java -version
```