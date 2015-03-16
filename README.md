# clacks-filter
GNU Terry Pratchett Clacks Filter for Java Web Applications

Usage:

Copy the ClacksFilter.java file into your application.


In your web.xml file place the following XML:


```xml
<filter>
    <filter-name>ClacksFilter</filter-name>
    <filter-class>org.mcinroy.clacks.ClacksFilter</filter-class>
</filter>
<filter-mapping>
    <filter-name>ClacksFilter</filter-name>
    <url-pattern>/*</url-pattern>
</filter-mapping>
```

The X-Clacks-Overhead header will now be added by your application.

