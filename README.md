# Native-to-Pinyin

Java utility to convert a text file of Chinese characters into a pinyin form with tone marks in the end of each syllable. 

(using library pinyin4j:   http://pinyin4j.sourceforge.net/)

currently the pinyin will go to standard out as a quick demo.

If you don't want to modify the source code, you can use shell scripting to redirect to a text file, or do batch processing.

<br>

Usage: 

you can use the ConversionN2p.jar file directly with a command line argument (which is the text file consisting of Chinese character texts).

On Unix shell, in the directory that contains this jar file and a text file, for example, do:
```

$java -jar ConversionN2p.jar ./lyrics.txt
```
both of these files (jar and txt) can be found in the InputExp/store directory.

<b>Note</b>: Chinese characters  do not necessarily have one-to-one mapping to pinyin, i.e., in many cases, one character maps to several different pinyin forms (pronunciations). pinyin4j library gives the multiple pinyin output as a Java String array. In most cases the first one is the most frequent one, so the current implementation only gives the first one as the output for simplicity. (To fully use the multiple pronunciation feature of pinyin4j one needs to go beyond unigram language model and use a bi- or tri-gram model (the unit being a character / syllable). 
