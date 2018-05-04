set projectLocation=E:\Selenium\MavenProject
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause

set projectLocation=E:\Selenium\MavenProject
cd E:\Selenium\MavenProject
set classpath=C:\GitRapo\MyProject\bin;E:\Selenium\MavenProject\Maven Dependencies\*
java org.testng.TestNG E:\Selenium\MavenProject\testng.xml
pause