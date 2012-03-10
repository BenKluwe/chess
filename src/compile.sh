javac *.java
jar cfm main.jar Manifest.txt *.class
rm *.class
mv main.jar ../bin/
