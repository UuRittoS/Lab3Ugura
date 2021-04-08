 rm -rf bin/
  2 mkdir bin/
  3 javac -d bin -classpath lib/* -sourcepath src src/com/company/Main.java
  4 jar cfm Lab3Ugura.jar MANIFEST.MF -C bin/ .
  5 java18 -jar Lab3Ugura.jar
