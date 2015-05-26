Java library for the Sensirion SHT1x sensor
--
Licensed under MIT

Requires that [Java bindings to the C Library for SHT1x sensors](https://github.com/jar349/sht1x) be installed.  Follow the link and install it before using this library.

##Install instructions
####1.  Clone the repository
```bash
$ git clone https://github.com/jar349/sht1x4j.git
```
####2. Compile and package the library
This step requires [Apache Maven](https://maven.apache.org/)
`$ mvn compile package`

####3. Configure java.library.path
This java code uses JNI ([Java Native Interface](http://en.wikipedia.org/wiki/Java_Native_Interface)) to make calls into the C-based [Java bindings to the C Library for SHT1x sensors](https://github.com/jar349/sht1x), which is a shared library (.so file).  In order for your java program to find it, you need to configure your `java.library.path` to include /usr/local/lib.

Since I always roll my Java apps into a fat jar (aka uber jar), I run my program like this:
```bash
$ java -Djava.library.path=/usr/local/lib -jar my-application-1.0.0.jar
```

