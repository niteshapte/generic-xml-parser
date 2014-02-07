generic-xml-parser
==================

Generic XML Parser using SAX in Java

Idea is to pass the name of the nodes and get its values. I will be using SAX parser for this and a third party API called Guava from Google. One extra functionality in this code is to get the names of node based on some pattern or just say regular expression.

I hope this will save a lot of time. No need to convert to POJO and then retrieve the values. Just create a String[] with name of nodes and pass it to parseDocument method.
